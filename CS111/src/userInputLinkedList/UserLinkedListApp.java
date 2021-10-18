package userInputLinkedList;

import java.util.Scanner;

public class UserLinkedListApp {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int num = 10;
		
		UserLinked myList = new UserLinked();
		
		for(int i = 0; i < num; i++) {
			System.out.println("Input a number >> ");
			int temp = scan.nextInt();
			
			myList.addNode(temp);
		}
		myList.display();
		System.out.println();
		
		myList.displaySkip();
		
		for(int j = 0; j < 100; j++) {
			if((j % 2) != 0) {
				for(int k = 0; k < num; k++) {
					myList.removeNode(j);
				}
			}
		}
		System.out.println();
		myList.display();
	}
}