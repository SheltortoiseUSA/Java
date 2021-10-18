package homework;

public class RightTriangleValidater {

	public static void main(String[] args) {
		int a = 5;
		int b = 7;
		int c = 13;
		
		int pythagorean = ((a^2 + b^2) / (c^2));
		
		if(pythagorean > 1) {
			System.out.println("It's not a right triangle.");			
		}
		else if(pythagorean < 1) {
			System.out.println("It's not a right triangle.");
		}
		else {
			System.out.println("It is a right triangle.");
		}
		System.out.println("Done Calculating");
	}
}