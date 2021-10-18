package postFixToInFix;

import java.util.Stack;
 
public class InFixToPostFix {
	private static String inFix;
    private static Stack s;
    
    public InFixToPostFix(String _inFix) {
    	inFix = _inFix;
		s = new Stack();
	}	
    public static void convert() {
    	String postFix = "";
    	
    	boolean isFirst = false;
		
		for(int i = 0; i < inFix.length(); i++) {
			Character tempChar = inFix.charAt(i);

			if(isOperator(tempChar) == false) {
				postFix += tempChar.toString();

				if(i == (inFix.length() - 1)) {
					while(s.empty() == false){
						postFix += s.pop();
					}
				}
			}
			else {
				if(isFirst == true) {
					if(lowerPrecedence(tempChar) == true && lowerPrecedence((Character)s.peek()) == true) {
						postFix += s.pop();
						s.push(tempChar);

						if(i == (inFix.length() - 1)) {
							while(s.empty() == false) {
								postFix += s.pop();
							}
						}
					}
					else if(higerPrecedence(tempChar) == true && higerPrecedence((Character)s.peek()) == true) {
						postFix += s.pop();
						s.push(tempChar);
						
						if(i == (inFix.length() - 1)) {
							while(s.empty() == false) {
								postFix += s.pop();
							}
						}
					}
					else if(lowerPrecedence(tempChar) == true && higerPrecedence((Character)s.peek()) == true) {
						postFix += s.pop();
						s.push(tempChar);
						
						if(i == (inFix.length() - 1)) {
							while(s.empty() == false) {
								postFix += s.pop();
							}
						}
					}
					else if(higerPrecedence(tempChar) == true && lowerPrecedence((Character)s.peek()) == true) {
						s.push(tempChar);
						
						if(i == (inFix.length() - 1)) {
							while(s.empty() == false) {
								postFix += s.pop();
							}
						}
					}
					else {
						postFix += tempChar.toString();
						
						if(i == (inFix.length() - 1)) {
							while(s.empty() == false) {
								postFix += s.pop();
							}
						}
					}
				}
				else {
					s.push(tempChar);
					isFirst = true;
				}
			}
		}
		System.out.println(postFix);
	}
	public static boolean isOperator(char tempChar) {
		switch(tempChar) {
			case '+':
				return true;
			case '-':
				return true;
			case '/':
				return true;
			case '*':
				return true;
			case '%':
				return true;
			default:
				return false;
		}
	}
	public static boolean lowerPrecedence(char tempChar) {
		switch(tempChar) {
			case '+':
				return true;
			case '-':
				return true;
			default:
				return false;
		}
	}
	public static boolean higerPrecedence(char tempChar) {
		switch(tempChar) {
			case '*':
				return true;
			case '/':
				return true;
			case '%':
				return true;
			default:
				return false;
		}
	}
}
//123*+4-