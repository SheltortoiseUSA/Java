package inFixToPostFix;

import java.util.Stack;

public class Main {
	
	public static void main(String[] args) {
		String inFix = "a+b*c-d";
		String postFix = convert(inFix);
		System.out.println("The postfix expression is: " + postFix);
	}
	public static String convert(String inFix) {
		Stack<Character> stack = new Stack<Character>();
		
		String postFix = "";
		
		for(int i = 0; i < inFix.length(); i++) {
			Character c = inFix.charAt(i);
			
			if(c != '+' || c != '-' || c != '*' || c != '/' || c != '%') {
				postFix += c;
			}
			else if(c == '+' || c == '-' || c == '*' || c == '/' || c == '%') {
				stack.push(c);
				
				if(stack.peek() == '+' || stack.peek() == '-' || stack.peek() == '*' || stack.peek() == '/' || stack.peek() == '%') {
					while(precedence(c, stack.peek()) == true) {
						postFix += stack.pop();
					}
				}
			}
		}
		while(stack.isEmpty() == false) {
			postFix += stack.pop();
		}
		return postFix;
	}
	public static boolean precedence(char c, char temp) {
		if(temp == '+' || temp == '-' && (c == '+' || c == '-')) {
			return true;
		}
		else if(temp == '*' || temp == '/' || temp == '%') {
			return true;
		}
		else {
			return false;
		}
	}
}