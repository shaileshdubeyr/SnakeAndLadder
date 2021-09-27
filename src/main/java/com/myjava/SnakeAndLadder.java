package com.myjava;

public class SnakeAndLadder {
	
	public static void main(String[] args) {
			int positionOfplyer = playerPlayingLadderAndSnake();
			System.out.println("the player positation is " +positionOfplyer);
	}
	static int playerPlayingLadderAndSnake() {
		int playerPositatoion = 0;
		int ladderOrSnakeValue = (int)(Math.random() * 3 );
		System.out.println("the snake ladder "+ladderOrSnakeValue);
		int dieValue= (int)( (Math.random() * 6 ) + 1 );
		System.out.println("the dice value is "+dieValue);			
		if( ladderOrSnakeValue == 1 )
			playerPositatoion= playerPositatoion + dieValue;		
		else if( ladderOrSnakeValue == 2) {
				playerPositatoion = playerPositatoion - dieValue;
				if ( playerPositatoion < 0 )
					playerPositatoion = 0;
		}
		else 
			playerPositatoion = playerPositatoion;
	
		return playerPositatoion;
	}
		
}

