package weddingCalculator;

public class Savings {
	// Default Member Data
	private static double CA_TAXES_COEFF = 0.098;
	private static double FED_TAXES_COEFF = 0.24;
	
	// Explicit Member Data
	private double bankRoll;
	private double rate;
	private double hours;
	private double weeksRemaining;
	private double monthlyExpenses;
	
	// Default Member Data
	private double totalSavings;
	
	// Explicit Constructor
	public Savings(final double bankRoll, final double rate, final double hours, final double weeksRemaining, final double monthlyExpenses) {
		this.bankRoll = bankRoll;
		this.rate = rate;
		this.hours = hours;
		this.weeksRemaining = weeksRemaining;
		this.monthlyExpenses = monthlyExpenses;
		totalSavings = ((rate * hours * weeksRemaining * (1 - (CA_TAXES_COEFF + FED_TAXES_COEFF))) + bankRoll - (weeksRemaining * (monthlyExpenses / 4)));
	}
	
	// Getters and Setters
	public double getTotalSavings() {
		return totalSavings;
	}
}
