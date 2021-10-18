package homework;

import java.util.Scanner;

public class RockPaperScissors {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("rock = 1, paper = 2, scissors = 3");
		
		System.out.print("Player 1: Please choose a whole number between 1 and 3 >> ");
		int player1 = scan.nextInt();
		
		System.out.print("Player 2: Please choose a whole number between 1 and 3 >> ");
		int player2 = scan.nextInt();
		
		final int ROCK = 1;
		final int PAPER = 2;
		final int SCISSORS = 3;
		
		if(player1 == player2) {
			System.out.println("It's a tie.");
		}
		else if(player1 == ROCK && player2 == SCISSORS) {
			System.out.println("Player one wins, rock beats scissors");
		}
		else if(player1 == SCISSORS && player2 == ROCK) {
			System.out.println("Player two wins, rock beats scissors");
		}
		else if(player1 == SCISSORS && player2 == PAPER) {
			System.out.println("Player one wins, scissors beats paper");
		}
		else if(player1 == PAPER && player2 == SCISSORS) {
			System.out.println("Player two wins, scissors beats paper");
		}
		else if(player1 == PAPER && player2 == ROCK) {
			System.out.println("Player one wins, paper beats rock");
		}
		else if(player1 == ROCK && player2 == PAPER) {
			System.out.println("Player two wins, paper beats rock");
		}
		else {
			System.out.println("Error Input");
		}
	}
}