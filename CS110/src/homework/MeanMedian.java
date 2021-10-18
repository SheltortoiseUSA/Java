package homework;

public class MeanMedian {

	public static void main(String[] args) {
		int[] arr = {1, 7, 3, 5, 4, 6, 2};
		int total = 0;
		
		mean(arr, total);
		median(arr);
	}
	public static void mean(int[] arr, int total) {
		for(int i = 0; i < arr.length; i++) {
			total = total + arr[i];
		}
		System.out.print("The mean is " + (total / arr.length) + ", and ");
	}
	public static void median(int[] arr) {
		for(int a = 0; a < arr.length - 1; a++) {
			for(int b = 0; b < arr.length - 1; b++) {
				if(arr[b] > arr[b + 1]) {
					int temp = arr[b];
					arr[b] = arr[b + 1];
					arr[b + 1] = temp;
				}
			}
		}
		if(arr.length % 2 == 0) {
			System.out.print("the medians are " + arr[(arr.length / 2) - 1] + " and ");
			System.out.print(arr[arr.length / 2] + ".");
		}
		else if((arr.length % 2) != 0) {
			System.out.print("the median is " + arr[(arr.length / 2)] + ".");
		}
		else {
			System.out.println("Error");
		}
	}
}