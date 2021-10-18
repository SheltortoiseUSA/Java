package quiz;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Quiz {
	private ArrayList<Question> questionList;
	private int numCorrect;
	
	public Quiz() {
		questionList = new ArrayList<Question>();
		numCorrect = 0;
	}
	public void addQuestion(Question q) {
		questionList.add(q);
	}
	public void shuffleList() {
		Collections.shuffle(questionList);
	}
	public void start() {
		Scanner scan = new Scanner(System.in);
		
		numCorrect = 0;
		
		for(int i = 0; i < questionList.size(); i++) {
			System.out.println("Question: " + (i + 1) + ": " + questionList.get(i).getQues());
			System.out.println(" Your answer: ");
			
			String response = scan.nextLine();
			
			if(questionList.get(i).checkAnswer(response) == true) {
				System.out.println("Correct!");
				
				numCorrect++;
			}
			else {
				System.out.println("Incorrect. Answer: " + questionList.get(i).getAns());
			}
		}
	}
	public void showResults() {
		System.out.println("You have completed the quiz");
		System.out.println("Total number of questions:\t" + questionList.size());
		System.out.println("Number of correct answers:\t" + numCorrect);
		System.out.println("Score: " + (int) ((double) numCorrect / questionList.size() * 100) + "%");
	}
}