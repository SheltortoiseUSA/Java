package interviewChallenges;

public class HRR_RectangleMatrix {

	public static void main(String[] args) {
		// Task 1: Create Random 2 Dimensional Array
		final int[][] ARRAY = createArray(6, 5);
		
		// Task 2: Print Contents of the Array
		printMatrix(ARRAY);
		
		// Task 3: Find and print the number of indices in the largest rectangle.
		printLargestRectangle(ARRAY);
	}
	
	// Populate Random Array
	private static int[][] createArray(final int LENGTH, final int WIDTH) {
		int[][] tempArray = new int[LENGTH][WIDTH];
		
		for (int x = 0; x < LENGTH; x++) {
			for (int y = 0; y < WIDTH; y++) {
				tempArray[x][y] = getRandomInt(0, 2);
			}
		}
		return tempArray;
	}
	
	// Get a random integer from within a range.
	private static int getRandomInt(final int MIN, final int MAX) {
		return (int) (Math.random() * MAX) + MIN;
	}
	
	// Print each indice of the random matrix.
	private static void printMatrix(final int[][] MATRIX) {
		for (int x = 0; x < MATRIX.length; x++) {
			for (int y = 0; y < MATRIX[x].length; y++) {
				System.out.print(MATRIX[x][y] + "\t");
			}
			System.out.println();
		}
	}

	// Determine the length of the largest rectangle and print the result.
	private static void printLargestRectangle(final int[][] MATRIX) {
		int[] histogram = new int[MATRIX.length];
		int max = 0;
		int histoMax = 0;
		int temp;
		
		for (int x = 0; x < MATRIX.length; x++) {
			for (int y = 0; y < MATRIX[x].length; y++) {
				temp = MATRIX[x][y];
				
				if (temp != 0) {
					histogram[y] += 1;
				} else {
					histogram[y] = 0;
				}
			}
			histoMax = getSizeFromHistogram(histogram);
			
			if (histoMax > max) {
				max = histoMax;
			}
		}
		System.out.println("Maximum Plots: " + max);
	}
	
	// Calculate Largest Rectangle
	private static int getSizeFromHistogram(final int[] HISTOGRAM) {
		int tempMax = 0;
		
		int root = 0;
		int leaf = 0;
		
		int sharedHeight = 0;
		int connectedWidth = 1;
		
		int area = 0;
		
		for (int i = 0; i < HISTOGRAM.length; i++) {
			root = HISTOGRAM[i];
			
			// Guarantee a sigle plot is counted.
			if (root > tempMax) {
				tempMax = root;
			}
			
			// Determine the max plot area.
			if (root != 0) {
				for (int j = (i + 1); j < HISTOGRAM.length; j++) {
					leaf = HISTOGRAM[j];
				
					if (leaf == 0) {
						sharedHeight = 0;
						connectedWidth = 1;
						break;
					} else {
						connectedWidth += 1;
						
						if (root > leaf) {
							sharedHeight = leaf;
						} else {
							sharedHeight = root;
						}
						area = (sharedHeight * connectedWidth);
						
						if (area > tempMax) {
							tempMax = area;
						}
					}
				}
			}
		}
		return tempMax;
	}
}
