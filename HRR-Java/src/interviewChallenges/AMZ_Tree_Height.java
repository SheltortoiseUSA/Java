package interviewChallenges;

import java.util.*;
import java.io.*;

public class AMZ_Tree_Height {

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
		
		// Determines the height of the tree and prints the result.
		final int HEIGHT = getTreeHeight(root);
		System.out.println("Tree Height: " + HEIGHT);	
	}
	
	// Custom class to determine the length of the tree.
	public static int getTreeHeight(final Node ROOT) {
		// Populates the returned node that contains the largest data.
		final int HEIGHT_OF_TREE = traverseTree(ROOT, 0);
		return HEIGHT_OF_TREE;
    }
	
	/* Custom recursive function to get the bottom-rightmost node.
	 * 
	 * NOTE:
	 *  - Recursion is not good for memory... very bad, but works for this kind of operation.
	 */
	private static int traverseTree(final Node CURRENT, int counter) {
		if (CURRENT.right != null) {
			counter++;
			counter = traverseTree(CURRENT.right, counter);
		} else if (CURRENT.left != null) {
			counter++;
			counter = traverseTree(CURRENT.left, counter);
		}
		return counter;
	}
	
	/* This Class was Auto-Generated by the challenge.
	 * 
	 * NOTE:
	 *  - I prefer to name my node components differently.
	 */
	static class Node {
		int data;
		Node left;
	    Node right;
	    
	    Node(int data) {
	        this.data = data;
	        left = null;
	        right = null;
	    }
	}
	
	/* This Class was Auto-Generated by the challenge.
	 *  
	 * NOTE: 
	 *  - This uses memory intensive recursion to populate the tree.
	 */
	public static Node insert(Node root, int data) {
        if(root == null) {
            return new Node(data);
        } else {
            Node cur;
            if(data <= root.data) {
                cur = insert(root.left, data);
                root.left = cur;
            } else {
                cur = insert(root.right, data);
                root.right = cur;
            }
            return root;
        }
    }
}