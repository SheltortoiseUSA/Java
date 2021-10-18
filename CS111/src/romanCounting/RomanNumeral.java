package romanCounting;

public class RomanNumeral {
	private String romanNumeral;
	private int decimalValue;
	
	public RomanNumeral(String _romanNumeral, int _decimalValue){
		romanNumeral = _romanNumeral;
		decimalValue = _decimalValue;
	}
	public int decimalValue() {
		decimalValue = getDecimalValue();
		
		return decimalValue;
	}
	public String romanValue() {
		romanNumeral = getRomanValue();
		
		return romanNumeral;
	}
	public String set(String r) {
		romanNumeral = r;
		
		return r;
	}
	public int getDecimalValue() {
		romanNumeral.toUpperCase();
		
		char[] tempChar = new char[romanNumeral.length()];
		
		for(int i = 0; i < romanNumeral.length(); i++) {
			tempChar[i] = romanNumeral.charAt(i);
		}
		int tempInt = 0;
		
		for(int i = 0; i < romanNumeral.length(); i++) {
			if(tempChar[i] == 'M') {
				tempInt += 1000;
			}
			else if(tempChar[i] == 'D') {
				tempInt += 500;
			}
			else if(tempChar[i] == 'C') {
				tempInt += 100;
			}
			else if(tempChar[i] == 'L') {
				tempInt += 50;
			}
			else if(tempChar[i] == 'X') {
				tempInt += 10;
			}
			else if(tempChar[i] == 'V') {
				tempInt += 5;
			}
			else if(tempChar[i] == 'I') {
				tempInt += 1;
			}
		}
		return tempInt;
	}
	public String getRomanValue() {
		romanNumeral.toUpperCase();
		
		char[] tempChar = new char[romanNumeral.length()];
		
		for(int i = 0; i < romanNumeral.length(); i++) {
			tempChar[i] = romanNumeral.charAt(i);
		}
		String tempString = "";
		
		for(int i = 0; i < romanNumeral.length(); i++) {
			if(tempChar[i] == 'M' || tempChar[i] == 'D' || tempChar[i] == 'C' || tempChar[i] == 'L' || tempChar[i] == 'X' || tempChar[i] == 'V' || tempChar[i] == 'I') {
				tempString = tempString + tempChar[i];
			}	
		}
		return tempString;
	}
	public String increment(){
		romanNumeral = romanNumeral + "I";
		
		return romanNumeral;
	}
}