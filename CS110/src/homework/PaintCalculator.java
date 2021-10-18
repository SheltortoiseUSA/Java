package homework;

import java.util.Scanner;

public class PaintCalculator {
	
	public static void main(String[] args){ 
		displayArea();
	}
	private static void displayArea() {	
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Please put only whole numbers.");
		System.out.println("Please enter a legnth >> ");
		long length = scan.nextLong();
		
		System.out.println("Please enter a width >> ");
		long width = scan.nextLong();
		
		System.out.println("Please enter a height >> ");
		long height = scan.nextLong();
		
		long faceSurfaceArea = (length * height);
		long bodySurfaceArea = (width * height);
		
		long totalFaceArea = (faceSurfaceArea + faceSurfaceArea);
		long totalBodyArea = (bodySurfaceArea + bodySurfaceArea);
		
		long totalSurfaceArea = (totalFaceArea + totalBodyArea);
		
		displayTotal(totalSurfaceArea);
	}
	private static void displayTotal(long totalSurfaceArea) {
		long gallonsRequired = (totalSurfaceArea / 350);
		
		System.out.println("The total surface area is " + totalSurfaceArea + " feet squared, so the required gallons to paint the room is " + (gallonsRequired + 1) + " gallons.");
		System.out.println("The paint job will cost $" + (gallonsRequired * 32 + 32) + ".");
	}
}