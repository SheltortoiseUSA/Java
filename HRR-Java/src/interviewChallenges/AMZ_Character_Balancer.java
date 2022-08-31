package interviewChallenges;

import java.util.*;

public class AMZ_Character_Balancer {
	private static HashMap<Character, Integer> CHARACTER_COUNTS = new HashMap<>();
	
	public static void main(String[] args) {
		// Static Array of Input Strings
		final String[] INPUT_STRINGS = { "[{()}]" , "[[[", "aaa", "[a]", "[}]{" };
		
		// Iterates through each input String and validates if it is balanced.
		for (final String CURRENT_STRING : INPUT_STRINGS) {
			System.out.println(isBalanced(CURRENT_STRING));
		}
	}
	
	// Custom function to validate if a String has an even number of characters.
	private static String isBalanced(final String INPUT_STRING) {
		// Stores the characters and their count, inside the global HashMap
		storeMapData(INPUT_STRING);
		
		// Validates the contents of the stored String.
		final boolean IS_BALANCED = validateBalance();
		
		// Empties the HashMap for future use of this function.
		emptyMap();
		
		// Returns if the input String was balanced or not.
		if (IS_BALANCED) {
			return "YES";
		} else {
			return "NO";
		}
	}
	
	// Custom function to store the input characters in the globally accessible HashMap.
	private static void storeMapData(final String INPUT_STRING) {
		// Converts String to CharArray for Easy Traversal
		final char[] INPUT_ARR = INPUT_STRING.toCharArray();
		
		// Static length for a clean for loop exit condition.
		final int LEN = INPUT_ARR.length;
		
		// Iterates through every character in the input String, then stores and increments it's count.
		for (int i = 0; i < LEN; i++) {
			// Copies the current character in the loop.
			final char C = INPUT_ARR[i];
			
			// Validates whether to add a new key-value pair, or to increment the count of the current key.
			if (CHARACTER_COUNTS.containsKey(C)) {
				// Case 1: Record Exists, so update the count on the record.
				final int CURRENT_COUNT = CHARACTER_COUNTS.get(C);
				CHARACTER_COUNTS.put(C, CURRENT_COUNT + 1);
			} else {
				// Case 2: No Record Exists, so add a new record.
				CHARACTER_COUNTS.put(C, 1);
			}
		}
	}
	
	// Custom function for validating the balance of the globally accessibly HashMap.
	private static boolean validateBalance() {
		/* HashMap EntrySet Loop
		 * 
		 * NOTE:
		 *  - Iterates through each key-value pair in the globally accessible HashMap.
		 *  - Validates the balance of each key-value pair.
		 */
		for (HashMap.Entry<Character, Integer> PAIR : CHARACTER_COUNTS.entrySet()) {
			final char C = PAIR.getKey();
			final int COUNT = PAIR.getValue();
			
			// Case 1: Validate Symbols, by comparing their counter part.
			switch (C) {
				// Validates These Cases
				case '[':
					if (!CHARACTER_COUNTS.containsKey(']') || COUNT != CHARACTER_COUNTS.get(']')) {
						return false;
					}
					break;
				case '{':
					if (!CHARACTER_COUNTS.containsKey('}') || COUNT != CHARACTER_COUNTS.get('}')) {
						return false;
					}
					break;
				case '(':
					if (!CHARACTER_COUNTS.containsKey(')') || COUNT != CHARACTER_COUNTS.get(')')) {
						return false;
					}
					break;
				// Ignores These Cases
				case ']':
					break;
				case '}':
					break;
				case ')':
					break;
				default:
					// Case 2: Validate Letters, by checking if their count is even.
					if ((COUNT % 2) != 0) {
						// Letter is not balanced if it's count is odd.
						return false;
					}
			}
		}
		return true;
	}
	
	// Custom function to empty the globally accessible HashMap.
	private static void emptyMap() {
		CHARACTER_COUNTS.clear();
	}
}
