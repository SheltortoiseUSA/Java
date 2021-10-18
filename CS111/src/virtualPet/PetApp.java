package virtualPet;

import java.util.Scanner;

public class PetApp {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		Pet bobo = new Pet("Bobo");
		
		int menuChoice = 0;
		
		for(;;) {
			System.out.print("Menu Choices");
			System.out.print("\t (1) Talk");
			System.out.print("\t (2) Feed");
			System.out.print("\t (3) Walk");
			System.out.print("\tChoice: ");
			menuChoice = in.nextInt();
			
			switch(menuChoice) {
				case 1: System.out.println(bobo.talk()); break;
				case 2: System.out.println(bobo.feed()); break;
				case 3: System.out.println(bobo.walk()); break;
			}
		}
	}
}