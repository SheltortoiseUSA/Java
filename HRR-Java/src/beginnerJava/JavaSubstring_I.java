package beginnerJava;

public class JavaSubstring_I {

	public static void main(String[] args) {
		final String S = "Helloworld";
		final int START = 3;
		final int END = 7;
		
		/*
		 * NOTE: 
		 *  - String Indices are [0, (Len - 1)] and Substring is [X, Y).
		 */
		System.out.println(S.substring(START, END));
	}
}
