package primitiveNumbers;

public class PrimitiveNumbersApp {

	public static void main(String[] args) {
		PrimitiveNumbers n1 = new PrimitiveNumbers(42);
		PrimitiveNumbers n2 = new PrimitiveNumbers(341);
		PrimitiveNumbers n3 = new PrimitiveNumbers(207);
		
		String binary = "";
		int bin = n1.getPrimativeNumbers();
		n1.toBinary(binary, bin);
		
		int octal = 0;
		int counter = 0;
		int oct = n1.getPrimativeNumbers();
		n1.toOctal(octal, oct, counter);
		
		String hexStatement = "0123456789ABCDEF";
		String hexadecimal = "";
		int hex = n1.getPrimativeNumbers();
		n1.toHexadecimal(hexadecimal, hex, hexStatement);
		
		int bin2 = n2.getPrimativeNumbers();
		n2.toBinary(binary, bin2);
		int oct2 = n2.getPrimativeNumbers();
		n2.toOctal(octal, oct2, counter);
		int hex2 = n2.getPrimativeNumbers();
		n2.toHexadecimal(hexadecimal, hex2, hexStatement);
		
		int bin3 = n3.getPrimativeNumbers();
		n3.toBinary(binary, bin3);
		int oct3 = n3.getPrimativeNumbers();
		n3.toOctal(octal, oct3, counter);
		int hex3 = n3.getPrimativeNumbers();
		n3.toHexadecimal(hexadecimal, hex3, hexStatement);
	}
}