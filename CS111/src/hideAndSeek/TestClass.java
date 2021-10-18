package hideAndSeek;

public class TestClass {

	public static void main(String[] args){
		PlayerQueue players = new PlayerQueue();
		addPlayers(players);
		
		String name = whoIsIt(players);
		
		System.out.println(name + ", you are it!");
	}
	public static void addPlayers(PlayerQueue players){
		players.addLast("Bobo");
		players.addLast("Ruth");
		players.addLast("Ned");
		players.addLast("Sam");
		players.addLast("Ari");
		players.addLast("Barb");
		players.addLast("Lucy");
	}
	public static String whoIsIt(PlayerQueue players){
		String name = "";
		
		while(players.head != null){
			name = players.removeFirst();
			players.addLast(name);
			
			name = players.removeFirst();
			players.addLast(name);
			
			name = players.removeFirst();
		}
		return name;
	}
}