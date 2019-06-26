package de.yellowphoenix18.tictactoe.logic;

public class GameLogic {
	
	public static Player player = Player.PLAYER_1;
	public static Slot[][] slots;
	
	public static void switchPlayer() {
		player = player == Player.PLAYER_1 ? Player.PLAYER_2 : Player.PLAYER_1;
	}
	
	public static boolean slotsFull() {
		for(int x = 0; x < slots.length; x++) {
			for(int z = 0; z < slots[x].length; z++) {
				if(slots[x][z].getPlayer() == Player.PLAYER_NOBODY) {
					return false;
				}
			}
		}
		return true;
	}
	
	public static boolean checkWin() {
		for(int x = 0; x < slots.length; x++) {
			boolean winA = true;
			boolean winB = true;
			for(int z = 0; z < slots[x].length; z++) {
				if(slots[x][z].getPlayer() != player) {
					winA = false;
				} 
				if(slots[z][z].getPlayer() != player) {
					winB = false;
				}
			}
			if(winA || winB) {
				return true;
			}
		}
		boolean winA = true;
		boolean winB = true;
		for(int x = 0; x < slots.length; x++) {
			int z = slots[x].length-(x+1);
			if(slots[x][z].getPlayer() != player) {
				winA = false;
			}
			if(slots[z][x].getPlayer() != player) {
				winB = false;
			}
		}
		if(winA || winB) {
			return true;
		}
		return false;
	}

}
