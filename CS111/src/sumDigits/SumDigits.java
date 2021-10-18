package sumDigits;

public class SumDigits {

	public static void main(String[] args) {
		String str1 = "What time is 4 and 5 before 6?";
		
		int sum = sumDigits(str1);
		
		System.out.println("Sum is " + sum);
	}
	public static int sumDigits(String str) {
		int sum = 0;
		
		for(int i = 0; i < str.length(); i++) {
			char c = str.charAt(i);
			
			if(c >= '0' && c <= '9') {
				sum += c - '0';
			}
		}
		return sum;
	}
}