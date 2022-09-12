package interviewChallenges;

public class CAP_String_Splitter {

	public static void main(String[] args) {
		// Static String for input into the function.
		final String INPUT = "abcdef";
		
		// Gets the number of all possible combinations of 3 substrings.
		final int COMBOS = getCombos(INPUT);
		
		// Prints the count of String combinations.
		System.out.println("Combinations: " + COMBOS);
	}
	
	// Returns the number of possible strings from an input string.
	private static int getCombos(final String INPUT_STRING) {
		// Static String Length of Input String
		final int LEN = INPUT_STRING.length();
		
		// Temporary int for storing the current count of possible String combinations.
		int count = 0;
		
		// Temporary Strings for storing all possible Strings.
		String a = "";
		String b = "";
		String c = "";
		
		// Iterates through the length of the String once.
		for (int x = 1; x < (LEN - 1); x++) {
			// String 'a' always needs to start at the beginning and exclude the start of b onward.
			a = INPUT_STRING.substring(0, x);
			
			// Iterates throu the length of the String once.
			for (int y = 3; y <= LEN; y++) {
				// Prevents substing out of bounds exception.
				if ((y - 1) > x) {
					// String 'b' always needs to set from end of x to beginning of y.
					b = INPUT_STRING.substring(x, (y - 1));
					
					// String 'c' always needs to be set from end of 'b' to the length of the String.
					c = INPUT_STRING.substring(y - 1);
					
					// Prints every succussful combination of Strings.
					System.out.println("{" + a + "," + b + "," + c + "}");
					
					// For every successful combination, the count is incremented.
					count++;
				}
			}
		}
		// Returns the total number of String combinations.
		return count;
	}
}
