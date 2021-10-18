package nodeTestScores;

import nodeTestScores.LinkedTC;

public class LinkedListAppTC {

	public static void main(String[] args) {
		LinkedTC myList = new LinkedTC();
		
		myList.addNode("Roger", "Baca", 70);
		myList.addNode("Suzy", "Davis", 98);
		myList.addNode("Bobo", "Green", 50);
		myList.addNode("Cat", "Ling", 85);
		myList.addNode("Ken", "Molich", 99);
		
		myList.display();
	}
}