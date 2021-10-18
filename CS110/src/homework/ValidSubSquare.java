package homework;

import java.util.Random;

public class ValidSubSquare {

	public static void main(String[] args) {
		int[][] subSquare = new int[3][3];
		
		setSquares(subSquare);
	}	
	public static void setSquares(int[][] subSquare) {
		Random rng = new Random();
		
		for(int a = 0; a < subSquare.length; a++) {
			for(int b = 0; b < subSquare.length; b++) {
				int randomInt = rng.nextInt(8) + 1;
				
				subSquare[a][b] = randomInt;
			}
		}
		int counter = 0;
		
		for(int i = 0; i < subSquare.length; i++) {
			for(int j = 0; j < subSquare.length; j++) {
				System.out.print(subSquare[i][j] + "\t");
			}
			System.out.println();
		}
		validater(subSquare, counter);
	}
	public static void validater(int[][] subSquare, int counter) {
		for(int x = 0; x < subSquare.length; x++) {
			for(int y = 0; y < subSquare.length; y++) {
				if(counter == subSquare[x][y]) {
					System.out.println("Invalid");
					System.out.println();
					
					setSquares(subSquare);
				}
				else {
					// Do Nothing
				}
			}
		}
	}
}