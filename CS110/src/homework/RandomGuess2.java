package homework;

import java.util.Random;
import java.util.Scanner;

public class RandomGuess2 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		int numberOfGuesses = 1;
		int randomInt = roll();
		int input;
		
		do {
			System.out.println("Guess a number >> ");
			input = scan.nextInt();
			
			if (input > randomInt) {
				System.out.println("User input is too high.");
				
				numberOfGuesses = numberOfGuesses +1;
			}
			else if (input < randomInt) {
				System.out.println("User input is too low.");
				
				numberOfGuesses = numberOfGuesses +1;
			}
			else {
				System.out.println("You chose correctly.");
			}
		}
		while (randomInt != input);

		System.out.println("The number of guesses is " + numberOfGuesses);
	}
	public static int roll() {
		Random rng = new Random();
		
		return rng.nextInt(5) + 1;
	}
}