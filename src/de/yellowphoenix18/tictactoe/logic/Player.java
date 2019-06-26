package de.yellowphoenix18.tictactoe.logic;

import javafx.scene.paint.Color;

public enum Player {
	
	PLAYER_1(Color.RED, "Player-1"),
	PLAYER_2(Color.BLUE, "Player-2"),
	PLAYER_NOBODY(Color.GRAY, "Nobody");
	
	private Color color;
	private String name;
	
	Player(Color color, String name) {
		this.color = color;
		this.name = name;
	}
	
	public Color getColor() {
		return this.color;
	}
	
	public String getName() {
		return this.name;
	}
}
