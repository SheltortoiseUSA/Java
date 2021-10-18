package recursionAlgorithm;

public class RecursionAlgorithm {

	public static void main(String[] args) {
		System.out.println("The product of 2 x 7 is " + mult(2,7));
	}
	static int mult(int x, int y) {
		if(y == 0) {
			return 0;
		}
		else if(y == 1) {
			return x;
		}
		else {
			return x + mult(x, y - 1);
		}
	}
}