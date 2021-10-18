package sumOfSquares;

public class SumOfSquares {

	public static void main(String[] args) {
		System.out.println(sumSquares(4));
	}
	static int sumSquares(int n) {
		if(n == 1) {
			return 1;
		}
		else {
			return n * n + sumSquares(n - 1);
		}
	}
}