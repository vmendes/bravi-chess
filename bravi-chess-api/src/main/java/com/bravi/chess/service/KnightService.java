package com.bravi.chess.service;

import com.bravi.chess.domain.Board;

public interface KnightService {

	String[] findPossibleMoves(Board board, String knightPosition, Integer turns);
}
