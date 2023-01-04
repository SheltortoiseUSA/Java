package costarChallengeShoeSorter;

import java.util.ArrayList;

public class ShoeSorter {

	public static void main(String[] args) {
		final Shoe[] shoes = {
				new Shoe(8, 'L', "Tennis Shoe"), 
				new Shoe(11, 'R', "Running Shoe"),
				new Shoe(9, 'R', "Gym Shoe"),
				new Shoe(10, 'R', "Gym Shoe"),
				new Shoe(10, 'L', "Gym Shoe"),
				new Shoe(10, 'L', "Climbing Shoe")
				};
		
		final ArrayList<Shoe> sortedShoes = getSortedShoes(shoes);
		
		for (final Shoe shoe : sortedShoes) {
			System.out.println(shoe.toString());
		}
	}
	
	private static ArrayList<Shoe> getSortedShoes(final Shoe[] shoes) {
		final ArrayList<Shoe> sortedShoes = new ArrayList<>();
		ArrayList<Shoe> left = new ArrayList<>();
		ArrayList<Shoe> right = new ArrayList<>();
		Shoe shoe;
		
		for (int i = 0; i < shoes.length; i++) {
			shoe = shoes[i];
			
			if (shoe.getFoot() == 'L') {
				left.add(shoe);
			} else {
				right.add(shoe);
			}
		}
		System.out.println("Left Before: " + left.toString());
		System.out.println("Right Before: " + right.toString());
		System.out.println();
		
		left = sortHalf(left);
		right = sortHalf(right);
		
		System.out.println("Left After: " + left.toString());
		System.out.println("Right After: " + right.toString());
		System.out.println();
		
		sortedShoes.addAll(left);
		sortedShoes.addAll(right);
		return sortedShoes;
	}
	
	private static ArrayList<Shoe> sortHalf(final ArrayList<Shoe> inputHalf) {
		Shoe temp;
		
		for (int x = 0; x < inputHalf.size(); x++) {
			temp = inputHalf.get(x);
			
			for (int y = (x + 1); y < inputHalf.size(); y++) {
				if (temp.getSize() > inputHalf.get(y).getSize()) {
					inputHalf.set(x, inputHalf.get(y));
					inputHalf.set(y, temp);
				} else if (temp.getSize() == inputHalf.get(y).getSize()) {
					if (temp.getType().compareTo(inputHalf.get(y).getType()) > 0) {
						inputHalf.set(x, inputHalf.get(y));
						inputHalf.set(y, temp);
					}
				}
			}
		}
		return inputHalf;
	}
}
