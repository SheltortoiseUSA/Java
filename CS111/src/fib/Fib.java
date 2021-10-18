package fib;

public class Fib {

	public static void main(String[] args) {
		System.out.println("The n-th fib term is " + f(75));
	}
	static int f(int n) {
		
		if(n ==1 || n == 2) {
			return 1;
		}
		else {
			return f(n - 1) + f(n - 2);
		}
	}
}