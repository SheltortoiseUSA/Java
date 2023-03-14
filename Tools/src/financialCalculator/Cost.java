package financialCalculator;

public class Cost {
	// Explicit Data Members
	private String name;
	private int amount;
	
	// Explicit Constructor
	public Cost(final String name, final int amount) {
		this.name = name;
		this.amount = amount;
	}
	
	// Getters and Setters
	public String getName() {
		return name;
	}
	
	public int getAmount() {
		return amount;
	}
}
