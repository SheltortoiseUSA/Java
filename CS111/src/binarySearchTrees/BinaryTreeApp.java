package binarySearchTrees;

public class BinaryTreeApp {

	public static void main(String[] args) {
		BST b1 = new BST();
		
		b1.addNode(10);
		b1.addNode(5);
		b1.addNode(6);
		b1.addNode(9);
		b1.addNode(4);
		b1.addNode(3);
		b1.addNode(7);
		b1.addNode(2);
		b1.addNode(1);
		b1.addNode(8);
		
		b1.delete(8);
		
		b1.inOrderTraversal();
		
		System.out.println("");
		System.out.println("The smallest number is " + b1.findSmallest());
	}
}