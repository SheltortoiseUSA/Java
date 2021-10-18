package beginnerJava;

import java.util.*;
import java.io.*;

// Task Takeaway...
// 1) Learned that a 64 bit long does not fit in a long data type.
// 2) Learned that max unsigned data size is equal to 2 ^ X bits.
public class JavaDatatypes {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
        int t = scan.nextInt();
        
        final int BYTE_BIT = 8;
        final int SHORT_BIT = 16;
        final int INT_BIT = 32;
        final int LONG_BIT = 64;

        for (int i = 0; i < t; i++) {
            try {
                long x = scan.nextLong();
                System.out.println(x + " can fit in:");
                
                if (x >= -(Math.pow(2, BYTE_BIT) / 2) && 
                    x <= ((Math.pow(2, BYTE_BIT) / 2) - 1)) {
                    System.out.println("* byte");
                }
                if (x >= -(Math.pow(2, SHORT_BIT) / 2) && 
                    x <= ((Math.pow(2, SHORT_BIT) / 2) - 1)) {
                    System.out.println("* short");
                }
                if (x >= -(Math.pow(2, INT_BIT) / 2) && 
                    x <= ((Math.pow(2, INT_BIT) / 2) - 1)) {
                    System.out.println("* int");
                }
                if (x >= -(Math.pow(2, LONG_BIT) / 2) && 
                    x <= ((Math.pow(2, LONG_BIT) / 2) - 1)) {
                    System.out.println("* long");
                }
            } catch(Exception e) {
                System.out.println(scan.next() + " can't fit anywhere.");
            }
        }
	}
}
