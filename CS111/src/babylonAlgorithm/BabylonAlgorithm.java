package babylonAlgorithm;

public class BabylonAlgorithm {

	public static void main(String[] args) {
		average(2, 2);
		System.out.println();
		
		average(9, 9);
		System.out.println();
		
		average(100, 100);
		System.out.println();
		
		average(1000, 1000);
	}
	public static void average(double x, double y) {
		System.out.println(y);
		
		for(int i = 0; i < 10; i++) {
			double temp = y;
			double average = ((y + x / y) / 2);
			
			if(temp != average) {
				System.out.println(average);
			}
			y = average;
		}		
	}
}