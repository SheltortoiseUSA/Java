package fractionFun;

public class Fraction {
	private double numerator;
	private double denominator;
	private String str;
	
	public Fraction(double _numerator, double _denominator, String _str) {
		numerator = _numerator;
		denominator = _denominator;
		str = _str;
	}
	public String toString() {
		str = (numerator + " / " + denominator);
		
		return str;
	}
	public double getNumerator() {
		return numerator;
	}
	public double getDenominator() {
		return denominator;
	}
	public double setNumerator(double j) {
		numerator = j;
		
		return numerator;
	}
	public double setDenominator(int i) {
		denominator = i;
		
		return denominator;
	}
	public double getAnswer(){
		if(denominator == 0) {
			System.out.println(avoid0());
			
			return ((numerator) / (denominator += 1));
		}
		else {
			return (numerator / denominator);
		}			
	}
	public double getIncrement() {
		setNumerator(2 * numerator);
		
		return numerator;
	}
	public String avoid0() {
		return "0 is not allowed in the denominator, so 1 has been added to the denominator";
	}
}