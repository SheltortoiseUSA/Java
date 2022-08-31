package interviewChallenges;

import java.util.Stack;

public class AMZ_Scope_Validator {
	private static Stack<Character> SCOPE_BRACKETS = new Stack<>();
	
	public static void main(String[] args) {
		// Static Array of Input Strings
		final String[] INPUT_STRINGS = { "[{()}]" , "[[[", "aaa", "[a]", "[{]}" };
		
		// Iterates through each input String and validates if scope is valid.
		for (final String CURRENT_STRING : INPUT_STRINGS) {
			System.out.println(validateScope(CURRENT_STRING));
		}
	}
	
	// Custom function to validate if all scopes are closed.
	private static String validateScope(final String INPUT_STRING) {
		// Validates if the brackets are scoped properly and stores the result.
		final boolean IS_SCOPE_VALID = validateBrackets(INPUT_STRING);
		
		// Empty the globally accessible stack for function to be reusable.
		emptyStack();
		
		// Returns whether the scope was valid or not.
		if (IS_SCOPE_VALID) {
			return "YES";
		} else {
			return "NO";
		}
	}
	
	// Custom function to validate brackets.
	private static boolean validateBrackets(final String INPUT_STRING) {
		// Converts input String to CharArray for easier traversal of cheracters.
		final char[] CHARACTERS = INPUT_STRING.toCharArray();
		
		// Static length for a clean for loop exit condition.
		final int LEN = CHARACTERS.length;
		
		// Local boolean to make sure that the input contained at least one scope bracket.
		boolean hasOneOpen = false;
		
		// Iterates through each character of the character array.
		for (int i = 0; i < LEN; i++) {
			// Temporary character storage for each index of the character array.
			final char C = CHARACTERS[i];
			
			switch(C) {
				case '[':
					SCOPE_BRACKETS.push(C);
					hasOneOpen = true;
					break;
				case '{':
					SCOPE_BRACKETS.push(C);
					hasOneOpen = true;
					break;
				case '(':
					SCOPE_BRACKETS.push(C);
					hasOneOpen = true;
					break;
				case ']':
					if (validateChunk(']')) {
						break;
					} else {
						return false;
					}
				case '}':
					if (validateChunk('}')) {
						break;
					} else {
						return false;
					}
				case ')':
					if (validateChunk(')')) {
						break;
					} else {
						return false;
					}
			}
		}
		
		// Validates some edge-case potentials.
		if (SCOPE_BRACKETS.size() > 0) {
			// If Stack has unresolved counterparts, then return false.
			return false;
		} else if (!hasOneOpen) {
			// If the stack never contained an open bracket, then return false.
			return false;
		} else {
			// If no errors are found, return true.
			return true;
		}
	}
	
	// Custom function to validate scope within a chunk.
	private static boolean validateChunk(final char P) {
		if (SCOPE_BRACKETS.size() > 0 && SCOPE_BRACKETS.pop() != getCounterpart(P)) {
			return false;
		} else {
			return true;
		}
	}
	
	// Custom function to find scope counterpart.
	private static char getCounterpart(final char SYMBOL) {
		// Determines which counterpart to return.
		switch (SYMBOL) {
			case ']':
				return '[';
			case '}':
				return '{';
			case ')':
				return '(';
		}
		// If counterpart is not found, then space is returned.
		return ' ';
	}
	
	// Custom function for emptying the globally accessible stack.
	private static void emptyStack() {
		SCOPE_BRACKETS.clear();
	}
}
