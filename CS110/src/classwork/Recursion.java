package classwork;

public class Recursion {

	public static void main(String[] args) {
		System.out.println(factorial(6));
		System.out.println(recursiveFactorial(6, 1));
	}
	public static int factorial(int num) {
		int answer = 1;
		
		while(num > 1) {
			answer *= num;
			
			num--;
		}
		return answer;
	}
	public static int recursiveFactorial(int inputNum, int answer) {
		if(inputNum == 1) {
			return answer;
		}
		answer *= inputNum;
		inputNum--;
		
		return recursiveFactorial(inputNum, answer);
	}
}