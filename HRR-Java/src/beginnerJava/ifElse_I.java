package beginnerJava;

import java.util.Random;

//Task: Create an If/Else statement that prints statements to console based on the following rules...
// 1) If 'n' is odd, then print "Weird"
// 2) If 'n' is even, and in the range [2-5], then print "Not Weird."
// 3) If 'n' is even, and in the range [6-20], then print "Weird."
// 4) If 'n' is even, and greater than 20, then print "Not Weird."
public class ifElse_I {

	public static void main(String[] ARGS) {
		Random rng = new Random();
		int randomInt = rng.nextInt(100) + 1;
		
		boolean isEven = false;
		String result = null;
		
		// Ensure the random integer did not malfunction.
		if(randomInt >= 0 && randomInt <= 100) {
			// Determine if the integer is even or odd.
			if((randomInt % 2) == 0) {
				isEven = true;
				System.out.println("The Random Integer is [" + randomInt + "], and is Even.");
			} else {
				isEven = false;
				System.out.println("The Random Integer is [" + randomInt + "], and is Odd.");
			}
			
			// Determine if the constraints are met, and print what is expected.
			if (!isEven) {
				System.out.println("Weird");
			} else if(isEven && randomInt >= 2 && randomInt <= 5) {
				System.out.println("Not Weird");
			} else if (isEven && randomInt >= 6 && randomInt <= 20) {
				System.out.println("Weird");
			} else if (isEven && randomInt > 20) {
				System.out.println("Not Weird");
			}
		} else {
			System.out.println("Error: randomInt exceeded the bounds of the task.");
		}
	}
}
