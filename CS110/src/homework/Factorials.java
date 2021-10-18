package homework;

public class Factorials {

	public static void main(String[] args) {
		int a = 1;
		
		for(int i = 10; i > 0; i--) {
			Arithmetic(a, i);
		}
	}
	public static void Arithmetic(int a, int num){
		while(num > 1){
			a = a * num;
			num--;
		}
		System.out.println(a);
	}		
}