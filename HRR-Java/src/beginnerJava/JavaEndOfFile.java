package beginnerJava;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

// Task Takeaway...
// 1) Learned how to write a clean while loop to handle scanner input.
// 2) Learned how to wipe the contents of a StringBuilder object.
public class JavaEndOfFile {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
        StringBuilder SB = new StringBuilder();
        
        int i = 1;
        
        while(scan.hasNext()) {
            SB.setLength(0);
            SB.append(i + " ");
            SB.append(scan.nextLine());
            System.out.println(SB.toString());
            i++;
        }
	}
}
