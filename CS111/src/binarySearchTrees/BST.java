package binarySearchTrees;

public class BST {
	// Data Members
	private Node root;
	
	// Constructor
	public BST() {
		root = null;
	}
	// Member Methods
	public void addNode(int n) {
		// Task 1: Create Temp Node
		Node temp = new Node();
		
		temp.n = n;
		temp.left = null;
		temp.right = null;
		
		// S1: If the tree is empty, then place node at root.
		if(root == null) {
			root = temp;
		}
		// S2: If the tree is not empty, then place node where it belongs.
		else {
			Node pointer = root;
			
			while(true) {
				if(temp.n > pointer.n) {
					if(pointer.right != null) {
						pointer = pointer.right;
					}
					else {
						pointer.right = temp;
						
						break;
					}
				}
				else if(temp.n < pointer.n) {
					if(pointer.left != null) {
						pointer = pointer.left;
					}
					else {
						pointer.left = temp;
						
						break;
					}
				}
			}
		}
	}
	public void delete(int n) {
		// Task 1: Find the node that needs to be deleted.
		Node nodePtr = root; // References node to be deleted.
		Node parentPtr = null; // References the parent of the node to be deleted.
		
		boolean isFound = false;
		
		while(!isFound && nodePtr != null) {
			if(n == nodePtr.n) {
				isFound = true;
			}
			else {
				parentPtr = nodePtr;
				
				if(n > nodePtr.n) {
					nodePtr = nodePtr.right;
				}
				else {
					nodePtr = nodePtr.left;
				}
			}
		}
		// Task 2: Delete Node
		if(!isFound) {
			return;
		}
		// S1: Leaf
		if(nodePtr.right == null && nodePtr.left == null) {
			if(parentPtr == null) {
				root = null;
			}
			else if(parentPtr.left == nodePtr) {
				parentPtr.left = null;
			}
			else {
				parentPtr.right = null;
			}	
			return;
		}
		// S2: Single Parent
		if(nodePtr.left == null || nodePtr.right == null) {
			Node child;
			
			if(nodePtr.left == null) {
				child = nodePtr.right;
			}
			else {
				child = nodePtr.left;
			}
			if(parentPtr == null) {
				root = child;
			}
			else if(parentPtr.left == nodePtr) {
				parentPtr.left = child;
			}
			else {
				parentPtr.right = child;
			}
			return;
		}
		// S3: Double Parent
		// SubTask 1: Locate Smallest Child
		Node smallestParent = nodePtr;
		Node smallestChild = nodePtr.right;
		
		while(smallestChild.left != null) {
			smallestParent = smallestChild;
			smallestChild = smallestChild.left;
		}
		// SubTask 2: Move Child
		nodePtr.n = smallestChild.n;
		
		// SubTask 3: Ditch the parent!
		if(smallestParent == nodePtr) {
			smallestParent.right = smallestChild.right;
		}
		else {
			smallestParent.left = smallestChild.right;
		}
	}
	public void inOrderTraversal() {
		inOrderRecursive(root);
	}
	private void inOrderRecursive(Node aRoot) {
		if(aRoot != null) {
			inOrderRecursive(aRoot.left);
			
			System.out.print("   " + aRoot.n);
			
			inOrderRecursive(aRoot.right);
		}
	}
	public int findSmallest() {
		Node pointer = root;
		
		int smallest = pointer.n;
		
		while(pointer != null) {
			if(pointer.n < smallest) {
				smallest = pointer.n;
			}
			pointer = pointer.left;
		}
		return smallest;
	}
}