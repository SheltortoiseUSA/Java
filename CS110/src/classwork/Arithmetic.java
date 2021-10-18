// 1) Folder that contains classes.
// 2) Restricts access to private data from members outside this package.
// 2) Grants access to public data from members inside and outside this package.
package classwork;

// Class name and encapsulation declaration.
public class Arithmetic {
	
	// The main method is the first method that is called when this class is ran.
	public static void main(String[] args) {
		// Calls the public method "compute," to be executed.
		compute();
	}
	// A static method that will always print the result of 9 * 8 * 7.
	public static void compute() {
		// 1) Instantiates an integer.
		// 2) Sets that integer to equal the value of 9 * 8 * 7.
		int value = (9 * 8 * 7);
		
		// Prints, the value stored in the integer "value," on a new line in console.
		System.out.println(value);
	}
}