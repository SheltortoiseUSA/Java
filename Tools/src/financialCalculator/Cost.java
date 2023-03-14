package financialCalculator;

public class Cost {
	// Explicit Data Members
	private String name;
	private int amount;
	private int frequency;
	
	// Explicit Constructor
	public Cost(final String name, final int amount, final int frequency) {
		this.name = name;
		this.amount = amount;
		this.frequency = frequency;
	}
	
	// Getters and Setters
	public String getName() {
		return name;
	}
	
	public int getAmount() {
		return amount;
	}
	
	public int getFrequency() {
		return frequency;
	}
}
