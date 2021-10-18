package blackJack;

public class Card {
	// Data Members
	private int rank;
	private int suit;
	
	// Explicit Constructor: Sets up the card based on rank and suit.
	public Card(int r, int s) {
		rank = r;
		suit = s;
	}
	// Member Methods
	public String displayValue() {
		String str = "";
		
		switch(rank) {
			case 1: str += "ACE"; break;
			case 2: str += "TWO"; break;
			case 3: str += "THREE"; break;
			case 4: str += "FOUR"; break;
			case 5: str += "FIVE"; break;
			case 6: str += "SIX"; break;
			case 7: str += "SEVEN"; break;
			case 8: str += "EIGHT"; break;
			case 9: str += "NINE"; break;
			case 10: str += "TEN"; break;
			case 11: str += "JACK"; break;
			case 12: str += "QUEEN"; break;
			case 13: str += "KING"; break;
		}
		switch(suit) {
			case 1: str += " of SPADES"; break;
			case 2: str += " of CLUBS"; break;
			case 3: str += " of HEARTS"; break;
			case 4: str += " of DIAMONDS"; break;
		}
		return str;
	}
	// Returns Card Values
	public int value() {
		if (rank >= 10) {
			return 10;
		}	
		else if (rank == 1) {
			return 11;
		}
		else {
			return rank;
		}
	}
	// Getters and Setters
	public int getSuit() {
		return suit;
	}
	public int getRank() {
		return rank;
	}
}