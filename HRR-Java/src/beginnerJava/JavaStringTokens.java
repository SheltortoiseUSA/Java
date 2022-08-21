package beginnerJava;

import java.util.ArrayList;

public class JavaStringTokens {
	// Private global variable to store all the tokens to be printed.
	private final static ArrayList<String> TOKENS = new ArrayList<>();

	public static void main(String[] args) {
		// Method Call to Extract Tokens
		extractTokens("He is a very very good boy, isn't he?");
		
		// Printed Line: Prints Total Number of Tokens
		System.out.println(TOKENS.size());
		
		// Printer Loop: Prints Each Token
		for (String token : TOKENS) {
			System.out.println(token);
		}
	}
	
	// Custom function to extract and store tokens.
	private static void extractTokens(final String INPUT_STRING) {
		final StringBuilder SB = new StringBuilder();
		final int LEN = INPUT_STRING.length();
		char c = ' ';
		
		for (int i = 0; i < LEN; i++) {
			c = INPUT_STRING.charAt(i);
			
			if (isLetter(c)) {
				// Add the character to the token.
				SB.append(c);
				
				if (i == (LEN - 1)) {
					addToken(SB.toString());
				}
			} else {
				// Attempt to Add Token
				addToken(SB.toString());
				
				// Wipe Token
				SB.setLength(0);
			}
		}
	}
	
	// Custom function to determine if a character is not in the alphabet.
	private static boolean isLetter(final char C) {
		if (Character.isLetter(C)) {
			return true;
		} else {
			return false;
		}
	}
	
	// Custom function to confirm that a token contains at least one character.
	private static boolean containsLetter(final String INPUT_STRING) {
		char c = ' ';
		
		for (int i = 0; i < INPUT_STRING.length(); i++) {
			c = INPUT_STRING.charAt(i);
			
			if (isLetter(c)) {
				return true;
			}
		}
		return false;
	}
	
	// Custom function to add a token to the token list.
	private static void addToken(final String INPUT_STRING) {
		// Store the token inside a temporary String.
		final String TOKEN = INPUT_STRING;
		
		// Do not keep the character, and store the token, but only if it contains a letter.
		if (containsLetter(TOKEN)) {
			TOKENS.add(TOKEN);
		}
	}
}
