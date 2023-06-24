package financialCalculator;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Calculator {
	private static final double SALES_TAX_COEFF = 1.075;
	private static final double DURATION_AS_WEEKS = 25.0;
	private static final int DURATION_AS_MONTHS = (int) DURATION_AS_WEEKS / 4;
	private static final String TABULATION = "\t\t\t\t";
	
	private static final ArrayList<Cost> COSTS = new ArrayList<Cost>();
	private static final HashMap<String, Income> INCOMES = new HashMap<String, Income>();

	public static void main(String[] args) {
		// Incomes
		INCOMES.put("Tyler", new Income(137000.00, DURATION_AS_WEEKS, 0.0, 0.0));
		INCOMES.put("Makayla (Normal)", new Income(48.00, 12.0, 48.0, DURATION_AS_WEEKS, 7000.0, 0));
		INCOMES.put("Makayla (Extra)", new Income(43.00, 6.0, 6.0, DURATION_AS_WEEKS, 0, 0));
		
		System.out.println("INCOME ANALYSIS =================================================");
		final double combinedSavings = getTotalIncome();
		System.out.println("Combined Savings: " + TABULATION + Utility.getDollarAmount(combinedSavings));
		System.out.println();
		
		// Monthly Costs ====================================================================
		COSTS.add(new Cost("Tyler", 5790, DURATION_AS_MONTHS));
		COSTS.add(new Cost("Makayla", 650, DURATION_AS_MONTHS));
		
		// Itemized Costs ===================================================================
	    //COSTS.add(new Cost("Dove Canyon", 15000, 1));
		
		// Costs ============================================================================
		int totalCost = 0;
		
		System.out.println("COST ANALYSIS ===================================================");
		for (final Cost cost: COSTS) {
			final String tempCostName = cost.getName();
			final double tempCost = cost.getAmount();
			int tempFrequency = cost.getFrequency();
			
			if (tempFrequency > 1) {
				if (tempFrequency == 13) {
					tempFrequency -= 1;
				}
				totalCost += (tempCost * tempFrequency);
				
				System.out.println(
						"Recurring Cost (" + tempCostName + ") " + 
						Utility.getDollarAmount(tempCost) + 
						" (x" + tempFrequency + ") = " + 
						Utility.getDollarAmount((tempCost * tempFrequency))
						);
			} else {
				totalCost += (tempCost * SALES_TAX_COEFF);
				System.out.println(
						"Itemized Cost (" + tempCostName + ") " + 
						Utility.getDollarAmount(tempCost)
						);
			}
		}
		System.out.println("----------------------------------------------------------------");
		System.out.println("Total Cost: " + TABULATION + Utility.getDollarAmount((double) totalCost));
		System.out.println();
		
		System.out.println("FINAL CALCULATION ==============================================");
		System.out.println("Final Savings: " + TABULATION + Utility.getDollarAmount(combinedSavings - totalCost));
	}
	
	private static double getTotalIncome() {
		double totalIncome = 0.0;
		
		for (Map.Entry<String, Income> entry : INCOMES.entrySet()) {
			final double tempIncome = entry.getValue().getNetSavings(entry.getKey());
			totalIncome += tempIncome;
		}
		return totalIncome;
	}
}
