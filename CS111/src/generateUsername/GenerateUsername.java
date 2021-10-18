package generateUsername;

import java.util.Scanner;
import java.util.Random;

public class GenerateUsername {
	
	public static void main(String Args[]){
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Please enter your first name >> ");
		String firstName = scan.nextLine();
		firstName = firstName.toUpperCase();
		
		System.out.println("Please enter your last name >> ");
		String lastName = scan.nextLine();
		lastName = lastName.toUpperCase();
		
		Random rng = new Random();
		int randomInt = rng.nextInt(88) + 11;
		
		System.out.print(firstName.charAt(0));
		
		for(int i = 0; i < 5; i++) {
			System.out.print(lastName.charAt(i));
		}
		System.out.print(randomInt);
	}
}