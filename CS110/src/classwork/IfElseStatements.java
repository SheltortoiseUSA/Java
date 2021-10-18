package classwork;

public class IfElseStatements {
	
	public static void main(String[] args) {
		int peopleInLine = 2;
		
		if(peopleInLine > 3) {
			System.out.println("No Coffee Today");	
		}
		else if(peopleInLine == 3) {
			System.out.println("Ask Barista To Hurry");
		}
		else {
			System.out.println("Get Coffee");
		}
		System.out.println("Go To Class");
	}
}