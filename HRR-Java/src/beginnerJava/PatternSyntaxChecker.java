package beginnerJava;

import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;

public class PatternSyntaxChecker {

	public static void main(String[] args) {
		// ArrayList of Strings
		final ArrayList<String> STRING_PATTERNS = new ArrayList<>();
		STRING_PATTERNS.add("([A-Z])(.+)");
		STRING_PATTERNS.add("[AZ[a-z](a-z)");
		STRING_PATTERNS.add("batcatpat(nat");
		
		// Size of ArrayList of Strings
		final int SIZE = STRING_PATTERNS.size();
		
		/*
		 * Uses TryCatch to determine errors in creating a pattern and matcheing that pattern.
		 * 
		 * NOTES:
		 *  - If no Exception is encountered when creating a pattern or matching that pattern, then it's valid.
		 *  - Else, then it is invalid.
		 */
		for (int i = 0; i < SIZE; i++) {
			try {
				final String CURRENT_PATTERN = STRING_PATTERNS.get(i);
				final Pattern PATTERN = Pattern.compile(CURRENT_PATTERN, Pattern.CASE_INSENSITIVE);
				final Matcher MATCHER = PATTERN.matcher(CURRENT_PATTERN);
				
				System.out.println("Valid");
			} catch (final PatternSyntaxException PSE) {
				System.out.println("Invalid");
			}
		}
	}
}
