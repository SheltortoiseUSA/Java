package postFixToInFix;

public class Controller {
	
	public static void main(String[] ARGS) {
		InFixToPostFix n1 = new InFixToPostFix("a+b*c-d");
		n1.convert();
	}
}