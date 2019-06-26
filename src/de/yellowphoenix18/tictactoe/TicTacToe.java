package de.yellowphoenix18.tictactoe;

import de.yellowphoenix18.tictactoe.gui.MenuGUI;
import javafx.application.Application;
import javafx.stage.Stage;

public class TicTacToe extends Application {
	
	public static void main(String[] args) {
		launch(args);
	}

	@Override
	public void start(Stage primaryStage) throws Exception {
		new MenuGUI(primaryStage);
	}

}
