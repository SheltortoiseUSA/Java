package fileScanner;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class FileApp {

	public static void main(String[] args) {
		Scanner fileScan;
		System.out.println(System.getProperty("user.dir"));

		try {
			File file = new File("Users/tyler_000/Desktop/Sheltortoise USA/School/Programming/Java/CS111/bin/studentMajors.docx");
			
			fileScan = new Scanner(file);
			
			displayContents(fileScan);
			fileScan.close();
		} 
		catch (FileNotFoundException e) {
			System.out.println("File not found");
		}
	}
	static void displayContents(Scanner fileScan) {
		String paragraph;
		
		while (fileScan.hasNext()) {
			paragraph = fileScan.nextLine();
			
			System.out.println(paragraph);
		}
	}
}