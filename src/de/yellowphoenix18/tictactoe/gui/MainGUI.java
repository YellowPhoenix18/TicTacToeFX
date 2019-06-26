package de.yellowphoenix18.tictactoe.gui;

import de.yellowphoenix18.tictactoe.logic.GameLogic;
import de.yellowphoenix18.tictactoe.logic.Slot;
import javafx.scene.Scene;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class MainGUI extends GUI {
	
	public MainGUI(Stage stage) {
		super(stage);
		this.generateSlots();
		this.buildGUI();
	}
	
	private void buildGUI() {
		GridPane root = new GridPane();
		root.setVgap(10);
		root.setHgap(10);
		
		for(int x = 0; x < GameLogic.slots.length; x++) {
			for(int z = 0; z < GameLogic.slots[x].length; z++) {
				GridPane.setConstraints(GameLogic.slots[x][z].getRectangle(), x, z);
				
				root.getChildren().add(GameLogic.slots[x][z].getRectangle());				
			}
		}
		
		Scene scene = new Scene(root, 320, 320);
		
		this.stage.setTitle("TicTacToe");
		this.stage.setScene(scene);
		this.stage.show();
	}
	
	private void generateSlots() {
		GameLogic.slots = new Slot[3][3];
		for(int x = 0; x < 3; x++) {
			for(int z = 0; z < 3; z++) {
				GameLogic.slots[x][z] = new Slot(this);
			}
		}
	}

}
