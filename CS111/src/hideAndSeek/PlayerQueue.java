package hideAndSeek;

public class PlayerQueue {
	public PlayerNode head;
	private PlayerNode last;

	public PlayerQueue() {
		head = null;
		last = null;
	}
	public void addLast(String str) {
		PlayerNode temp = new PlayerNode();
		temp.name = str;
		temp.next = null;

		if(head == null) {
			head = temp;
			last = temp;
		}
		else {
			last.next = temp;
			last = temp;
		}
	}
	public String removeFirst() {
		String name = "";

		if(head == null) {
			return "null";
		}
		else {
			name = head.name; 
			head = head.next;
		}
		return name;
	}
	public String peek() {
		return head.name;
	}
}