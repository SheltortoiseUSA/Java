package homework;

public class ArrayMethod {
	
	public static void main(String[] args) {
		int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
		
		double sum = 0;
		double average = 0;
		
		displayIntegers(array);
		reverseOrder(array);
		sum(sum, average, array);
	}
	public static void displayIntegers(int[] array) {
		for(int i = 0; i < array.length; i++) {
			System.out.println(array[i]);
		}
		System.out.println();
	}
	public static void reverseOrder(int[] array) {
		for(int z = (array.length - 1); z >= 0; z--) {
			System.out.println(array[z]);
		}
		System.out.println();
	}
	public static void sum(double sum, double average, int[] array) {
		for(int i = 0; i < array.length; i++) {
			sum = sum + array[i];
		}
		System.out.println(sum);
		System.out.println();
		
		limitingArgument(sum, average, array);
		System.out.println();
	}
	public static void limitingArgument(double sum, double average, int[] array) {
		for(int z = array.length; z > 3; z--) {
			System.out.println(z);
		}
		System.out.println();
		
		average(sum, average, array);
	}
	public static void average(double sum, double average, int[] array){
		average = (sum / array.length);
		
		for(int z = (array.length - 1); z >= 0; z--) {
			if(average < array[z]) {
				System.out.println(array[z]);
			}
			else if(average >= array[z]) {
				// Do Nothing
			}
			else {
				System.out.println("error");
			}
		}
	}
}