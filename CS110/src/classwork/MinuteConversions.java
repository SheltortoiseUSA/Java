package classwork;

import java.util.Scanner;

public class MinuteConversions {
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("How many minutes?");
		int totalMinutes = scan.nextInt();
		
		final double MINUTES_IN_HOUR = 60;
		final double MINUTES_IN_DAY = 1440;
		
		double hours = totalMinutes / MINUTES_IN_HOUR;
		double days = totalMinutes / MINUTES_IN_DAY;
		
		System.out.println("Number of hours: " + hours);
		System.out.println("Number of days: " + days);
	}
}