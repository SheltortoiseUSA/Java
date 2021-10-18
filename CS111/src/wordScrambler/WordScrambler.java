package wordScrambler;

import java.util.Scanner;
import java.util.Random;

public class WordScrambler {

	public static void main(String[] args) {
		String[][] dictionary = {	{"steak", "candy", "peach"},
									{"milk", "soda", "juice"},
									{"spoon", "fork", "knife"}	};
		
		String[][] dictionaryHelp = {	{"cow", "sugar", "fruit"},
										{"cow", "sugar", "fruit"},
										{"silverware", "silverware", "silverware"}	};
		
		String[][] dictionaryScrambled = {	{"skeat", "dancy", "cheap"},
											{"kilm", "sdoa", "jiuec"},
											{"sonpo", "frko", "finke"}	};
		
		questions(dictionary, dictionaryHelp, dictionaryScrambled);
	}
	public static void questions(String[][] dictionary, String[][] dictionaryHelp, String[][] dictionaryScrambled) {
		Random rng = new Random();
		int randomIntX = rng.nextInt(3);
		int randomIntY = rng.nextInt(3);
		
		System.out.println("What is " + dictionaryScrambled[randomIntX][randomIntY] + " unscrambled?");
		
		userInput(dictionary, dictionaryHelp, dictionaryScrambled, randomIntX, randomIntY);
	}
	public static void userInput(String[][] dictionary, String[][] dictionaryHelp, String[][] dictionaryScrambled, int randomIntX, int randomIntY) {
		Scanner scan = new Scanner(System.in);
		String input = scan.nextLine();
		input.toLowerCase();
		
		if(input.equals("help")) {
			System.out.println(dictionaryHelp[randomIntX][randomIntY]);
			
			userInput(dictionary, dictionaryHelp, dictionaryScrambled, randomIntX, randomIntY);
		}
		calculation(dictionary, dictionaryHelp, dictionaryScrambled, input, randomIntX, randomIntY);
	}
	public static void calculation(String[][] dictionary, String[][] dictionaryHelp, String[][] dictionaryScrambled, String input,  int randomIntX, int randomIntY) {
		for(int x = 0; x < dictionary.length; x++) {
			for(int y = 0; y < dictionary.length; y++) {
				if(input.equals(dictionary[randomIntX][randomIntY])) {
					System.out.println("Correct.");
					
					questions(dictionary, dictionaryHelp, dictionaryScrambled);
				}
				else {
					System.out.println("Incorrect, try again.");
					
					userInput(dictionary, dictionaryHelp, dictionaryScrambled, randomIntX, randomIntY);	
				}
			}
		}
	}
}