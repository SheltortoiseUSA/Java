package homework;

import java.util.Random;
import java.util.Scanner;

public class Lottery {

	public static void main(String[] args) {
		Random rng = new Random();
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Please enter a number between 0 and 9 >> ");
		int input = scan.nextInt();
		int randomInt = rng.nextInt(9);
		
		System.out.print("Please enter a number between 0 and 9 >> ");
		int input2 = scan.nextInt();
		int randomInt2 = rng.nextInt(9);
		
		System.out.print("Please enter a number between 0 and 9 >> ");
		int input3 = scan.nextInt();
		int randomInt3 = rng.nextInt(9);
		
		System.out.println("Your number is " + (input * 100 + input2 * 10 + input3));
		System.out.println("The random number is " + (randomInt * 100 + randomInt2 * 10 + randomInt3));

		if(input == randomInt || input == randomInt2 || input == randomInt3) {
			System.out.println("you won $10.00");		
		}
		else if(input2 == randomInt || input2 == randomInt2 || input2 == randomInt3) {
			System.out.println("you won $10.00");		
		}
		else if(input3 == randomInt || input3 == randomInt2 || input3 == randomInt3) {
			System.out.println("you won $10.00");	
		}
		else if(input == randomInt && input == randomInt2 || input == randomInt && input == randomInt3 || input == randomInt2 && input == randomInt3) {
			System.out.println("you won $100.00");				
		}
		else if(input2 == randomInt2 && input2 == randomInt3 || input2 == randomInt2 && input2 == randomInt || input2 == randomInt3 && input2 == randomInt) {
			System.out.println("you won $100.00");	
		}
		else if(input3 == randomInt3 && input3 == randomInt || input3 == randomInt3 && input3 == randomInt2 || input3 == randomInt && input3 == randomInt2) {
			System.out.println("you won $100.00");
		}
		else if(input == randomInt && input2 == randomInt3 && input3 == randomInt2 || input == randomInt2 && input2 == randomInt3 && input3 == randomInt || input == randomInt3 && input2 == randomInt && input3 == randomInt2) {
			System.out.println("you won $1000.00");
		}
		else if(input == randomInt && input2 == randomInt2 && input3 == randomInt3) {
			System.out.println("you won $1000000.00");
		}
		else {
			System.out.println("You won absolutely nothing, better luck next time.");
		}
	}
}