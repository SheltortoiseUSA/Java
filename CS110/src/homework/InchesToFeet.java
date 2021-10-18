package homework;

import java.util.Scanner;

public class InchesToFeet {
	
	public static void main(String[] args) {   
		Scanner scan = new Scanner(System.in);
		
		int answer = 0;
		int inches = 0;
		int remainder = 0;
		
		System.out.print("Please enter inches >> ");
		inches = scan.nextInt();
		
		answer = (inches / 12);
		remainder = (inches % 12);
		
		System.out.println(inches + " / " + 12 + " is " + answer + " feet and " + remainder + " inches. ");	
	}
}