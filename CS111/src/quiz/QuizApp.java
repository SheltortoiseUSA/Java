package quiz;

public class QuizApp {

	public static void main(String[] args) {
		Question q1 = new Question("Who invented Java?", "James Gosling");
		Question q2 = new Question("In what country was the Java creator born?", "Canada");
		Question q3 = new Question("Who won Superbowl L?", "Denver Broncos");
		Question q4 = new Question("Heliphino", "Elephant and a Rhino");
		Question q5 = new Question("What color is a red apple?", "Red");
		MultipleChoice q6 = new MultipleChoice("The Broncos won");
		MultipleChoice q7 = new MultipleChoice("The Panthers won");
		
		q6.addChoice("True", true);
		q6.addChoice("False", false);
		q6.addChoice("Yes", true);
		q6.addChoice("No", false);
		
		q7.addChoice("True", false);
		q7.addChoice("False", true);
		q7.addChoice("Yes", false);
		q7.addChoice("No", true);
		
		Quiz quiz = new Quiz();
		quiz.addQuestion(q1);
		quiz.addQuestion(q2);
		quiz.addQuestion(q3);
		quiz.addQuestion(q4);
		quiz.addQuestion(q5);
		quiz.addQuestion(q6);
		quiz.addQuestion(q7);
		
		System.out.println("Good Luck");
		quiz.shuffleList();
		quiz.start();
		quiz.showResults();
	}
}