package selectionSorting;

public class Sorter {
	
	public static void insertionSort(int[] arr) {
		for(int i = 0; i < arr.length - 1; i++) {
			int smallest = i;
			
			for(int k = i + 1; k < arr.length; k++) {
				if(arr[k] < arr[smallest]) {
					smallest = k;
				}
			}
			int temp = arr[i];
			arr[i] = arr[smallest];
			arr[smallest] = temp;
		}
	}
}