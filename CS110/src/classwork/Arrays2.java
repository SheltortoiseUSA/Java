package classwork;

public class Arrays2 {
	
	public static void main(String[] args) {
		int[] arr = {16, 4};
		
		if(arr[1] < arr[0]) {
			int temp = arr[0];
			
			arr[0] = arr[1];
			arr[1] = temp;
		}
		for(int value : arr) {
			System.out.println(value);
		}
		System.out.println();
		
		int[] arr2 = {50, 1, 6, 4, 20, 15};
		
		for(int a = 0; a < arr2.length - 1; ++a) {
			for(int b = 0; b < arr2.length - 1; ++b) {
				if(arr2[b] > arr2[b + 1]) {
					int temp = arr2[b];
					arr2[b] = arr2[b + 1];
					arr2[b + 1] = temp;
				}
			}
		}
		for(int value2 : arr2) {
			System.out.println(value2);
		}
	}
}