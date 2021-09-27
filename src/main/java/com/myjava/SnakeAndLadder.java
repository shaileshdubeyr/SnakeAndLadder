package com.myjava;

public class SnakeAndLadder {
	
	public static void main(String[] args) {
			int positionOfplyer = playerPlayingLadderAndSnake();
			System.out.println("the player positation is " +positionOfplyer);
	}
	static int playerPlayingLadderAndSnake() {
		int playerPositatoion = 0;
		int previousPositation;
		int counter=0;
		while(true) {
			int ladderOrSnakeValue = (int)(Math.random() * 3 );
			System.out.println("the snake ladder "+ladderOrSnakeValue);
			int dieValue = (int)( (Math.random() * 6 ) + 1 );
			System.out.println("the dice value is "+dieValue);			
			if ( ladderOrSnakeValue == 1 ) {
				previousPositation = playerPositatoion; 
				playerPositatoion= playerPositatoion + dieValue;
				if ( playerPositatoion > 100 )
					playerPositatoion = previousPositation;
			}
			else if ( ladderOrSnakeValue == 2) {
				playerPositatoion = playerPositatoion - dieValue;
				if ( playerPositatoion < 0 )
					playerPositatoion = 0;
			}
			else 
				playerPositatoion = playerPositatoion;
				if ( playerPositatoion == 100 )
					break;
				
		counter++;
		System.out.println("the positation of the player "+playerPositatoion);
		}
			System.out.println("the total number of time die rolls "+counter);
			return playerPositatoion;
	}
		
}

