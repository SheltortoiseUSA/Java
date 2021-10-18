package homework;

import java.util.Scanner;

public class Quiz {

	public static void main(String[] args) {
		int[] correctAnswer = {1, 3, 2, 3, 1, 1, 1, 2, 3, 1};
		
		int letter = 0;

		System.out.println("Sports >> Football");
		questions(letter, 'A', "1. How many points is a TD?", correctAnswer, 0, "A)6  B)7  C)8");
		questions(letter, 'C', "2. How many points is a FG?", correctAnswer, 1, "A)1  B)2  C)3");
		questions(letter, 'B', "3. How many points is a safety?", correctAnswer, 2, "A)1  B)2  C)3");
		questions(letter, 'C', "4. When do teams usually punt the ball?", correctAnswer, 3, "A)1st Down  B)3rd Down  C)4th Down");
		questions(letter, 'A', "5. What happens immediately after a TD?", correctAnswer, 4, "A)PAT  B)FG  C)KO");
		questions(letter, 'A', "6. What happens after a safety?", correctAnswer, 5, "A)Punt  B)KO  C)PAT");
		questions(letter, 'A', "7. How many yards is a first down?", correctAnswer, 6,  "A)10  B)15  C)20");
		questions(letter, 'B', "8. How may players are on offense", correctAnswer, 7,  "A)10  B)11  C)22");
		questions(letter, 'C', "9. How may players are there on the field during a play", correctAnswer, 8,  "A)10  B)11  C)22");
		questions(letter, 'A', "10. What's the best team in the NFL", correctAnswer, 9,  "A)Chargers  B)Raiders  C)None of the above");
	}
	public static void questions(int letter, char charLetter, String questions, int correctAnswer[], int i, String answers) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println(questions);
		System.out.println(answers);
		
		String answer = scan.nextLine();
		answer = answer.toUpperCase();
		
		if(answer.startsWith("A")) {
			multChoice(1, charLetter, correctAnswer, i);
		}
		else if(answer.startsWith("B")) {
			multChoice(2, charLetter, correctAnswer, i);
		}
		else if(answer.startsWith("C")) {
			multChoice(3, charLetter, correctAnswer, i);
		}
		else {
			System.out.println("error input");
			
			questions(letter, charLetter, questions, correctAnswer, i, answers);
		}
	}
	public static void multChoice(int letter, char charLetter, int correctAnswer[], int i) {
		if(letter == correctAnswer[i]) {
			System.out.println("Correct");
		}
		else {
			System.out.println("Incorrect. The answer was " + charLetter);
		}
	}
}