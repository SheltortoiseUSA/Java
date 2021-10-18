package homework;

public class FileSorter {

	public static void main(String[] args) {
		int[] arr = {1, 5, 3, 6, 7, 4, 2, 9, 10, 8};
		
		for(int a = 0; a < arr.length - 1; a++) {
			for(int b = 0; b < arr.length - 1; b++) {
				if(arr[b] > arr[b + 1]){
					int temp = arr[b];
					arr[b] = arr[b + 1];
					arr[b + 1] = temp;
				}
			}
		}
		for(int value : arr) {
			System.out.println(value);
		}
	}
}