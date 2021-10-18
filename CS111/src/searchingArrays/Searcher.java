package searchingArrays;

public class Searcher {
	public static int sequentialSearch(int[] arr, int value) {
		for(int i = 0; i < arr.length; ++i) {
			if(arr[i] == value) {
				return i;
			}
		}
		return -1;
	}
	public static int binarySearch(int[] arr, int value) {
		int first = 0;
		int mid;
		int last = arr.length - 1;
		
		while(first <= last) {
			mid = (first + last) / 2;
			
			if(value == mid) {
				return mid;
			}
			else if(value < arr[mid]) {
				last = mid - 1;
			}
			else {
				first = mid + 1;
			}
		}
		return -1;
	}
	public static int recursiveBinarySearch(int arr[], int first, int last, int value) {
		if(first > last) {
			return -1;
		}
		else {
			int mid = (first + last) / 2;
			
			if(arr[mid] == value) {
				return mid;
			}
			else if(arr[mid] < value) {
				return recursiveBinarySearch(arr, mid + 1, last, value);
			}	
			else {
				return recursiveBinarySearch(arr, first, mid - 1, value);
			}
		}
	}
}