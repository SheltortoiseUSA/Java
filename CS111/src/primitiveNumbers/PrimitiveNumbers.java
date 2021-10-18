package primitiveNumbers;

public class PrimitiveNumbers {
	private int u;
	
	public PrimitiveNumbers(int _u) {
		u = _u;
	}
	public int getPrimativeNumbers() {
		return u;
	}
	public void toBinary(String binary, int bin) {
		if((bin / 2) == 0) {
			binary += (bin % 2);
			
			String reverse = new StringBuffer(binary).reverse().toString();
			
			System.out.println("Decimal: " + u + " is binary: " + reverse);
		}
		else {
			binary += (bin % 2);
			bin = bin / 2;
			
			toBinary(binary, bin);
		}		
	}
	public void toOctal(int octal, int oct, int counter) {
		if(oct == 0) {
			System.out.println("Decimal: " + u + " is Octal: " + octal);
		}
		else {
			int temp = (int) ((oct % 8) * Math.pow(10, counter));
	        counter++;
	        octal += temp;
	        oct /= 8;
	        
	        toOctal(octal, oct, counter);
		}	
	}
	public void toHexadecimal(String hexadecimal, int hex, String hexStatement) {
		if(hex <= 0) {
			System.out.println("Decimal: " + u + " is Hexadecimal: " + hexadecimal);
		}
		else {
			int digit = hex % 16;
			
	        hexadecimal = hexStatement.charAt(digit) + hexadecimal;
	        hex = hex / 16;
	        
	        toHexadecimal(hexadecimal, hex, hexStatement);
		}
	}
}