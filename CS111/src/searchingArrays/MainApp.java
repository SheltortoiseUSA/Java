package searchingArrays;

public class MainApp {

	public static void main(String[] args) {
		int[] arr = {1, 2, 5, 10, 25, 36};
		
		System.out.println("25 is at location: " + Searcher.sequentialSearch(arr, 25));
		System.out.println("25 is at location: " + Searcher.binarySearch(arr, 25));
		System.out.println("25 is at location: " + Searcher.recursiveBinarySearch(arr, 0, arr.length - 1, 25));
	}
}