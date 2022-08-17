package beginnerJava;

public class JavaAnagrams {
	private String[] CharacterCount = new String[26];

	public static void main(String[] args) {
		final String A = "anagram";
		final String B = "margana";
		
		/*
		 * NOTE:
		 *  - Challenge would not let me alter main. I would have sorted the strings from main,
		 *  	and foreced them to lower case.
		 */
		final boolean IS_ANAGRAM = isAnagram(A, B);
        System.out.println((IS_ANAGRAM) ? "Anagrams" : "Not Anagrams");
	}
	
	// Function to determine if two strings are an anagrams of each other.
	private static boolean isAnagram(final String INPUT_A, final String INPUT_B) {
		// Easy False if LEN_A != LEN_B
		if (INPUT_A.length() == INPUT_B.length()) {
			/*
			 * NOTE:
			 *  - Wasted memory due to above note.
			 */
			final String SORTED_A = sortString(INPUT_A.toLowerCase());
			final String SORTED_B = sortString(INPUT_B.toLowerCase());
			
			/*
			 * NOTE:
			 *  - If, the strings are the same, then it is an anagram.
			 *  - Else, the strings are not an anagram.
			 */
			if (SORTED_A.equals(SORTED_B)) {
				return true;
			} else {
				return false;
			}
		} else {
			return false;
		}
	}
	
	// Function to sort a string.
	/*
	 * NOTE:
	 *  - I wanted to sort using Arrays.sort(x), but the challenge would not let me import the utility,
	 *  	and this foreces me to use nested loops, which is not ideal.
	 */
	private static String sortString(final String INPUT_STRING) {
		final int LEN = INPUT_STRING.length();
        char[] characters = INPUT_STRING.toCharArray();
        char c = ' ';
        
        /*
         * NOTE:
         *  - Long Story Short, Swap the value at each indice when the value is less for the future indice.
         */
        for (int i = 0; i < LEN; i++) {
        	for (int j = 0; j < LEN; j++) {
        		if (characters[j] < characters[i]) {
        			c = characters[i];
        			characters[i] = characters[j];
        			characters[j] = c;
        		}
        	}
        }
        // Convert the character array back into a String.
        return new String(characters);
	}
}
