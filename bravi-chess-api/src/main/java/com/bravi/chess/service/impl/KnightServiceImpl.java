package com.bravi.chess.service.impl;

import java.util.Arrays;
import java.util.Collection;
import java.util.HashSet;
import java.util.Set;

import org.springframework.stereotype.Service;

import com.bravi.chess.domain.Board;
import com.bravi.chess.domain.Position;
import com.bravi.chess.service.KnightService;
import com.bravi.chess.util.PositionHelper;

@Service
public class KnightServiceImpl implements KnightService {

	protected final static Collection<Position> POSSIBLE_MOVES = Arrays.asList(
			new Position(-1, 2), new Position(-1, -2),
			new Position(1, 2), new Position(1, -2),
			new Position(-2, 1), new Position(-2, -1),
			new Position(2, 1), new Position(2, -1));

	@Override
	public String[] findPossibleMoves(Board board, String knightPosition, Integer turns) {
		Position position = PositionHelper.fromString(knightPosition);
		Collection<Position> moves = findPossibleMoves(board, position, turns);
		String[] array = moves.stream().map(PositionHelper::toString).sorted().toArray(String[]::new);
		return array;
	}
	
	protected Collection<Position> findPossibleMoves(Board board, Position knightPosition, Integer turns) {
		Set<Position> moves = new HashSet<>();
		addPossibleMoves(moves, board, knightPosition, turns);
		return moves;
	}

	protected void addPossibleMoves(Set<Position> moves, Board board, Position knightPosition, Integer turns) {

		if (turns <= 0 || knightPosition == null) {
			return;
		}

		for (Position position : POSSIBLE_MOVES) {

			int x = knightPosition.getX() + position.getX();
			int y = knightPosition.getY() + position.getY();

			Position newPosition = new Position(x, y);

			if (!moves.contains(newPosition) && x >= 0 && y >= 0 && x < board.getColumns()
					&& y < board.getRows()) {
				moves.add(newPosition);
				addPossibleMoves(moves, board, newPosition, turns - 1);
			}

		}

	}

}
