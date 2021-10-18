package homework;

import java.util.*;

public class RockPaperScissors2 {
	
	public static void main(String[] args) {
		turns();
	}
	public static void turns() {
		int[] arr = new int[3];
		
		for(int t = 1; t < 4; t++) {
			assign(arr);
		}
	}
	public static void assign(int[] arr) {
		Random rng = new Random();
		Scanner scan = new Scanner(System.in);
		
		int player = 0;
		int cpu;
		
		System.out.println("Enter Rock, Paper, or Scissors >> ");
		String input = scan.nextLine();
		input = input.toUpperCase();
		
		if(input.startsWith("R")) {
			System.out.println("You chose rock.");
			
			player = 1;
		}
		else if(input.startsWith("P")) {
			System.out.println("You chose paper.");
			
			player = 2;
		}
		else if(input.startsWith("S")) {
			System.out.println("You chose scissors.");
			
			player = 3;
		}
		else {
			// Do Nothing
		}
		cpu = rng.nextInt(2) + 1;
		
		if(cpu == 1) {
			System.out.println("CPU chose rock.");
		}
		else if(cpu == 2) {
			System.out.println("CPU chose paper.");
		}
		else {
			System.out.println("CPU chose scissors.");
		}
		battle(player, cpu, arr);
	}
	public static void battle(int player, int cpu, int[] arr) {
		if(player == cpu) {
			System.out.println("It's a tie.");
			
			arr[2] += 1;
		}
		else if(player == 3 && cpu == 1 || player == 1 && cpu == 2 || player == 2 && cpu == 3) {
			System.out.println("CPU wins.");
			
			arr[1] += 1;
		}
		else if(player == 1 && cpu == 3 || player == 2 && cpu == 1 || player == 3 && cpu == 2) {
			System.out.println("Player wins.");
			
			arr[0] += 1;
		}
		else {
			System.out.println("Error");
		}
		int temp = 0;
		
		for(int i = 0; i < 3; i++) {
			temp += arr[i];
			
			if(temp == 3) {
				stats(arr);
			}
		}
	}
	public static void stats(int[] arr) {
		System.out.println("After a three round fight the totals are...");
		System.out.println("Losses: " + arr[0]);
		System.out.println("Wins:   " + arr[1]);
		System.out.println("Ties:   " + arr[2]);
	}
}