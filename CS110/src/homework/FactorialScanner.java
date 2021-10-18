package homework;

import java.util.Scanner;

public class FactorialScanner {
	
	public static void main(String[] args) {
		System.out.print("Choose any number between one and ten: ");
		
		Scanner scan = new Scanner(System.in);
		int input = scan.nextInt();
		
		int x = input;
		int num = 1;
			
		if(x == 0 || x == 1) {
			System.out.println("1");
		}
		else {
			while(x > 1) {
				num = (num * x);
				x--;
			}
		}
		System.out.println("Factorial of " + input + " is " + num + ".");
	}
}