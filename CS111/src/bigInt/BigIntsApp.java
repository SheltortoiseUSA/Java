package bigInt;

import java.util.Scanner;

public class BigIntsApp {
	
	public static void main(String Args[]) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter a 12 digit number >> ");
		String input = scan.nextLine();
		
		System.out.println("Enter another 12 digit number >> ");
		String input2 = scan.nextLine();
		
		BigInt x = new BigInt(input);
		BigInt y = new BigInt(input2);
		
		x.add(y);
	}
}