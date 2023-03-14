package weddingCalculator;

public class Cost {
	// Explicit Data Members
	private String costType;
	private int cost;

	// Explicit Constructor
	public Cost(final String costType, final int cost) {
		this.costType = costType;
		this.cost = cost;
	}
	
	// Getters and Setters
	public String getCostType() {
		return costType;
	}
	
	public int getCost() {
		return cost;
	}
}
