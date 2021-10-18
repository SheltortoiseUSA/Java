package quizScores;

import java.util.Scanner;

public class QuizScores {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("How many quiz scores are there?");
		int responses = scan.nextInt();
		double[] arr =  new double[responses];
		
		int quizScore = 0;		
		double sum = 0;
		
		for(int i = 0; i < arr.length; i++) {
			quizScore = i;
			
			System.out.println("What is that score on quiz # " + (quizScore + 1) + " ?");
			double input = scan.nextDouble();
			
			arr[i] = input;
		}
		for(int y = 0; y < arr.length - 1; y++) {	
			if(arr[y] > arr[y + 1]) {
				double temp = arr[y];
				arr[y] = arr[y + 1];
				arr[y + 1] = temp;
			}
		}
		System.out.println("Your lowest score was " + arr[0] + "%.");
		System.out.println("Your highest score was " + arr[arr.length - 1] + "%.");
		
		findSum(sum, arr);
	}
	public static void findSum(double sum, double[] arr) {
		for(int z = 0; z < arr.length; z++){	
			sum = sum + arr[z];
		}
		double average = (sum / arr.length);
		System.out.println("Your average score is " + average + "%.");
		
		for(int j = 0; j < arr.length - 1; j++) {
			if(arr[j] > average) {
				System.out.println("The score of " + arr[j] + "% is higer than your average quiz score.");
			}
		}
	}
}