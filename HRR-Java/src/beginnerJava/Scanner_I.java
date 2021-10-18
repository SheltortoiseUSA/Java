package beginnerJava;

import java.util.Scanner;

// Task: Scan 3 integers and print them to console.
public class Scanner_I {
	
	public static void main(String[] ARGS) {
		Scanner scan = new Scanner(System.in);
		int a;
		
		for(int i = 0; i < 3; i++) {
			System.out.println("Enter an Integer >> ");
			a = scan.nextInt();
			System.out.println(a);
		}
	}
}
