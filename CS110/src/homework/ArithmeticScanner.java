package homework;

import java.util.Scanner;

public class ArithmeticScanner {
	
	public static void main(String[] args) { 
		doubleNumber();
		addFive();
		squareNumber();
	}
	public static void doubleNumber() {	
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Please enter any number >> ");
		long inputA = scan.nextLong();
		
		System.out.println("Please enter another number >> ");
		long inputB = scan.nextLong();
		
		long doubledA = (inputA * 2);
		long doubledB = (inputB * 2);
		
		System.out.println("The first number you chose was " + inputA + ", and that number times two is " + doubledA + ".");
		System.out.println("The first second number you chose was " + inputB + ", and that number times two is " + doubledB + ".");
	}
	public static void addFive() {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Please enter any number >> ");
		long inputA = scan.nextLong();
		
		System.out.println("Please enter another number >> ");
		long inputB = scan.nextLong();
		
		long addedA = (inputA + 5);
		long addedB = (inputB + 5);
		
		System.out.println("The first number you chose was " + inputA + ", and that number plus five is " + addedA + ".");
		System.out.println("The first second number you chose was " + inputB + ", and that number plus five is " + addedB + ".");
	}
	public static void squareNumber() {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Please enter any number >> ");
		long inputA = scan.nextLong();
		

		System.out.println("Please enter another number >> ");
		long inputB = scan.nextLong();
		
		long squaredA = (inputA * inputA);
		long squaredB = (inputB * inputB);
		
		System.out.println(" The first number you chose was " + inputA + ", and that number squared is " + squaredA + ".");
		System.out.println(" The first second number you chose was " + inputB + ", and that number squared is " + squaredB + ".");
	}
}