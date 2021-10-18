package homework;

import java.util.Scanner;

public class MinuteConverter {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		double answerHours;
		double answerDays;
		
		System.out.println("Please enter any number of minutes >> ");
		int min = scan.nextInt();
		
		answerHours = (min / 60);
		answerDays = (min / 1440);
		
		System.out.println("That is " + answerHours + " Hours or " + answerDays + " Days.");
	}
}