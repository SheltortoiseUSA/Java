package homework;

import java.util.Scanner;

public class InsuranceScanner {
	
	public static void main(String[] args) { 
		displayBirthYear();
		displayCurrentYear();
		displayAnswer(0, 0);
	}
	private static void displayBirthYear() {	
		Scanner input = new Scanner(System.in);
		
		System.out.println("Please enter your 4 digit birth year >> ");
		long birthYear = input.nextLong();
	}
	private static void displayCurrentYear() {		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Please enter the current year with 4 digits >> ");
		long currentYear = input.nextLong();
	}
	private static void displayAnswer(long currentYear, long birthYear) {
		long age = (currentYear - birthYear);
		long premiumCost = ((age / 10 + 15) * 20);
		
		System.out.println("Your premium cost would be $" + premiumCost + " a month.");
	}
}