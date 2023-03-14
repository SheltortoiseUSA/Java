package financialCalculator;

import java.util.ArrayList;

public class Calculator {
	private static final ArrayList<Cost> COSTS = new ArrayList<Cost>();
	private static final double SALES_TAX_COEFF = 1.075;

	public static void main(String[] args) {
		final Income tyler = new Income(137000.00, 26.0, 1500.00, 0.0);
		final Income makayla = new Income(44.00, 12.0, 36.0, 26.0, 18000.00, 120.00);
		
		tyler.printNetIncome();
		makayla.printNetIncome();
		
		final double combinedIncome = (tyler.getNetIncome() + makayla.getNetIncome());
		System.out.println("Combined Income: " + Utility.getDollarAmount(combinedIncome));
		System.out.println();
		
		// Monthly Costs ====================================================================
		COSTS.add(new Cost("Tyler: ", 6030, 6));
		COSTS.add(new Cost("Makayla: ", 1500, 6));
		
		// Itemized Costs ===================================================================
		COSTS.add(new Cost("Furniture: ", 10000, 1));
		COSTS.add(new Cost("Food: ", 15000, 1));
		COSTS.add(new Cost("Venue: ", 4995, 1));
		COSTS.add(new Cost("Floral: ", 3000, 1));
		COSTS.add(new Cost("Honeymoon: ", 5000, 1));
		
		System.out.println("Costs ===========================================================");
		int totalCost = 0;
		
		for (final Cost cost: COSTS) {
			final int tempCost = cost.getAmount();
			final int tempFrequency = cost.getFrequency();
			
			if (tempFrequency > 1) {
				totalCost += (tempCost * tempFrequency);
			} else {
				totalCost += (tempCost * SALES_TAX_COEFF);
			}
		}
		System.out.println("Total Cost: " + Utility.getDollarAmount((double) totalCost));
		System.out.println("Final Savings: " + Utility.getDollarAmount(combinedIncome - totalCost));
	}
}
