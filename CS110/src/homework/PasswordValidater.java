package homework;

import java.util.Scanner;

public class PasswordValidater {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Create a password with 2 upper case letters, 2 lower case letters, and 2 numbers >> ");
		String password = scan.nextLine();
		
		int upperCount = 0;
		int lowerCount = 0;
		int digitCount = 0;
		
		for(int i = 0; i < password.length(); i++) {
			Character temp = password.charAt(i);
			
			if(Character.isUpperCase(temp)) {
				upperCount++;
			}
			else if(Character.isLowerCase(temp)) {
				lowerCount++;
			}
			else if(Character.isDigit(temp)) {
				digitCount++;
			}
		}
		if(upperCount >= 2 && lowerCount >= 2 && digitCount >= 2) {
			System.out.println("Valid Password");
		}
		else {
			System.out.println("Invalid Password");
		}
		System.out.println("Upper count: " + upperCount);
		System.out.println("Lower count: " + lowerCount);
		System.out.println("Digit count: " + digitCount);
	}
}