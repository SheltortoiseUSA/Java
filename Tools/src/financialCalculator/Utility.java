package financialCalculator;

import java.text.NumberFormat;
import java.util.Locale;

public class Utility {

	static String getDollarAmount(final Double value) {
		final NumberFormat NF_US = NumberFormat.getCurrencyInstance(Locale.US);
		return NF_US.format(value);
	}
}
