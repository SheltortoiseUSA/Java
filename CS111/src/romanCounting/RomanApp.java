package romanCounting;

public class RomanApp {
    public static void main(String[] args) {
        System.out.println("Test Application for RomanApp");
        
        RomanNumeral x1 = new RomanNumeral("DXI", 0);
        RomanNumeral x2 = new RomanNumeral("", 0);
        
        System.out.println("x1 decimal = " + x1.decimalValue() + " roman = " + x1.romanValue());
        System.out.println("x2 decimal = " + x2.decimalValue() + " roman = " + x2.romanValue());
        
        System.out.println("\nRESET X2:");
        System.out.println("BEFORE decimal = " + x2.getDecimalValue() + " roman = " + x2.getRomanValue());
        x2.set("XD");
        System.out.println("AFTER decimal = " + x2.getDecimalValue() + " roman =" + x2.getRomanValue());
        
        System.out.println("\nINCREMENTING X2:");
        System.out.println("BEFORE decimal = " + x2.getDecimalValue() + " roman =" + x2.getRomanValue());
        x2.increment();
        System.out.println("AFTER decimal = " + x2.getDecimalValue() + " roman =" + x2.getRomanValue());
        
        if(x1.getDecimalValue() == x2.getDecimalValue()) {
        	System.out.println("x1 and x2 are equal in value.");
        } 
        else {
        	System.out.println("x1 and x2 are NOT equal in value.");
        } 
    }
} 