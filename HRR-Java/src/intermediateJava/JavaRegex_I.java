package intermediateJava;

public class JavaRegex_I {

	public static void main(String[] args) {
		// StringBuilder stores a randomly generated IP address.
		final StringBuilder SB = new StringBuilder();
		
		// Randomly Generates IP Numbers and Separators
		for (int i = 0; i < 4; i++) {
			// Appends a number on the range of [0-999] to the IP number.
			/*
			 * NOTE: 
			 *  - IP numbers are on the range of [0-255] normally.
			 */
			SB.append((int) (Math.random() * 999) + 0);
			
			// Excludes adding a trailing period to the IP number.
			if (i != 3) {
				SB.append(".");
			}
		}
		
		// Stores and Prints Randomly Generated IP Address
		final String IP_ADDRESS = SB.toString();
		System.out.println("IP Address: " + IP_ADDRESS);
		
		// Validates and prints whether the IP address was valid.
		final boolean isIPAddress = validateIP(IP_ADDRESS);
		System.out.println("Is Valid: " + isIPAddress);
	}
	
	/*
	 * Validates IP Against Pattern
	 * 
	 * NOTE:
	 *  - Matcher Reference: https://docs.oracle.com/javase/7/docs/api/java/util/regex/Pattern.html
	 *  - IP Address Reference: https://riptutorial.com/regex/example/14146/match-an-ip-address
	 *  - The String is far too messy for my liking, but it got the job done.
	 */
	public static boolean validateIP(final String INPUT_STRING) {
        final String PATTERN_AS_STRING = "^(?:(?:25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?)\\.){3}(?:25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?)$";
        return INPUT_STRING.matches(PATTERN_AS_STRING);
    }
}
