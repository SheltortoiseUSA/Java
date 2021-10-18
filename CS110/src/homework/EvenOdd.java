package homework;

import java.util.Scanner;

public class EvenOdd {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Please enter a whole number >> ");
		int num = scan.nextInt();
		
		if((num / 2) < (num / 2) + (num % 2)) {
			System.out.println("It is an odd number.");
			
		}
		else if((num / 2) >= (num / 2) + (num % 2)) {
			System.out.println("It is an even number.");
		}
		else {
			System.out.println("Input Error");
		}
		System.out.println("Done Calculating");
	}
}