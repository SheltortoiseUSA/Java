package sortingArrays;

public class SelectionSort {
	
	public static int[] selectionSort(int[] arr) {
		int min;
		int temp;
		
		for(int x = 0; x < arr.length; x++) {
			min = x;
			
			for(int y = x + 1; y < arr.length; y++) {
				if(arr[y] < arr[min]) {
					min = y;
				}
			}
			if(min != x) {
				temp = arr[x];
				arr[x] = arr[min];
				arr[min] = temp;
			}
		}
		return arr;
	}
}