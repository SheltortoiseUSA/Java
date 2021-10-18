package homework;

import java.util.Random;
import java.util.Scanner;

public class RandomGuess {
	
	public static void main(String[] args) {
		Random rng = new Random();
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Please enter a whole number between one and six >> ");
		
		int input = scan.nextInt();
		int randomInt = rng.nextInt(5) + 1;
		
		System.out.println(input);
		System.out.println(randomInt);
		
		if(input > randomInt) {
			System.out.println("You lose, too high.");
		}		
		else if(input < randomInt) {
			System.out.println("You lose, too low.");
		}
		else {
			System.out.println("You win!");
		}
	}
}