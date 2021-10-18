package homework;

import java.util.Scanner;

public class QuartsToGallons {
	
	public static void main(String[] args) {   
		Scanner scan = new Scanner(System.in);
		
		int quarts;
		int answer;
		int remainder;
		
		System.out.print("Please enter any number of quarts >> ");
		quarts = scan.nextInt();
		
		answer = quarts / 4;
		remainder = quarts % 4;
		
		System.out.println("A job that needs " + quarts + " quarts requires " + answer + " gallons plus " + remainder + " quarts.");	
	}
}