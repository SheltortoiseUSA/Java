package fruitList;

import java.util.ArrayList;

public class FruitList{

	public static void main(String[] args){
		ArrayList<String> fruitNames = new ArrayList<String>();
				
		fruitNames.add("strawberries");
		fruitNames.add("apples");
		fruitNames.add("cantelopes");
				
		String first = fruitNames.get(0);
		String last = fruitNames.get(fruitNames.size() - 1);
		
		fruitNames.set(0, last);
		fruitNames.set(fruitNames.size() - 1, first);
				
		fruitNames.remove(1);
				
		System.out.println(fruitNames);
	}
}