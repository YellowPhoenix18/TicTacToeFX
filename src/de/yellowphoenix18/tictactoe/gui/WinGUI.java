package de.yellowphoenix18.tictactoe.gui;

import de.yellowphoenix18.tictactoe.logic.GameLogic;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class WinGUI extends GUI {

	public WinGUI(Stage stage) {
		super(stage);
		this.buildGUI();
	}
	
	private void buildGUI() {
		GridPane root = new GridPane();
		root.setVgap(10);
		root.setHgap(10);
		root.setAlignment(Pos.CENTER);
		
		Label label = new Label();
		label.setText(GameLogic.player.getName() + " had won the game!");
		
		Button playGameButton = new Button();
		playGameButton.setText("Back to menu");
		playGameButton.setOnMouseClicked(new EventHandler<MouseEvent>() {
			@Override
			public void handle(MouseEvent event) {
				new MenuGUI(stage);
			}			
		});
		
		GridPane.setConstraints(label, 0, 1);
		GridPane.setConstraints(playGameButton, 0, 2);
				
		root.getChildren().addAll(label, playGameButton);
		
		Scene scene = new Scene(root, 320, 320);
		
		this.stage.setTitle("TicTacToe");
		this.stage.setScene(scene);
		this.stage.show();		
	}

}
