package homework;

public class CountByThrees {

	public static void main(String[] args) {
		int a = 0;
		
		while(a < 300) {
			System.out.print((a = a + 3) + " ");
			
			if(a == 30 || a == 60 || a == 90 || a == 120 || a == 150 || a == 180 || a == 210 || a == 240 || a == 270 || a == 300) {
				System.out.println();
			}
		}
	}
}