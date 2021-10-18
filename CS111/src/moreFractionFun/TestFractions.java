package moreFractionFun;

public class TestFractions {
    
	public static void main(String[] args) {
        System.out.println("Test Application for the Fraction class");

        Fraction x1 = new Fraction(3, 9);
        Fraction x2 = new Fraction(1, 3);
        Fraction x3, x4, x5, x6;

        System.out.println("x1 = " + x1);
        System.out.println("x2 = " + x2);

        if(x1.equalTo(x2)) {
        	System.out.println("\nx1 and x2 are equal.\n");
        }
            
        else {
        	System.out.println("\nx1 and x2 are NOT equal.\n");
        } 
        x1.reduce();
        
        System.out.println("After reduction, x1 is " + x1.toString());
        
        if(x1.equalTo(x2)) {
        	System.out.println("x1 and x2 are equal.\n");
        }
        else {
        	System.out.println("x1 and x2 are NOT equal\n.");
        }
        x1.setNumerator(3);
        x1.setDenominator(4);
        System.out.println("x1 is set to " + x1.toString());

        x3 = x1.add(x2);
        System.out.println("\nx3: x1 + x2 = " + x3.toString());

        x4 = x1.subtract(x2);
        System.out.println("x4: x1 - x2 = " + x4.toString());

        x5 = x1.multiply(x2);
        System.out.println("x5: x1 * x2 = " + x5.toString());

        x6 = x1.divide(x2);
        System.out.println("x6: x1 / x2 = " + x6.toString());
    }
}