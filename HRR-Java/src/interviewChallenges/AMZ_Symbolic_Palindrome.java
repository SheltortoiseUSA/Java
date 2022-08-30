package interviewChallenges;

public class AMZ_Symbolic_Palindrome {

	public static void main(String[] args) {
		// Static String of SYMBOLS
		final String SYMBOLS = "([{ a }])";
		
		// Mirrors all symbols in the String.
		final String MIRRORRED = swap(SYMBOLS);
		
		// Makes sure the symbolic String is a palindrom.
		final boolean IS_SYMB_PALINDROME = isPalindrome(MIRRORRED);
		System.out.println("Is Symbolic Palindrome: " + IS_SYMB_PALINDROME);
	}
	
	// Custom function for swapping symbols to their mirrorred counterpart.
	private static String swap(final String INPUT_STRING) {
		// Converts INPUT_STRING to Character Array
		final char[] CHARACTERS = INPUT_STRING.toCharArray();
		final int LEN = CHARACTERS.length;
		
		// Optimized loop to mirror upper bound symbols.
		for (int i = 0; i < (LEN / 2); i++) {
			// Static String for Easy Upper Bound Changes
			final int UPPER_BOUND = ((LEN - i) - 1);
			
			// Static Lower and Upper Bound Characters
			final char L = CHARACTERS[i];
			final char U = CHARACTERS[UPPER_BOUND];
			
			// Switch Statement to Mirror Symbols
			switch (U) {
				case '}':
					CHARACTERS[UPPER_BOUND] = L;
					break;
				case ']':
					CHARACTERS[UPPER_BOUND] = L;
					break;
				case ')':
					CHARACTERS[UPPER_BOUND] = L;
					break;
			}
		}
		// Returns the Mirrored String
		return new String(CHARACTERS);
	}
	
	// Custom function to determine if the input String is a pallindrome.
	private static boolean isPalindrome(final String INPUT_STRING) {
		// Converts INPUT_STRING to Character Array
		final char[] CHARACTERS = INPUT_STRING.toCharArray();
		final int LEN = CHARACTERS.length;
		
		// Optimized loop to validate a palindrome.
		for (int i = 0; i < (LEN / 2); i++) {
			// Static Lower Bound and Upper Bound Characters
			final char L = CHARACTERS[i];
			final char U = CHARACTERS[(LEN - i) - 1];
			
			// Returns that the string is not a palindrome if one mirrored instance is not identical.
			if (L != U) {
				return false;
			}
		}
		// Since no error was thrown, the String is a palindrome.
		return true;
	}
}
