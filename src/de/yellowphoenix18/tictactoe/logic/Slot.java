package de.yellowphoenix18.tictactoe.logic;

import de.yellowphoenix18.tictactoe.gui.MainGUI;
import de.yellowphoenix18.tictactoe.gui.WinGUI;
import javafx.event.EventHandler;
import javafx.scene.input.MouseEvent;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;

public class Slot {
	
	private Rectangle rectangle;
	private Player player;
	
	private MainGUI gui;
	
	public Slot(MainGUI gui) {
		this.gui = gui;
		this.player = Player.PLAYER_NOBODY;
		
		this.rectangle = new Rectangle();
		this.rectangle.setWidth(100);
		this.rectangle.setHeight(100);
		this.rectangle.setFill(Color.GRAY);
		this.rectangle.setOnMouseClicked(new EventHandler<MouseEvent>() {
			@Override
			public void handle(MouseEvent event) {
				selectSlot();
			}	
		});
	}
	
	public Rectangle getRectangle() {
		return this.rectangle;
	}
	
	public Player getPlayer() {
		return this.player;
	}
	
	private void selectSlot() {
		if (this.player == Player.PLAYER_NOBODY) {
			this.rectangle.setFill(GameLogic.player.getColor());
			this.player = GameLogic.player;
			if(GameLogic.checkWin()) {
				new WinGUI(this.gui.getStage());			
				return;
			} else if(GameLogic.slotsFull()) {
				GameLogic.player = Player.PLAYER_NOBODY;
				new WinGUI(this.gui.getStage());			
				return;
			}
			
			// Switch to next Player
			GameLogic.switchPlayer();
		}
	}

}
