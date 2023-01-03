package interviewPreparationKit;

import java.util.*;

public class SalesByMatch {

	public static void main(String[] args) {
		final List<Integer> inputSocks = new ArrayList<>();
		inputSocks.add(10);
		inputSocks.add(20);
		inputSocks.add(20);
		inputSocks.add(10);
		inputSocks.add(10);
		inputSocks.add(30);
		inputSocks.add(50);
		inputSocks.add(10);
		inputSocks.add(20);
		
		final int totalPairs = getTotalPairs(inputSocks.size(), inputSocks);
		
		System.out.println("Total Pairs: " + totalPairs);
	}
	
	public static int getTotalPairs(final int size, List<Integer> socks) {
		final HashMap<Integer, Integer> pairs = new HashMap<>();
		Integer sock = 0;
		int numOfPairs = 0;
		
		for (int i = 0; i < size; i++) {
			sock = socks.get(i);
			
			if (!pairs.containsKey(sock)) {
				pairs.put(sock, 1);
			} else {
				pairs.put(sock, (pairs.get(sock) + 1));
			}
		}
		
		for (Map.Entry<Integer, Integer> set : pairs.entrySet()) {
			numOfPairs += (set.getValue() / 2);
		}
		return numOfPairs;
	}
}
