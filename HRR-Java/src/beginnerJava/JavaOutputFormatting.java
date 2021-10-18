package beginnerJava;

import java.util.Scanner;

// Task Takeaway...
// 1) Learned how to use SYSO Print Format
// 2) Learned how to use String Print Padding
// 3) Learned how to use int Print Padding
public class JavaOutputFormatting {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
        
        System.out.println("================================");
        for(int i = 0; i < 3; i++) {
            String str = scan.next();
            int num = scan.nextInt();
            
            System.out.printf("%-15s", str);
            System.out.printf("%03d", num);
            System.out.println();
        }
        System.out.println("================================");
	}
}