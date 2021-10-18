package homework;

import java.util.Random;

public class SumTheDiagonal {

	public static void main(String[] args) {
		Random rng = new Random();
		
		int[][] array = new int[10][10];
		
		for(int a = 0; a < array.length; a++) {
			for(int b = 0; b < array.length; b++) {
				int randomInt = rng.nextInt(99) + 1;
				
				array[a][b] = randomInt;
			}
		}
		for(int i = 0; i < array.length; i++) {
			for(int j = 0; j < array.length; j++) {
				System.out.print(array[i][j] + "\t");
			}
			System.out.println();
		}
		int solution = 0;
		int diagonalInt = 0;
		
		for(int z = 0; z < array.length; z += 1) {
			diagonalInt = array[z][z];
			
			solution = solution + diagonalInt;
		}
		System.out.println(solution);
	}
}