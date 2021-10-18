package blackJack;

import java.util.ArrayList;
import java.util.Collections;

public class Deck {
	// Data Members
	private ArrayList<Card> cardList;
	private int top;
	
	// Default Constructor
	public Deck() {
		top = 0;
		cardList = new ArrayList<Card>();
		
		// Task 1: Add cards to the deck.
		for(int suit = 1; suit <= 4; suit++) {
			for(int rank = 1; rank <= 13; rank++) {
				Card c = new Card(rank, suit);
				cardList.add(c);
			}
		}
	}
	// Member Methods
	public void shuffleCards() {
		Collections.shuffle(cardList);
		top = 0;
	}
	// Draw Cards Method
	public Card deal() {
		Card c = cardList.get(top);
		
		top++;
		
		if(top > 51) {
			top = 0;
		}
		return c;
	}
}