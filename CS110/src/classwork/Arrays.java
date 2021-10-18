package classwork;

public class Arrays {
	
	public static void main(String[] args) {
		int[] arr;
		
		int num = 20;
		
		int[] arr2 = new int[3];
		
		arr2[0] = 55;
		arr2[1] = 10;
		arr2[2] = 20;
		
		num = arr2[2];
		
		System.out.println(arr2[2]);
		System.out.println(num);
		
		int[] arr3 = {1, 2, 3};
		
		System.out.println(arr3[0]);
		System.out.println(arr3[1]);
		System.out.println(arr3[2]);
		
		int[] arr4 = {1, 2, 3};
		
		for(int i = 0; i < arr4.length; i++) {
			System.out.println("The i value is: " + i + " myArray value is: " + arr4[i]);
		}
	}
}