package nodes;

public class LinkedListApp {

	public static void main(String[] args) {
		Linked myList = new Linked();
		
		myList.addNode(2);
		myList.addNode(1);
		myList.addNode(5);
		myList.addNode(3);
		
		myList.display();
		
		myList.removeNode(3);
		
		System.out.println();
		
		myList.display();
	}
}