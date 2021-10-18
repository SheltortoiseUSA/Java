package typeTest;

import java.util.Scanner;

public class TextTutorEngine {
	private String question;
	
	public TextTutorEngine(String _question) {
		question = _question;
	}
	public String question() {
		System.out.println(question);
		
		Scanner scan = new Scanner(System.in);
		String input = scan.nextLine();
		
		return input;
	}
	public int addPoints(String input) {
		int pointCounter = 0;
		
		for(int i = 0; i < question.length() - 1 ; i++) {
			if((input.charAt(i)) == (question.charAt(i))) {
				pointCounter += 1;
			}
		}
		return pointCounter;
	}		
}