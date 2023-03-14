package weddingCalculator;

import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.Locale;

public class CostCalculator {
	private static final ArrayList<Cost> WEDDING_COST = new ArrayList<Cost>();
	private static final double SALES_TAX_COEFF = 1.075;

	public static void main(String[] args) {
		// Itemized Savings
		// ========================================================================================
		// Savings Calculation
		final double tyler = (new Savings(5400, 65.87, 40.0, 40.0, 4780.00)).getTotalSavings();
		System.out.println("My Savings: " + getDollarAmount(tyler));

		final double makayla = (new Savings(18000, 44.0, 24.0, 40.0, 3200.0)).getTotalSavings()
				+ (new Savings(0, 85.0, 12.0, 40.0, 0)).getTotalSavings();
		System.out.println("Makayla's Saving: " + getDollarAmount(makayla));

		final double totalSavings = (tyler + makayla);
		System.out.println("Total Savings: " + getDollarAmount(totalSavings));

		// Itemized Costs
		// ==========================================================================================
		WEDDING_COST.add(new Cost("Furniture: ", 5000));
		WEDDING_COST.add(new Cost("Food: ", 15000));
		WEDDING_COST.add(new Cost("Venue: ", 4995));
		WEDDING_COST.add(new Cost("Floral: ", 3000));
		WEDDING_COST.add(new Cost("Honeymoon: ", 5000));

		// Final Calculations
		final double weddingCost = calculateCost();
		System.out.println("Wedding : " + getDollarAmount(weddingCost));

		final double remainder = totalSavings - weddingCost;
		System.out.println("Remainder : " + getDollarAmount(remainder));
	}

	private static String getDollarAmount(final Double num) {
		final NumberFormat NF_US = NumberFormat.getCurrencyInstance(Locale.US);
		return NF_US.format(num);
	}

	private static double calculateCost() {
		double sum = 0.0;

		for (final Cost cost : WEDDING_COST) {
			sum += cost.getCost();
		}
		return (sum * SALES_TAX_COEFF);
	}
}