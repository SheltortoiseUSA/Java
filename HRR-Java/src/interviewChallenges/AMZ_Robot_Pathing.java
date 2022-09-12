package interviewChallenges;

import java.util.ArrayList;

public class AMZ_Robot_Pathing {
	// Global Static Grid Variables
	private final static int X_LEN = 11;
	private final static int Y_LEN = 11;
	private final static int[][] GRID = new int[X_LEN][Y_LEN];

	public static void main(String[] args) {
		// Sets the trash at a plot position.
		GRID[5][6] = 5;
		
		// Starts the robot on plot (0,0).
		final int RESULT = move(0, 0, 0);
		
		// Prints Wall-E's trash finding results.
		if (RESULT == 1000) {
			// Prints that the object is not found, when it's not found.
			System.out.println("No Object Found");
		} else {
			// Prints the shortest distance to the object.
			System.out.println("Smallest Path: " + RESULT);
		}
	}
	
	// Custom recursive function to determine the optimized path to trash.
	private static int move(final int X, final int Y, int count) {
		// Temporary Terrain Value
		int plot = 0;
		
		// Temporary Path Distance
		int right = 0;
		int down = 0;
		
		// Prevents Out Of Bounds Excepetion
		if (isOOB(X, Y)) {
			return 1000;
		} else {
			// Static Terrain Value of Current Coordinates
			plot = GRID[X][Y];
			
			if (plot == 5) {
				// Returns the count if the trash is found.
				return count;
			} else {
				// Increments the Count
				count++;
				
				// Recursive Digging
				right = move((X + 1), (Y), count);
				down = move(X, (Y + 1), count);
			}
		}
		
		// Returns the Shorter Path
		if (right <= down) {
			return right;
		} else {
			return down;
		}
	}
	
	// Prevents OOB Exception
	private static boolean isOOB(final int X, final int Y) {
		// If the position to move to, is outside the grid, then that plot is OOB.
		if (X >= X_LEN || Y >= Y_LEN) {
			return true;
		} else {
			return false;
		}
	}
}
