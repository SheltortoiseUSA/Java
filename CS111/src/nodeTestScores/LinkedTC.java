package nodeTestScores;

import nodeTestScores.NodeTC;

public class LinkedTC {
	private NodeTC first;
	private NodeTC last;
		
	public LinkedTC() {
		first = null;
		last = null;
	}
	public void addNode(String fName, String lName, int score) {
		NodeTC temp = new NodeTC();
		temp.n = score;
		temp.firstName = fName;
		temp.lastName = lName;
		temp.next = null;
		
		if(first == null) {
			first = temp;
			last = temp;
		}
		else if(score <= first.n) {
			temp.next = first;
			first = temp;
		}
		else{
			NodeTC before = first;
			NodeTC after = first.next;
			
			while(after != null) {
				if(before.n <= temp.n && after.n >= temp.n) {
					break;
				}
				before = after;
				after = after.next;
			}
			before.next = temp;
			temp.next = after;
		}
	}
	public void display() {
		NodeTC trav = first;
		
		while(trav != null) {
			System.out.println(trav.firstName + " " + trav.lastName + " " + trav.n);
			
			trav = trav.next;
		}
	}
}