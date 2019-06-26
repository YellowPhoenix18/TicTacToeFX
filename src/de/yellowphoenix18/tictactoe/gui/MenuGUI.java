package de.yellowphoenix18.tictactoe.gui;

import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class MenuGUI extends GUI {
	
	public MenuGUI(Stage stage) {
		super(stage);
		this.buildGUI();
	}
	
	private void buildGUI() {
		GridPane root = new GridPane();
		root.setVgap(10);
		root.setHgap(10);
		root.setAlignment(Pos.CENTER);
		
		Button playGameButton = new Button();
		playGameButton.setText("Play game");
		playGameButton.setOnMouseClicked(new EventHandler<MouseEvent>() {
			@Override
			public void handle(MouseEvent event) {
				new MainGUI(stage);
			}			
		});
		
		GridPane.setConstraints(playGameButton, 0, 1);
				
		root.getChildren().addAll(playGameButton);
		
		Scene scene = new Scene(root, 320, 320);
		
		this.stage.setTitle("TicTacToe");
		this.stage.setScene(scene);
		this.stage.show();
	}

}
