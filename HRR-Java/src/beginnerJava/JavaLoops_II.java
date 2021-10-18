package beginnerJava;

import java.util.*;
import java.io.*;

// Task Takeaway...
// 1) Learned how to use Math.pow for Exponents
public class JavaLoops_II {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
        int t = scan.nextInt();
        
        for (int i = 0; i < t; i++) {
            int a = scan.nextInt();
            int b = scan.nextInt();
            int n = scan.nextInt();
            
            int ans = a;
            
            if (n != 0) {
                for (int j = 0; j < n; j++) {
                    ans += (b * (int) (Math.pow(2, j)));
            
                    System.out.print(ans + " ");
                }
                System.out.println();
            }
        }
        scan.close();
	}
}
