package bigInt;

public class BigInt {
	private String str;
	
	public BigInt(String _str) {
		str = _str;
	}
	public String getA() {
		return str;
	}
	public void setA(String _str) {
		str = _str;
	}
	public void add(BigInt y) {
		String revX = (reverseString(str));
		String revY = (reverseString(y.getA()));
		
		int[] arr;
		
		if(revX.length() > revY.length()) {
			arr = new int[revX.length() + 1];
		}
		else {
			arr = new int[revY.length() + 1];
		}
		int[] arrY;
		
		if(revX.length() > revY.length()) {
			arrY = new int[revX.length()];
		}
		else {
			arrY = new int[revY.length() + 1];
		}
		int[] arrX;
		
		if(revY.length() > revX.length()) {
			arrX = new int[revY.length()];
		}
		else {
			arrX = new int[revX.length() + 1];
		}
		// Store Integers in Arrays
		for(int a = 0; a < revX.length(); a++) {
			arrX[a] = toInt(revX.charAt(a));	
		}
		for(int b = 0; b < revY.length(); b++) {
			arrY[b] = toInt(revY.charAt(b));
		}
		String sum = "";
		
		int carry = 0;
		
		for(int i = 0; i < arr.length - 1; i++) {
			int temp = (arrY[i] + arrX[i]);
			
			arr[i] = ((temp + carry) % 10);
			carry = ((temp + carry) / 10);
			sum += arr[i];
		}
		System.out.println("The sum is: ");
		
		if(carry == 0) {
			System.out.println(reverseString(sum));
		}
		else {
			System.out.print(reverseString(sum + carry));
		}
	}
	public String reverseString(String str) {
		String reverse = new StringBuffer(str).reverse().toString();
		
		return reverse;
	}
	public static int toInt(char chr) {
		int sum = 0;
		
		char c = chr;
		
		if(c >= '0' && c <= '9') {
			sum += c - '0';
		}
		return sum;
	}
}