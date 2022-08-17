package beginnerJava;

public class JavaStringReverse {

	public static void main(String[] args) {
		// Validate if it's a palindrome and print Y/N.
		if (isPalindrome("madam")) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}
	}
	
	// Functiont to determine if a String is a palindrome.
	private static boolean isPalindrome(final String INPUT_STRING) {
		final int MAX_LEN = INPUT_STRING.length();
		final int LEN_OVER_TWO = (INPUT_STRING.length() / 2);
		
		char lower = ' ';
		char higher = ' ';
		
		for (int i = 0; i < LEN_OVER_TWO; i++) {
			lower = INPUT_STRING.charAt(i);
			higher = INPUT_STRING.charAt((MAX_LEN - 1) - i);
			
			if (lower != higher) {
				return false;
			}
		}
		return true;
	}
}
