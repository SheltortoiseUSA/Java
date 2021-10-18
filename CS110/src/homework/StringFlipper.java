package homework;

import java.util.Scanner;

public class StringFlipper {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Please enter a String >> ");
		String input = scan.nextLine();
		input.toLowerCase();
		
		char[] forwardArray = input.toCharArray();
		char[] backwardsArray = new char[forwardArray.length];
		
		for(int i = 0; i < forwardArray.length; i++) {
			char temp = forwardArray[i];
			
			backwardsArray[(forwardArray.length - i) - 1] = temp;
		}
		for(char p : backwardsArray) {
			System.out.print(p);
		}
	}
}