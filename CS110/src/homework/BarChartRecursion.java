package homework;

import java.util.Scanner;

public class BarChartRecursion {

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
		
		int i = 0;
		
		countScores(i, points);
		
		System.out.println("");
	}
	public static void countScores(int i, int points) {
		if(i < points) {
			System.out.print("*");
			
			i += 1;
			
			countScores(i, points);
		}
		else {
			// Do Nothing
		}
	}
}