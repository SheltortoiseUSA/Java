package contingATree;

public class BST {
	private Node root;
	
	public static int nodeCounter = 0;
	public static int singleCounter = 0;
	
	public BST() {
		root = null;
	}
	public void inOrderTraversal() {
		countNodes(root, nodeCounter);
	}
	private void countNodes(Node root, int nodeCounter){
		if(root != null) {
			countNodes(root.left, nodeCounter);
			countNodes(root.right, nodeCounter);
		}
		if(root == null) {
			counterAdd();
		}
	}
	public void addNode(int n) {
		Node temp = new Node();
		temp.n = n;
		temp.left = null;
		temp.right = null;
		
		if(root == null) {
			root = temp;
		}
		else {
			Node pointer = root;
			while(true) {
				if(temp.n > pointer.n) {
					if(pointer.right != null)
						pointer = pointer.right;
					else{
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
	public static void counterAdd() {
		nodeCounter += 1;
	}
	public static void diplayCounters() {
		System.out.println("Number of nodes: " + (nodeCounter - 1));
		System.out.println("Number of single parents: " + singleCounter);
	}
	public void countSingles() {
		int n = findSmallest();
		
		boolean found = false;
		
		Node nodePtr = root;
		Node parentPtr = null;
		
		while(!found && nodePtr != null) {
			if(n == nodePtr.n) {
				found = true;
			}
			else {
				parentPtr = nodePtr;
				
				if(n > nodePtr.n) {
					nodePtr = nodePtr.right;
					singleCounter += 1;
				}	
				else {
					nodePtr = nodePtr.left;
					singleCounter += 1;
				}	
			}
		}
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
	}
	public int findSmallest(){
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