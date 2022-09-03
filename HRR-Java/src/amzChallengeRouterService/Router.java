package amzChallengeRouterService;

public class Router {
	// Data Members
	private int location;
	private int range;
	
	// Explicit Constructor
	public Router(final int _LOCATION, final int _RANGE) {
		location = _LOCATION;
		range = _RANGE;
	}
	
	// Getters and Setters
	public int getLocation() {
		return location;
	}
	
	public int getRange() {
		return range;
	}
}
