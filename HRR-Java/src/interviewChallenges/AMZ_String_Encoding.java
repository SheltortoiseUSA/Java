package interviewChallenges;

public class AMZ_String_Encoding {

	public static void main(String[] args) {
		// Static input string to be encoded.
		final String STRING_TO_ENCODE = "aaaabbccabcd";
		
		// Prints the string to be encoded.
		System.out.println("String to Encode: " + STRING_TO_ENCODE);
		
		// Gets the encoded value of the input string.
		final String ENCODED_STRING = encode(STRING_TO_ENCODE);
		
		// Print Encoded String
		System.out.println("Encoded String: " + ENCODED_STRING);
	}
	
	// Custom function to encode a string to shorten its memory usage.
	private static String encode(final String INPUT_STRING) {
		// Use the optimized StringBuilder for the compressed string to return.
		final StringBuilder SB = new StringBuilder();
		
		// Avoid Null String
		if (INPUT_STRING == null || INPUT_STRING.length() == 0) {
			return "ERROR";
		} else {
			// Convert String to CharArray for an optimized traversal of characters.
			final char[] CHARACTERS = INPUT_STRING.toCharArray();
			
			// Establish a temporary char to store the current incide in the CharArray.
			char c = ' ';
			
			// Establish a temporary counter to store the temporary count of characters to compress.
			int count = 1;
			
			// Establish a static length for maximum bounds for cleanness.
			final int LENGTH = CHARACTERS.length;
			
			// Iterate through each character in the CharArray and compress the string accordingly.
			for (int i = 0; i < CHARACTERS.length; i++) {
				c = CHARACTERS[i];
				
				if (isOOB(i, (LENGTH - 1))) {
					// Next character is OOB.
					SB.append(c).append(count);
				} else {
					// Next character is not OOB.
					if (c == CHARACTERS[i + 1]) {
						// Char c is equal to the next character, so increment the counter.
						count++;
					} else {
						// Char c is not equal to the next character, so append the encoded chunk and reset the counter.
						SB.append(c).append(count);
						count = 1;
					}
				}
			}
		}
		return SB.toString();
	}
	
	// Custom function to determine if a chosen index is "Out of Bounds."
	private static boolean isOOB(final int I, final int MAX) {
		if (I >= MAX) {
			return true;
		} else {
			return false;
		}
	}
}
