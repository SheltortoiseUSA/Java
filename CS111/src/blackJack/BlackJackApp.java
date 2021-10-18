package blackJack;

import java.util.Scanner;

public class BlackJackApp {

    public static void main(String[] args) {
    	Scanner scan = new Scanner(System.in);
    	
    	String another = "";
    	
    	//Task 1: Create the Engine
        BlackJackEngine blackJack = new BlackJackEngine();

        //Task 2: Infinite for loop that breaks when user has had enough.
        for(int i = 1; ; i++) {
        	System.out.println("\n\nB L A C K J A C K G A M E #" + i);
        	
            blackJack.playGame();
            blackJack.callWinner();
            
            System.out.print("Would you like to play another game? Enter yes to continue>> ");
            another = scan.nextLine();
            
            if(!another.toLowerCase().equals("yes")) {
            	break;
            }
            else if(another.toLowerCase().equals("yes")){
            	blackJack.reset();
            }
        }
    }
}