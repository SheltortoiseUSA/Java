package blackJack;

import java.util.ArrayList;
import java.util.Scanner;

public class BlackJackEngine {
	// Data Members
	private int userCounter;
	private int dealerCounter;
	
	private ArrayList<Card> uCards = new ArrayList<>();
	private ArrayList<Card> dCards = new ArrayList<>();
	
	private String userCards;
	private String dealerCards;
	
	private boolean userDone = false;
	private boolean dealerDone = false;
	
	// Play Game Method
	public void playGame() {
		Scanner scan = new Scanner(System.in);
		
		// Initial Cards and Deck
		Deck d1 = new Deck();
		
		d1.shuffleCards();
		
		Card c1 = d1.deal();
		Card c2 = d1.deal();
		uCards.add(c1);
		uCards.add(c2);
		
		Card c3 = d1.deal();
		Card c4 = d1.deal();
		dCards.add(c3);
		dCards.add(c4);
		
		// Integer and Card Counters for Card Values
		// These data types allow the final result to be calculated, as well as the String of cards to be displayed.
		userCounter = getUserValue();
		userCards = ("\n\t" + c1.displayValue() + "\n\t" + c2.displayValue() + "\n");
		
		dealerCounter = getDealerValue();
		dealerCards = ("\n\t" + c3.displayValue() + "\n\t" + c4.displayValue() + "\n");
		
		System.out.println("User's Cards: " + userCards + "\nDealer's Cards: \n\tFACEDOWN\n\t" + c4.displayValue() + "\n");
		
		// Infinite for loop that breaks only when the player busts, or says "stay."
		// User's Card Gain Method
		while(!userDone) {
			if(userCounter >= 21) {
				System.out.println("\t Result is final");
				System.out.println("Your Value: " + userCounter);
				
				userDone = true;
			}
			else {
				System.out.println("Your card Value is " + userCounter);
				System.out.println("Hit or Stay?");
				String userInput = scan.nextLine();
				userInput.toLowerCase();
				System.out.println("");
			
				if(userInput.equals("hit")) {
					Card cX = d1.deal();
					uCards.add(cX);
					userCounter = getUserValue();
					
					System.out.println("New Card: " + cX.displayValue() + "\n");
					userCards += ("\t" + cX.displayValue() + "\n");
				}
				else if(userInput.equals("stay")) {
					System.out.println("\t Result is final");
					System.out.println("Your Value: " + userCounter);
					
					userDone = true;
				}
			}
		}
		// Dealer's Card Gain Method
		while(!dealerDone) {
			if(dealerCounter < 17) {
				Card cX = d1.deal();
				dCards.add(cX);
				dealerCounter = getDealerValue();
				
				System.out.println("New Card: " + cX.displayValue());
				dealerCards += ("\t" + cX.displayValue() + "\n");
			}
			else {
				System.out.println("Dealer's Value: " + dealerCounter + "\n");
				
				dealerDone = true;
			}
		}
	}
	public int getUserValue() {
		int userTemp = 0;
		int userNumberOfAces = 0;
		
		for(int i = 0; i < uCards.size(); i++) {
			userTemp += uCards.get(i).value();
			
			if(uCards.get(i).getRank() == 1) {
				userNumberOfAces += 1;
			}
		}
		if(userTemp > 21 && userNumberOfAces > 0) {
			userTemp -= (10 * userNumberOfAces);
		}
		return userTemp;
	}
	public int getDealerValue() {
		int dealerTemp = 0;
		int dealerNumberOfAces = 0;
		
		for(int i = 0; i < dCards.size(); i++) {
			dealerTemp += dCards.get(i).value();
			
			if(dCards.get(i).getRank() == 1) {
				dealerNumberOfAces += 1;
			}
		}
		if(dealerTemp > 21 && dealerNumberOfAces > 0) {
			dealerTemp -= (10 * dealerNumberOfAces);
		}
		return dealerTemp;
	}
	// Method that determines the winner.
	public void callWinner() {
		if(userCounter == 21) {
			System.out.println("BlackJack!");
		}
		else if(userCounter == dealerCounter) {
			printDif("tied");
		}
		else if(userCounter > dealerCounter && userCounter < 21) {
			printDif("won");
		}
		else if(userCounter < dealerCounter && dealerCounter > 21) {
			printDif("won");
		}
		else {
			printDif("lost");
		}
	}
	// Method that avoids repeated code by accepting the one word that needs changing.
	public void printDif(String str) {
		System.out.println("Your cards: " + userCards);
		System.out.println("Dealer's cards: " + dealerCards);
		System.out.println("You " + str + ". You got " + userCounter + " and the dealer got " + dealerCounter + "\n");
	}
	public void reset() {
		userCounter = 0;
		dealerCounter = 0;
		
		uCards.clear();
		dCards.clear();
		
		userCards = "";
		dealerCards = "";
		
		userDone = false;
		dealerDone = false;
	}
}