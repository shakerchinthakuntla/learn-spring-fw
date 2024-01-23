package com.cspstech.tightcoupling;

public class GameAppExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//var marioGame = new MarioGame();
		
		var superContraGame = new SuperContraGame();
		
		var gameRunner = new GameRunner(superContraGame);  // This gamerunner is light coupled with Marigame
		gameRunner.run();
	}

}
