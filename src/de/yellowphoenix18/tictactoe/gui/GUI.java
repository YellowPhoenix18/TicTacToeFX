package de.yellowphoenix18.tictactoe.gui;

import javafx.stage.Stage;

public abstract class GUI {
	
	protected Stage stage;
	
	public GUI(Stage stage) {
		this.stage = stage;
	}
	
	public Stage getStage() {
		return this.stage;
	}

}
