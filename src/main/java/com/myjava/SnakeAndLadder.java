package com.myjava;

public class SnakeAndLadder {
	public static void main(String[] args) {
		int playerPositation;
		int diceValue = (int)(Math.random() *7 );
		int playerStatus = (int)( ( Math.random() * 2 ) + 1 );
		if(playerStatus == 1 ) {
			playerPositation = 0;
			System.out.println("the player is playing  positation is "+playerPositation);
		}
		else
			System.out.println("the player is not playing");
		
		playerPositation = diceValue;
	}
}
