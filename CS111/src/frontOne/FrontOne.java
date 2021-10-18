package frontOne;

public class FrontOne {

	public static void main(String[] args) {
		int[] arr = {1, 5, 9, 1, 8};
		int[] nums = oneToTheFront(arr);
		
		for(int i = 0; i < nums.length; i++) {
			System.out.println(nums[i]);
		}
	}
	public static int[] oneToTheFront(int[] arr) {
		int nextOneLocation = 0;
		
		for(int i = 0; i < arr.length; i++) {
			if(arr[i] == 1) {
				int temp = arr[nextOneLocation];
				arr[nextOneLocation] = 1;
				arr[i] = temp;
				
				nextOneLocation++;
			}
		}
		return arr;
	}
}