package beginnerJava;

public class JavaStrings_I {

	public static void main(String[] args) {
		final String A = "hello";
		final String B = "java";
		
		// Task 1: Sum Lengths of A and B
		final int SUM = A.length() + B.length();
		System.out.println("Length: " + SUM);
		
		/*
		 *  Task 2: Print "Yes" if A comes before B in the alphabet, 
		 *  	and print "No" if not.
		 */
		if (A.compareTo(B) > 0) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}
		
		// Task 3: Append (A + ' ' + B) in Pascal case.
		final StringBuilder SB = new StringBuilder();
		SB.append(getPascalCase(A)).append(' ').append(getPascalCase(B));
		
		final String CONCATENATED = SB.toString();
		System.out.println(CONCATENATED);
	}
	
	// Local function for simple String conversion to Pascal case.
	private static String getPascalCase(final String INPUT_STRING) {
		return INPUT_STRING.substring(0, 1).toUpperCase() + INPUT_STRING.substring(1);
	}
}
