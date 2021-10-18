
package classwork;

import java.util.Random;

public class RandomNumbers {
	
	public static void main(String[] args) {
		rollDie();
		rollDie();
		rollDie();
	}
	public static void rollDie() {
		Random rng = new Random();
		int randomInt = rng.nextInt(6) + 1;
		
		System.out.println(randomInt);
	}
}