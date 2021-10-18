package sortingArrays;

public class BinaryRecursionSort {
	
	public static void quickSort(int[] array) {
        recursiveQuickSort(array, 0, array.length - 1);
    }
    public static void recursiveQuickSort(int[] array, int min, int max) {
        int mid = partition(array, min, max);
        
        if(min < mid - 1) {
            recursiveQuickSort(array, min, mid - 1);
        }
        if(max > mid) {
            recursiveQuickSort(array, mid, max);
        }
    }
    public static int partition(int[] array, int left, int right) {
    	int pivot = array[left];
    	
        while (left <= right) {
            while(array[left] < pivot) {
                left++;
            }
            while(array[right] > pivot) {
                right--;
            }
            if(left <= right) {
                int temp = array[left];
                array[left] = array[right];
                array[right] = temp;
                
                left++;
                right--;
            }
        }
        return left;
    }
}