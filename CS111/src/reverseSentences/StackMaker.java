package reverseSentences;

import java.util.Stack;

public class StackMaker {
	private String para;
	
	public StackMaker(String _para) {
		para = _para;
	}
	public Stack createStack() {
		Stack<String> reverse = new Stack<String>();
		
		String temp = "";
		
		int counter = 0;
		
		for(int i = 0; i < para.length(); i++) {
			if(para.charAt(i) == '.') {
				char tempChar = Character.toUpperCase(temp.charAt(0));
				temp = tempChar + temp.substring(1);
				
				String temp2 = (reverse.get(0).replace(' ', '.'));
				temp2 += ' ';
				reverse.set(0, temp2);
				
				reverse.push(temp + ' ');
				
				break;
			}
			else if(para.charAt(i) != ' ') {
				temp += para.charAt(i);
			}
			else {
				temp += para.charAt(i);
				reverse.push(temp);
				temp = "";
				
				counter++;
			}
		}
		int size = reverse.size();
		
		for(int x = 0; x < size; x++) {
			System.out.print(reverse.pop());
		}
		return reverse;
	}
}