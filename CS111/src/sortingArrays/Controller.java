package sortingArrays;

public class Controller {

	public static void main(String[] args) {
		Stopwatch s1 = new Stopwatch();
		
		int[] arr = new int[100000];
		
		for(int i = 0; i < arr.length; i++) {
			arr[i] = (int) (Math.random() * 100);
		}
		int[] bubArr = arr;
		
		s1.startTimer();
		BubbleSort.bubbleSort(bubArr);
		s1.stopTimer();
		
		System.out.println("Bubble sort took " + s1.getExecutionTime() + " nanoseconds");
		s1.resetTimer();
		System.out.println();
		
		int[] selArr = arr;
		
		s1.startTimer();
		SelectionSort.selectionSort(selArr);
		s1.stopTimer();
		
		System.out.println("Selection sort took " + s1.getExecutionTime() + " nanoseconds");
		s1.resetTimer();
		System.out.println();
		
		int[] recBinArr = arr;
		
		s1.startTimer();
		BinaryRecursionSort.quickSort(recBinArr);
		s1.stopTimer();
		
		System.out.println("Unsorted Recursive Binary sort took " + s1.getExecutionTime() + " nanoseconds");
		s1.resetTimer();
		System.out.println();
		
		int[] largeSorted = new int[100];
		
		for(int d = 0; d < largeSorted.length; ++d) {
			largeSorted[d] = d;
		}
		s1.startTimer();
		BinaryRecursionSort.quickSort(largeSorted);
		s1.stopTimer();
		
		System.out.println("Sorted Recursive Binary sort took " + s1.getExecutionTime() + " nanoseconds");
		s1.resetTimer();
		System.out.println();
		
		System.out.println("Quicksort Magnitude: O(n log(n))");
	}
}