package com.cspstech.loosecoupling;

public class GameAppExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		var gameMario = new MarioGame();
		var gameSuperContra = new SuperContraGame();		
		var gameRunner = new GameRunner(gameSuperContra); // Loosed coupled with game interface
		gameRunner.run();
	}

}
