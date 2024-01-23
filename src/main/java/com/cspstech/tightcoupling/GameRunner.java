package com.cspstech.tightcoupling;

public class GameRunner {

	//private MarioGame game;
	
//	public GameRunner(MarioGame game) {
//		this.game = game;
//	}
	
	private SuperContraGame game;

	public GameRunner(SuperContraGame game) {
		this.game = game;
	}

	public void run() {

		System.out.println("Running game: " + game);
		game.up();
		game.down();
		game.left();
		game.right();

	}

}
