package homework;

import java.util.Scanner;

public class CondoSales {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int parkCondo = 150000;
		int golfCondo = 170000;
		int lakeCondo = 210000;
		
		final int CHOICE_A = 1;
		final int CHOICE_B = 2;
		final int CHOICE_C = 3;
		
		System.out.print("Please enter a whole number between 1 and 3. 1 for the park caondo, 2 for the golf condo, and 3 for the lake condo. >> ");
		int input = scan.nextInt();
		
		if(input == CHOICE_A) {
			System.out.println("It will cost $" + parkCondo);
		}
		else if(input == CHOICE_B) {
			System.out.println("It will cost $" + golfCondo);
		}
		else if(input == CHOICE_C) {
			System.out.println("It will cost $" + lakeCondo);
		}
		else {
			System.out.println("Input Error");
		}
		System.out.println("");
	}
}