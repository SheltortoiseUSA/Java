package homework;

import java.util.Scanner;

public class EggsCost {

	public static void main(String[] args) {
		System.out.println("Please enter any number of eggs >> ");
		
		Scanner scan = new Scanner(System.in);
		int amountOfEggs = scan.nextInt();
		
		double answer;
		double remainder;
		
		answer = 3.25 * (amountOfEggs / 12);
		remainder = .45 * (amountOfEggs % 12);
		
		System.out.println("Your eggs will cost $" + (answer + remainder));
	}
}