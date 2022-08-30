package interviewChallenges;

import java.util.*;

/* Sample Amazon Interview Question
 * 
 * Note:
 *  - I sadly required outside help in completing this task.
 *  - I could not get the left and right nodes to print recursively wihtout userping their level.
 *  - https://stackoverflow.com/questions/52517287/level-order-traversal-in-a-binary-search-tree-in-java
 */
public class AMZ_Tree_Print_Level_Order {
	// Global Node queue for Node queue scheduling.
	private static Queue<Node> nodeQueue = new LinkedList<Node>();

	public static void main(String[] args) {
		// Generates a random number of iterations, between [1-100].
		int iterations = (int) ((Math.random() * 7) + 1);
		
		// Default Root Node
		Node root = null;
		
		// Iterates for a random number of iterations and populates the tree.
		while (iterations-- > 0) {
			// Generates a random node data and inserts it into the tree.
			final int DATA = (int) ((Math.random() * 10) + 1);
			root = insert(root, DATA);
			
			// Prints Each Random Number
			System.out.println("Input Data: " + DATA);
		}
		
		// Non-recursive Level Order Printing of the Binary Tree
		levelOrderPrinter(root);
	}
	
	// Custom function to print the tree.
	private static void levelOrderPrinter(final Node ROOT) {
		// If the Adam Node is null, then abort printing.
		if (ROOT == null) {
			return;
		}
		
		// Pushes the Adam Node onto the Queue.
		nodeQueue.add(ROOT);
		
		// Depletes the Queue like a job scheduler.
		while (!nodeQueue.isEmpty()) {
			// Sets a temporary Node to copy the next scheduled line to print.
			final Node TEMP_NODE = nodeQueue.remove();
			print(TEMP_NODE.name);
			
			// Queues the next child Node to the left if present.
			if (TEMP_NODE.left != null) {
				nodeQueue.add(TEMP_NODE.left);
			}
			
			// Queues the next child Node to the right if present.
			if (TEMP_NODE.right != null) {
				nodeQueue.add(TEMP_NODE.right);
			}
		}
	}
	
	// Custom function to print desired output.
	private static void print(final int NAME) {
		System.out.print(NAME + " ");
	}
	
	// Custom object Node to store a parent node and its child node(s).
	static class Node {
		int name;
		Node left;
	    Node right;
	    
	    // Partially Explicit Constructor
	    Node(final int _NAME) {
	        name = _NAME;
	        left = null;
	        right = null;
	    }
	}
	
	/* Custom recursion function to insert nodes into the tree
	 *  
	 * NOTE: 
	 *  - This uses memory intensive recursion to populate the tree.
	 */
	public static Node insert(Node rootNode, final int NEW_NAME) {
        // Recursively populates nodes based on input.
		if (rootNode == null) {
			// If the parent has no children, return an empty node.
            return new Node(NEW_NAME);
        } else {
        	// Establishes a temporary node to swap nodes later.
            Node currentNode;
            
            // If the parent has 
            if (NEW_NAME <= rootNode.name) {
            	currentNode = insert(rootNode.left, NEW_NAME);
            	rootNode.left = currentNode;
            } else {
                currentNode = insert(rootNode.right, NEW_NAME);
                rootNode.right = currentNode;
            }
            return rootNode;
        }
    }
}
