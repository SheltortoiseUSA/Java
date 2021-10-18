package commonDivisor;

public class CommonDivisor {

	public static void main(String[] args) {
		System.out.println(gcd(100, 20));
	}
	static int gcd(int n1, int n2){
		if(n2 == 0) {
			return n1;
		}
		else {
			return gcd(n2, n1 % n2);
		}	
	}
}