package fruitList;

import java.util.ArrayList;
import java.util.Random;

public class ScrambledFruitList {

	public static void main(String[] args) {
		ArrayList<String> fruitNames = new ArrayList<String>();
						
		fruitNames.add("strawberries");
		fruitNames.add("apples");
		fruitNames.add("cantelopes");
						
		for(int i = 0; i < fruitNames.size(); i++) {
			int randomIndex = (int) (Math.random() + 2);
			
			String temp = (String) fruitNames.get(i);
			
			fruitNames.set(i, fruitNames.get(randomIndex));
			fruitNames.set(randomIndex, temp);
		}
		System.out.println(fruitNames);
	}		
}