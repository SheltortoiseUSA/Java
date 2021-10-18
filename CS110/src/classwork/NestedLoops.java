package classwork;

public class NestedLoops {
	
	public static void main(String[] args) {
		for(int outer = 0; outer < 10; outer++) {
			for(int inner = 0; inner < 2; inner++) {
				System.out.println("Outer Loop:" + outer + ", Inner Loop:" + inner);
			}
		}
	}
}