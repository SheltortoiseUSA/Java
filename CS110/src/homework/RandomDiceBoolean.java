package homework;

import java.util.Random;

public class RandomDiceBoolean {
	
	public static void main(String[] args) {
		Random rng = new Random();
		
		int randomInt = rng.nextInt(5) + 1;
		System.out.println(randomInt);
		
		int randomInt2 = rng.nextInt(5) + 1;
		System.out.println(randomInt2);
		
		if(randomInt != randomInt2) {
			System.out.println("They are not equal");
		}
		else {
			System.out.println("They are equal");
		}
	}
}