package homework;

import java.util.Scanner;

public class BarChart {

	public static void main(String[] args) {	
		int artScores = inputScores("Art");
		int bobScores = inputScores("Bob");
		int calScores = inputScores("Cal");
		int danScores = inputScores("Dan");
		int eliScores = inputScores("Eli");
		
		displayScores(artScores, "Art");
		displayScores(bobScores, "Bob");
		displayScores(calScores, "Cal");
		displayScores(danScores, "Dan");
		displayScores(eliScores, "Eli");
	}
	public static int inputScores(String name) {
		Scanner scan = new Scanner(System.in);

		System.out.print("Enter points scored by " + name + " >> ");
		int score = scan.nextInt();
		
		return score;
	}
	public static void displayScores(int points, String name) {
		System.out.print(name + "    ");
		
		for(int i = 0; i < points; i++) {
			System.out.print("*");
		}
		System.out.println("");
	}
}