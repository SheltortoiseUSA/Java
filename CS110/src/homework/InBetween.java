package homework;

import java.util.Scanner;

public class InBetween {
		
	public static void main(String[] args) {
		Scanner scanX = new Scanner(System.in);
		Scanner scanY = new Scanner(System.in);
		
		System.out.print("Choose any whole number >> ");
		int xInput = scanX.nextInt();
			
		System.out.print("Choose another, larger, whole number >> ");	
		int yInput = scanY.nextInt();
			
		int x = xInput;
		int y = yInput;
		
		int answer = yInput - xInput;
		
		if(x == y) {
			System.out.println("The are no numbers between the numbers you have chosen.");
		}
		else {
			System.out.print("These are the numbers between " + xInput + " and " + yInput + ": ");
			
			while(answer < y) {
				System.out.print(answer++ + " ");
			}
		}
	}
}