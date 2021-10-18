package classwork;

import java.util.Scanner;

public class Scanners {
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		String str = "a";
		
		System.out.println("Guess a letter >> ");
		String input = scan.nextLine();
		
		if(str.equals(input)) {
			System.out.println("True");
		}
		else {
			System.out.println("False");
		}
	}
}