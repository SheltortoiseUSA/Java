package exceptionHandlingBullsEye;

import java.io.FileOutputStream;
import java.io.IOException;

public class BullsEye {

	public static void main(String[] args) {
		FileOutputStream out;

		try {
			out = new FileOutputStream("Bull.txt");
			writeBullsEye(out);
			out.close();
		}
		catch(IOException exception) {
			System.out.println("IO exception has occurred");
		}
	}
	public static void writeBullsEye(FileOutputStream out) {
		try {
			for(int y = 50; y >= -50; y--) {
				for(int x = -50; x <= 50; x++) {
					double distance = Math.sqrt(x * x + y * y);
					if(distance <= 15) {
						out.write('M');
					}
					else if(distance <= 35) {
						out.write(';');
					}
					else if(distance <= 50) {
						out.write('%');
					}
					else {
						out.write('.');
					}
				}
				out.write('\n');
			}
		}
		catch(IOException exception) {
			System.out.println("The char cannot be added");
		}	
	}
}