package studentMajors;

import java.io.*;
import java.util.Scanner;

public class FileApp {

	public static void main(String[] args) throws IOException {
		File temp = new File("sm.txt");
		Scanner file = new Scanner(temp);
		
		String[] names = new String[5];
		String[] majors = new String[5];
		String[] nm = new String[10];
		
		for(int i = 0; i < nm.length; i++) {
			nm[i] = file.nextLine();
		}
		int countA = 0;
		int countB = 0;
		
		for(int a = 0; a < nm.length; a++) {
			if((a % 2) == 0) {
				names[countA] = nm[a];
				countA += 1;
			}
			else {
				majors[countB] = nm[a];
				countB += 1;
			}
		}
		StudentsAndMajors sm = new StudentsAndMajors(names, majors);
		String[] combined = sm.getList();
		
		FileOutputStream out;
		out = new FileOutputStream("SSM.txt");
		writeSSM(out, combined);
		out.close();
	}
	public static void writeSSM(FileOutputStream out, String[] combined) {
		try {
			for(int b = 0; b < combined.length; b++) {
				for(int c = 0; c < combined[b].length(); c++) {
					out.write(combined[b].charAt(c));
				}
				if((b % 2) == 0) {
					out.write(':');
					out.write(' ');
				}	
				else {
					out.write('\r');
					out.write('\n');
				}
			}
		}
		catch(IOException exception) {
			System.out.println("The char cannot be added");
		}	
	}
}