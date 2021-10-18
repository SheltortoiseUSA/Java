package homework;

public class TimesTable {
	
	public static void main(String[] args) {
		int[][] array = new int[30][30];
			
		for(int a = 0; a <= array.length - 1; a++) {
			for(int b = 0; b <= array.length - 1; b++) {
				array[a][b] = (a + 1) * (b + 1);
			}
		}
		for(int i = 0; i < array.length; i++) {
			for(int j = 0; j < array.length; j++) {
				System.out.print(array[i][j] + "\t");
			}
			System.out.println();
		}
	}
}