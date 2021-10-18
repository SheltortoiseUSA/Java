package homework;

import java.util.Scanner;

public class MadLib {
	
	public static void main(String[] args) {   
		Scanner scan = new Scanner(System.in);
		
		String adjective;
		String nounOne;
		String adverb;
		String pastTenseVerb;
	    String nounTwo;
		
	    System.out.print("Enter an adjective >> ");
		adjective = scan.nextLine();
		
		System.out.print("Enter a noun >> ");
		nounOne = scan.nextLine();
		
		System.out.print("Enter an Adverb >> ");
		adverb = scan.nextLine();
		
		System.out.print("Enter a past tense verb >> ");
		pastTenseVerb = scan.nextLine();
		
		System.out.print("Enter another noun >> ");
		nounTwo = scan.nextLine();
		
		if(nounOne.startsWith("a") || nounOne.startsWith("e") || nounOne.startsWith("i") || nounOne.startsWith("o") || nounOne.startsWith("u")) {
			System.out.println("There was an " + adjective + " Ogre with a massive " + nounOne + " that " + adverb + " " + pastTenseVerb + " into the " + nounTwo + ".");
		}
		else {
			System.out.println("There was a " + adjective + " Ogre with a massive " + nounOne + " that " + adverb + " " + pastTenseVerb + " into the " + nounTwo + ".");
		}
	}	
}