package costarChallengeShoeSorter;

public class Shoe {
	private int size;
	private char foot;
	private String type;
	
	public Shoe() {
		
	}
	
	public Shoe(final int size, final char foot, final String type) {
		this.size = size;
		this.foot = foot;
		this.type = type;
	}
	
	public int getSize() {
		return size;
	}
	
	public char getFoot() {
		return foot;
	}
	
	public String getType() {
		return type;
	}
	
	@Override
	public String toString() {
		return ("{ " + size + ", " + foot + ", " + type + " }");
	}
}
