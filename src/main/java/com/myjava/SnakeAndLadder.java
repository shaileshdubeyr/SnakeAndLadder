package com.myjava;

public class SnakeAndLadder {
	public static void main(String[] args) {
		int playerStatus= (int)(Math.random() * 2 );
		if(playerStatus == 1 ) {
			int playerPositation = 0;
			System.out.println("the player is playing  positation is "+playerPositation);
		}
		else
			System.out.println("the player is not playing");
	}

}
