package reverseSentences;

public class ReverseSentenceMain {
	
	public static void main(String ARGS[]) {
		StackMaker s1 = new StackMaker("Twinkle twinkle litttle star.");
		StackMaker s2 = new StackMaker("How I wish I was where you are.");
		
		s1.createStack();
		s2.createStack();
	}
}