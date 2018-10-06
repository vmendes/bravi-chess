package com.bravi.chess.service.impl;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;

import com.bravi.chess.domain.Board;

public class KnightServiceImplTests {

	private KnightServiceImpl service;

	@Mock
	private Board board;
	
	private String knightPosition = "";
	private Integer turns = 2;

	private String[] possibleMoves;
	
	@Before
    public void setUp() {
		MockitoAnnotations.initMocks(this);
		this.service = new KnightServiceImpl();
    }

	@Test
	public void shouldFindNoMovesWithEmptyBoard() {
		givenBoard(0, 0);
		givenPosition("A1");
		whenFindPossibleMoves();
		thenPossibleMovesIsEmpty();
	}
	
	@Test
	public void shouldFindNoMovesWith2x2Board() {
		givenBoard(2, 2);
		givenPosition("A1");
		whenFindPossibleMoves();
		thenPossibleMovesIsEmpty();
	}
	
	@Test
	public void shouldFindMovesWith3x3Board() {
		givenBoard(3, 3);
		givenPosition("A1");
		whenFindPossibleMoves();
		thenPossibleMovesMatch("A1", "A3", "B3", "C1", "C2");
	}
	
	@Test
	public void shouldFindNoMovesInMiddleWith3x3Board() {
		givenBoard(3, 3);
		givenPosition("B2");
		whenFindPossibleMoves();
		thenPossibleMovesIsEmpty();
	}
	
	@Test
	public void shouldFailWithEmptyBoard() {
		givenBoard(0, 0);
		whenFindPossibleMoves();
		thenPossibleMovesIsEmpty();
	}

	private void givenBoard(Integer rows, Integer cols) {
		Mockito.when(board.getRows()).thenReturn(rows);
		Mockito.when(board.getColumns()).thenReturn(cols);
	}
	
	private void givenPosition(String knightPosition) {
		this.knightPosition = knightPosition;
	}

	private void whenFindPossibleMoves() {
		this.possibleMoves = service.findPossibleMoves(board, knightPosition, turns);
	}

	private void thenPossibleMovesIsEmpty() {
		thenPossibleMovesMatch(new String[0]);
	}
	
	private void thenPossibleMovesMatch(String... moves) {
		Assert.assertArrayEquals(possibleMoves, moves);
	}
}
