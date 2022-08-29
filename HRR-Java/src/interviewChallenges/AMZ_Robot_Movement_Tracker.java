package interviewChallenges;

import java.util.*;

public class AMZ_Robot_Movement_Tracker {
	// Globally Accessible ArrayList of Robots
	final static ArrayList<Integer> ROBOT_POSITIONS = new ArrayList<>();
	
	// Globally Accessible Flags
	static boolean flagGridSize = false;
	static boolean flagRobotCount = false;

	public static void main(String[] args) {
		// Static Robot Movement Data
		final int[] G1 = { 1, 0, 0, 1 , 0, 0, 1 , 0, 0, 1 };
		final int[] G2 = { 1, 0, 0, 1 , 0, 0, 1 , 0, 0, 1 };
		
		// Find if the robots teleported or not.
		final boolean isValid = validateMovement(G1, G2);
		
		// Conditions print the results of the robot data.
		if (flagGridSize) {
			// Print an error for grid size if flagged.
			System.out.println("Somebody expanded the warehouse again...");
		} else if (flagRobotCount) {
			// Print an error for robot count if flagged.
			System.out.println("Mose, stop puting robots in the lineup, ur gonna mess up the count!");
		} else {
			// Print whether the robots moved within range of their last known position.
			if (isValid) {
				System.out.println("Robots are moving normally.");
			} else {
				System.out.println("At least one robot seems to have teleported :/");
			}
		}
	}
	
	// Custom function to validate that all robots moved one space.
	private static boolean validateMovement(final int[] GRID_1, final int[] GRID_2) {
		// Static grid lengths to determine size compatability.
		final int LEN_1 = GRID_1.length;
		final int LEN_2 = GRID_2.length;
		
		// Determines if the grids are identical in length.
		if (LEN_1 == LEN_2) {
			// Populates the global ArrayList of robot positions.
			findRobots(GRID_1);
			
			// Make sure that both grids have the same amount of robots.
			if (ROBOT_POSITIONS.size() == countRobots(GRID_2)) {
				// Interates all robot positions to see where they moved to.
				for (final int ROBOT_POS : ROBOT_POSITIONS) {
					// Static Values for Potential Robot Movement
					final int LEFT_OF_ROBOT = (ROBOT_POS - 1);
					final int RIGHT_OF_ROBOT = (ROBOT_POS + 1);
					
					// Conditions check all the possible robot position moves.
					if (validatePlot(GRID_2[ROBOT_POS])) {
						// Case 1: Robot did not move.
						continue;
					} else if (!isOOB(LEFT_OF_ROBOT) && validatePlot(GRID_2[LEFT_OF_ROBOT])) {
						// Case 2: Robot moved left.
						continue;
					} else if (!isOOB(RIGHT_OF_ROBOT, LEN_2) && validatePlot(GRID_2[RIGHT_OF_ROBOT])) {
						// Case 3: Robot moved right.
						continue;
					} else {
						// Case 4: Robot either teleported or is missing.
						return false;
					}
				}
			} else {
				// One grid contains more robots, thus an error is returned.
				flagRobotCount = true;
				return false;
			}
		} else {
			// Grids are not the same length, thus an error is returned.
			flagGridSize = true;
			return false;
		}
		// All robots moved within their potential range.
		return true;
	}
	
	// Custom overloaded function to ensure the upper bound of an array will not be exceeded.
	// Custom overloaded function to protect against "Upper Out of Bounds."
	private static boolean isOOB(final int I, final int MAX) {
		if (I >= MAX) {
			// index is out of bounds in the positive direction.
			return true;
		} else {
			// Index is in bounds.
			return false;
		}
	}
	
	// Custom overloaded function to ensrue the lower bound of an array will not be exceeded.
	// Custom overloaded function to protect against "Lower Out of Bounds."
	private static boolean isOOB(final int I) {
		if (I <= 0) {
			// Index is Out of Bounds in the negative direction.
			return true;
		} else {
			// Index is in bounds.
			return false;
		}
	}
	
	// Custom function to determine if a single plot contains a robot.
	// Custom function to validate that a plot contains a robot.
	private static boolean validatePlot(final int PLOT) {
		if (PLOT == 1) {
			// Plot contains a robot.
			return true;
		} else {
			// Plot does not conain a robot.
			return false;
		}
	}
	
	// Custom function to populate the global ArrayList with initial robot positions.
	// Custom function to find the position of each robot in a chosen grid.
	private static void findRobots(final int[] INPUT_GRID) {
		// Iterate through the INPUT_GRID 
		for (int i = 0; i < INPUT_GRID.length; i++) {
			// Static Value Stored at Indice 'i' in INPUT_GRID
			final int VAL = INPUT_GRID[i];
			
			// Validates the Value at 'i.'
			if (validatePlot(VAL)) {
				// Stores the Position at 'i.'
				ROBOT_POSITIONS.add(i);
			}
		}
	}
	
	// Custom function to count the amount of robots in any input grid.
	// Custom function to determine how many robots are in a grid.
	private static int countRobots(final int[] INPUT_GRID) {
		// Establish temporary int to store the robot count.
		int robots = 0;
		
		// Iterate throught the INPUT_GRID
		for (int i = 0; i < INPUT_GRID.length; i++) {
			// Static Value of Grid at Indice 'i.'
			final int VALUE = INPUT_GRID[i];
			
			// Validate if each plot contains a robot.
			if (validatePlot(VALUE)) {
				// Increment the number of robots for every plot that contains a robot.
				robots++;
			}
		}
		return robots;
	}
}
