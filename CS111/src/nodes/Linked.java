package nodes;

public class Linked {
	private Node first;
	private Node last;
	
	public Linked() {
		first = null;
		last = null;
	}
	public void addNode(int num) {
		Node temp = new Node();
		temp.n = num;
		temp.next = null;
		
		if(first == null) {
			first = temp;
			last = temp;
		}
		else if(num <= first.n) {
			temp.next = first;
			first = temp;
		}
		else {
			Node before = first;
			Node after = first.next;
			
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
	public void removeNode(int num) {
		if(first == null) {
			return;
		}
		else if(first.n == num) {
			first = first.next;
		}
		else {
			Node before = first;
			Node after = first.next;
			
			while(after != null) {
				if(after.n == num) {
					break;
				}
				before = after;
				after = after.next;
			}
			if(after != null) {
				before.next = after.next;
				after.next = null;
			}
		}
	}
	public void display() {
		Node trav = first;
		
		while(trav != null) {
			System.out.print(" " + trav.n);
			
			trav = trav.next;
		}
	}
}