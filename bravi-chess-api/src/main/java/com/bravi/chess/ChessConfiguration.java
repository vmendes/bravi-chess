package com.bravi.chess;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;

import com.bravi.chess.domain.Board;

@Configuration
public class ChessConfiguration {

	@Value("${chess.rows:8}")
	private Integer rows;

	@Value("${chess.rows:8}")
	private Integer columns;

	public void setRows(Integer rows) {
		this.rows = rows;
	}

	public void setColumns(Integer columns) {
		this.columns = columns;
	}

	public Board getBoard() {
		return new Board(rows, columns);
	}
}
