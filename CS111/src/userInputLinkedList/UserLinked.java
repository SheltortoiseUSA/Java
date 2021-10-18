package userInputLinkedList;

public class UserLinked {
	private UserNode first;
	private UserNode last;
	
	public UserLinked() {
		first = null;
		last = null;
	}
	public void addNode(int num) {
		UserNode temp = new UserNode();
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
			UserNode before = first;
			UserNode after = first.next;
			
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
			UserNode before = first;
			UserNode after = first.next;
			
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
		UserNode trav = first;
		
		while(trav != null) {
			System.out.print(trav.n + " ");
			
			trav = trav.next;
		}
	}
	public void displaySkip() {
		UserNode trav2 = first;
		
		while(trav2 != null) {
			System.out.print(trav2.n + " ");
			
			trav2 = trav2.next.next;
		}
	}
}