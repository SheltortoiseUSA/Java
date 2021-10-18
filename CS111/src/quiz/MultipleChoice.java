package quiz;
import java.util.ArrayList;

public class MultipleChoice extends Question {
	private ArrayList<String> choices;
	
	public MultipleChoice(String q) {
		super(q, "");
		
		choices = new ArrayList<String>();
	}
	public void addChoice(String choice, boolean correct) {
		choices.add(choice);
		
		if(correct) {
			setAns(choice);
		}
	}
	public String getQuestion() {
		String gtf = super.getQues();
		gtf += " Choose \n";
		
		for(int i = 0; i < choices.size(); i++) {
			gtf += "   " + choices.get(i) + "\n";
		}	
		return gtf;
	}
}