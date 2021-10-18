package rotatingAnArray;

public class RotationArray {

	public static void main(String[] args) {
		int[][] arr = {		{11, 22, 33},
							{44, 55, 66},
							{77, 88, 99}	};
		
		for(int x = 0; x < arr.length; x++) {
			for(int y = 0; y < arr.length; y++) {
				System.out.print(arr[x][y] + "\t");
			}
			System.out.println();
		}
		System.out.println();
		
		int[][] rotatedArr = new int[3][3];
		
		rotatedArr[0][0] = arr[2][0];
		rotatedArr[1][0] = arr[2][1];
		rotatedArr[2][0] = arr[2][2];
		
		rotatedArr[0][1] = arr[1][0];
		rotatedArr[1][1] = arr[1][1];
		rotatedArr[2][1] = arr[1][2];
		
		rotatedArr[0][2] = arr[0][0];
		rotatedArr[1][2] = arr[0][1];
		rotatedArr[2][2] = arr[0][2];
		
		for(int a = 0; a < rotatedArr.length; a++) {
			for(int b = 0; b < rotatedArr.length; b++) {
				System.out.print(rotatedArr[a][b] + "\t");
			}
			System.out.println();
		}
	}
}