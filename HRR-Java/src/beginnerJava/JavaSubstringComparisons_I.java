package beginnerJava;

public class JavaSubstringComparisons_I {

	public static void main(String[] args) {
		// Get the smallest and largest and print them.
		System.out.println(getSmallestAndLargest("welcometojava", 3));
	}
	
	private static String getSmallestAndLargest(final String INPUT_STRING, final int SUBSTR_LEN) {
		final int MAX_LEN = INPUT_STRING.length();
		
		String smallest = "";
		String largest = "";
		String temp = "";
		
		/*
		 * NOTE:
		 *  - Substring length must be smaller than input String's length.
		 */
		if (MAX_LEN > SUBSTR_LEN) {
			/*
			 * NOTE:
			 *  - Avoid "Index Out of Bounds" error by keeping 'i' withing INPUT_STRING's length.
			 */
			for (int i = 0; i <= (MAX_LEN - SUBSTR_LEN); i++) {
				temp = INPUT_STRING.substring(i, (i + SUBSTR_LEN));
				
				/*
				 * NOTE:
				 *  - If, i == 0, then largest and smallest become temp, and no work is to be done.
				 *  - Else, use custom functions to overwrite the smallest and largest lexi Strings.
				 */
				if (i == 0) {
					smallest = temp;
					largest = temp;
				} else {
					smallest = getLowerLexiValue(smallest, temp);
					largest = getHigherLexiValue(largest, temp);
				}
			}
		} else {
			smallest = INPUT_STRING;
			largest = INPUT_STRING;
		}
		return (smallest + "\n" + largest);
	}
	
	// Function to return the lower lexicographical value from two input strings.
	private static String getLowerLexiValue(final String INPUT_1, final String INPUT_2) {
		/*
		 * NOTE:
		 *  - If, I_1 is lower lexicographically, then return that String.
		 *  - Else, I_2 is lower or equal lexicographically, so return that String.
		 */
		if (INPUT_1.compareTo(INPUT_2) < 0) {
			return INPUT_1;
		} else {
			return INPUT_2;
		}
	}
	
	// Function to return the higher lexicographical value from two input strings.
	private static String getHigherLexiValue(final String INPUT_1, final String INPUT_2) {
		/*
		 * NOTE:
		 *  - If, I_1 is higher lexicographically, then return that String.
		 *  - Else, I_2 is higher or equal lexicographically, so return that String.
		 */
		if (INPUT_1.compareTo(INPUT_2) > 0) {
			return INPUT_1;
		} else {
			return INPUT_2;
		}
	}
}
