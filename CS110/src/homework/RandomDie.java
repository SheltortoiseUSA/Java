package homework;

import java.util.Random;

public class RandomDie {
	
	public static void main(String[] args) {
		rollDie();
		rollDie();
		rollDie();
	}		
	private static void rollDie() {
		Random rng = new Random();
		
		int randomInt = rng.nextInt(5) + 1;
		
		System.out.println(randomInt);
	}
}