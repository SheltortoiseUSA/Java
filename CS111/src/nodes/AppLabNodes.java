package nodes;

public class AppLabNodes {

	public static void main(String[] args) {
		Node first = null;
		Node last = null;
		Node temp;
		
		temp = new Node();
		temp.n = 1;
		temp.next = null;
		first = temp;
		last = temp;
		
		temp = new Node();
		temp.n = 4;
		temp.next = null;
		last.next = temp;
		last = temp;
		
		temp = new Node();
		temp.n = 2;
		temp.next = last;
		first.next = temp;
		last = temp;
		
		first.next = last;
	}
}