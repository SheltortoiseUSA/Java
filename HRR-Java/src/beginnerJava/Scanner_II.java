package beginnerJava;

import java.util.Scanner;

//Task: Scan and print a string, a double, and an int.
public class Scanner_II {

	public static void main(String[] ARGS) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter an integer >> ");
		int i = scan.nextInt();
		
		System.out.println("Enter an double >> ");
		double d = scan.nextDouble();
		
		System.out.println("Enter a String >> ");
		StringBuilder SB = new StringBuilder();
		String temp = "";
		String input = "";
		
     while(scan.hasNext()) {
     	temp = scan.next();
     	
     	if(temp.toUpperCase().equals("STOP")) {
     		scan.close();
     		break;
     	} else {
     		SB.append(temp);
     	}
     }
     input = SB.toString();
     
     // These are pinting out of order to show how the Scanner turly works.
     System.out.println("Integer: " + i);
     System.out.println("Double: " + d);
     System.out.println("String: " + input);
	}
}
