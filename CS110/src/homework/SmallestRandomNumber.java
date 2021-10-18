package homework;

import java.util.Random;

public class SmallestRandomNumber {

	public static void main(String[] args) {
		Random rng = new Random();
			
		int[][] arr = new int[10][10];
			
		for(int a = 0; a < arr.length; a++) {
			for(int b = 0; b < arr.length; b++) {
				int randomInt = rng.nextInt(99) + 1;
				
				arr[a][b] = randomInt;
			}
		}
		for(int i = 0; i < arr.length; i++) {
			for(int j = 0; j < arr.length; j++) {
				System.out.print(arr[i][j] + "\t");
			}
			System.out.println();
		}
		int counter = arr[0][0];
			
		for(int x = 0; x < arr.length; x++) {
			for(int y = 0; y < arr.length; y++) {	
				if(counter > arr[x][y]) {
					counter = arr[x][y];
				}
				else {
					// Do Nothing
				}
			}
		}
		System.out.println(counter);
	}
}