package moreFractionFun;

public class Fraction {
	private int numerator;
	private int denominator;
	
	public Fraction(int _numerator, int _denominator) {
		numerator = _numerator;
		denominator = _denominator;
	}
	public int getNumerator() {
		return numerator;
	}
	public int getDenominator() {
		return denominator;
	}
	public void setNumerator(int n) {
		numerator = n;
	}
	public void setDenominator(int d) {
		denominator = d;
	}
	public String displayFraction() {
		String str = (numerator + " / " + denominator);
		
		return str;
	}
	public boolean equalTo(Fraction x2) {
		String x1String = (numerator + " / " + denominator);
		String x2String = new String(x2.getNumerator() + " / " + x2.getDenominator());
		
		if(x1String.equals(x2String)) {
			return true;
		}
		else {
			return false;
		}
	}
	public int reduce() {
		for(int i = 1; i < (denominator + numerator); i++) {
			if(denominator % i == 0 && numerator % i == 0) {
				denominator /= i;
				numerator /= i;
			}
		}
		return((numerator) / (denominator));
	}
	public Fraction add(Fraction x2) {
		int x3Denominator = denominator * x2.getDenominator();
		int x3Numerator = (x2.getDenominator() * numerator) + (denominator * x2.getNumerator());
		
		Fraction x3 = new Fraction(x3Numerator, x3Denominator);
		
		return x3;
	}
	public Fraction subtract(Fraction x2) {
		int x4Denominator = denominator * x2.getDenominator();
		int x4Numerator = (x2.getDenominator() * numerator) - (denominator * x2.getNumerator());
		
		Fraction x4 = new Fraction(x4Numerator, x4Denominator);
		
		return x4;
	}
	public Fraction multiply(Fraction x2) {
		int x5Numerator = numerator * x2.getNumerator();
		int x5Denominator = denominator * x2.getDenominator();
		
		Fraction x5 = new Fraction(x5Numerator, x5Denominator);
		
		return x5;
	}
	public Fraction divide(Fraction x2) {
		int x6Numerator = numerator * x2.getDenominator();
		int x6Denominator = denominator * x2.getNumerator();
		
		Fraction x6 = new Fraction(x6Numerator, x6Denominator);
		
		return x6;
	}
	public String toString() {
		String fraction = (numerator + " / " + denominator);
		
		return fraction;
	}
}