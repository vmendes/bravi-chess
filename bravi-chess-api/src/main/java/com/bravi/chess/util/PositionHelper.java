package com.bravi.chess.util;

import com.bravi.chess.domain.Position;

public class PositionHelper {

	public static Position fromString(String string) {
		
		if (string == null || string.length() < 2) {
			return null;
		}
		
		string = string.toUpperCase();

		int x = string.charAt(0) - 'A';
		int y = new Integer(string.substring(1)) -1;

		return new Position(x, y);
	}

	public static String toString(Position position) {

		int x = 'A' + position.getX();
		int y = 1 + position.getY();

		return (char) x + "" + y;
	}
	
}
