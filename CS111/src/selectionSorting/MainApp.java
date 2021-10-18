package selectionSorting;

import java.util.Arrays;

public class MainApp {

	public static void main(String[] args) {
		int[] arr = {1, 5, 3, 4, 2, 6, 8, 7, 9, 0};
		
		System.out.print(Arrays.toString(arr));
		
		Sorter.insertionSort(arr);
		
		System.out.println();
		System.out.println(Arrays.toString(arr));
	}
}