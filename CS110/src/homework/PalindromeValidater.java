package homework;

import java.util.Scanner;

public class PalindromeValidater {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Please enter a word >> ");
		String str = scan.nextLine();
		
		char[] forwardArray = str.toCharArray();
		char[] backwardArray = new char[forwardArray.length];
		
		boolean isPalindrome = false;
		
		for(int i = 0; i < forwardArray.length; i++) {
			char temp = forwardArray[i];
			
			backwardArray[(forwardArray.length - i) - 1] = temp;
		}
		for(int j = 0; j < forwardArray.length; j++) {	
			if(forwardArray[j] == backwardArray[j]) {
				isPalindrome = true;
			}
			else {
				isPalindrome = false;
				
				break;
			}
		}
		if(isPalindrome) {
			System.out.println("It's a palindrome!");
		}
		else {
			System.out.println("It's not a palindrome.");
		}
	}
}