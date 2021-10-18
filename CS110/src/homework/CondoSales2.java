package homework;

import java.util.Scanner;

public class CondoSales2 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int parkCondo = 150000;
		int golfCondo = 170000;
		int lakeCondo = 210000;
		int garage = 5000;
		
		int choice = 1;
		int choice2 = 2;
		int choice3 = 3;
		int choice4 = 4;
		int choice5 = 5;
		int choice6 = 6;
		
		System.out.print("Please enter a whole number between 1 nd 6. 1 for the park caondo, 2 for the golf condo, and 3 for the lake condo."
				+ " Add 3 to your number if you want to add a garage. >> ");
		int enteredInput = scan.nextInt();
		
		if(enteredInput == choice) {
			System.out.println("It will cost $" + parkCondo);
		}
		else if(enteredInput == choice2) {
			System.out.println("It will cost $" + golfCondo);
		}
		else if(enteredInput == choice3) {
			System.out.println("It will cost $" + lakeCondo);
		}
		else if(enteredInput == choice4) {
			System.out.println("It will cost $" + (parkCondo + 5000));
		}
		else if(enteredInput == choice5) {
			System.out.println("It will cost $" + (golfCondo + 5000));
		}
		else if(enteredInput == choice6) {
			System.out.println("It will cost $" + (lakeCondo + 5000));
		}
		else {
			System.out.println("Input Error");
		}
		System.out.println("Hope to see you soon.");
	}
}