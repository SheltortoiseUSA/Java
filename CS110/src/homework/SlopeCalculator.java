package homework;

public class SlopeCalculator {

	public static void main(String[] args) {
		int x1 = 1;
		int x2 = 2;
		
		int y1 = 1;
		int y2 = 2;
		
		double slope = calculateSlope(x1, y1, x2, y2);
		
		System.out.println(slope);
	}		
	public static int calculateSlope(int x1, int y1, int x2, int y2) {
		return ((y2 - y1) / (x2 - x1));
	}
}