package com.bravi.chess.domain;

public class Board {

	private Integer rows;
	private Integer columns;

	public Board(Integer rows, Integer columns) {
		super();
		this.rows = rows;
		this.columns = columns;
	}

	public Integer getRows() {
		return rows;
	}

	public void setRows(Integer rows) {
		this.rows = rows;
	}

	public Integer getColumns() {
		return columns;
	}

	public void setColumns(Integer columns) {
		this.columns = columns;
	}

}
