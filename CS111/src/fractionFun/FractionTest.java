package fractionFun;

public class FractionTest {

   public static void main(String[] args) {
	   System.out.println("Test Application for the Fraction class");

	   Fraction x1 = new Fraction(5, 8, "");
	   Fraction x2 = new Fraction(0, 0, "");

	   System.out.println("x1 = " + x1.toString() + " value = " + x1.getAnswer());
	   System.out.println("x2 = " + x2.toString() + " value = " + x2.getAnswer());

	   System.out.println("\nRESET X2:");
	   System.out.println("BEFORE x2 = " + x2.toString() + " value = " + x2.getAnswer());
	   
	   x2.setDenominator(3);
	   x2.setNumerator(2);
	   
	   System.out.println("AFTER x2 = " + x2.toString() + " value = " + x2.getAnswer());

	   compare(x1, x2);

	   System.out.println("\nINCREMENTING X2:");
	   System.out.println("BEFORE x2 = " + x2.toString() + " value = " + x2.getAnswer());
	   
	   x2.getIncrement();
	   
	   System.out.println("AFTER x2 = " + x2.toString() + " value = " + x2.getAnswer()); 
   }
   public static void compare(Fraction x1, Fraction x2) {
	   if (x1.getAnswer() == x2.getAnswer()) {
		   System.out.println("x1 and x2 are equal in value.");
	   }  
	   else if (x1.getAnswer() > x2.getAnswer()) {
		   System.out.println("x1 is greater than x2.");
	   }
	   else {
		   System.out.println("x1 is less than x2.");
	   } 
   } 
}