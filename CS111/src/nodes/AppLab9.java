package nodes;

import java.util.LinkedList;
import java.util.ListIterator;

public class AppLab9 {

	public static void main(String[] args) {
		LinkedList <Integer> numbers = new LinkedList <Integer>();
		
		for(int i = 1; i <= 6; i++) {
			numbers.addLast(i);
		}
		System.out.println("The list is " + numbers);
		
		ListIterator<Integer> itr = numbers.listIterator();
		itr.next();
		itr.next();
		itr.next();
		itr.add(4);
		
		System.out.println("The list is " + numbers);
		
		itr.next();
		itr.next();
		itr.remove();
		
		System.out.println("The list is " + numbers);		
	}
}