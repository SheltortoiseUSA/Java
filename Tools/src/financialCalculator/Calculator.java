package financialCalculator;

public class Calculator {

	public static void main(String[] args) {
		final Income tyler = new Income(137000.00, 32.0, 1500.00, 0.0);
		final Income makayla = new Income(44.00, 12.0, 36.0, 32.0, 18000.00, 300.00);
		
		System.out.println("Independent Income ==============================================");
		tyler.printNetIncome();
		makayla.printNetIncome();
		
		System.out.println("Combined Income =================================================");
		System.out.println("Combined Income: " + (tyler.getNetIncome() + makayla.getNetIncome()));
	}
}
