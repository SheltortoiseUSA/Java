package beginnerJava;

import java.text.NumberFormat;
import java.util.Locale;

public class JavaCurrencyFormatter {

	public static void main(String[] args) {
		final double VALUE = 12324.134;
		
		/* 
		 * EXTERNAL REFERENCE: 
		 *  - JDK 7 and JRE 7 Supported Locales from Oracle
		 *  - https://www.oracle.com/java/technologies/javase7locales.html
		 */
		
		// Value in US Currency
		final NumberFormat NF_US = NumberFormat.getCurrencyInstance(Locale.US);
		final String US_VALUE = NF_US.format(VALUE);
		
		// Value in Indian Currency
		final Locale IN_LOCALE = new Locale("en", "IN");
		final NumberFormat NF_IN = NumberFormat.getCurrencyInstance(IN_LOCALE);
		final String IN_VALUE = NF_IN.format(VALUE);
		
		// Value in Chinese Currency
		final NumberFormat NF_CN = NumberFormat.getCurrencyInstance(Locale.CHINA);
		final String CN_VALUE = NF_CN.format(VALUE);
		
		// Value in French Currency
		final NumberFormat NF_FR = NumberFormat.getCurrencyInstance(Locale.FRANCE);
		final String FR_VALUE = NF_FR.format(VALUE);
		
		// Log All Values
		System.out.println("US Value: " + US_VALUE);
		System.out.println("IN Value: " + IN_VALUE);
		System.out.println("CN Value: " + CN_VALUE);
		System.out.println("FR Value: " + FR_VALUE);
	}

}
