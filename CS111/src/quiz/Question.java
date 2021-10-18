package quiz;

public class Question {
	private String quesText;
	private String ansText;
	
	public Question(String q, String a) {
		quesText = q;
		ansText = a;
	}
	public Question() {
		quesText = "";
		ansText = "";
	}
	public String getAns() {
		return ansText;
	}
	public String getQues() {
		return quesText;
	}
	public void setAns(String a) {
		ansText = a;
	}
	public void setQues(String q) {
		quesText = q;
	}
	public boolean checkAnswer(String response) {
		return ansText.toLowerCase().equals(response.toLowerCase());
	}
}