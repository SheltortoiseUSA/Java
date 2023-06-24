package financialCalculator;

public class Income {
	// Static Data Members =========================================================================
	// Income Tax
	private static double CA_TAX_COEFF = 0.098;
	private static double FED_TAX_COEFF = 0.24;
	
	// Bonus Tax
	private static double CA_BONUS_TAX_COEFF = 0.1023;
	private static double FED_BONUS_TAX_COEFF = 0.22;
	
	// Default Business Time References
	private static double DEFAULT_HOURS_PER_SHIFT = 8;
	private static double DEFAULT_HOURS_PER_WEEK = 40;
	private static double DEFAULT_SHIFTS_PER_WEEK = 5;
	
	// Static Time References
	private static double WEEKS_IN_YEAR = 52;
	
	// Data Members ================================================================================
	// Income Types
	private double salary;
	private double hourly;
	private double perDiem;
	
	// Timeframe
	private double duration;
	
	// Time Worked
	private double hoursPerShift;
	private double hoursPerWeek;
	private double shiftsPerWeek;
	
	// Alternative Income
	private double currentSavings;
	private double bonus;
	
	// Explicit Constructors =======================================================================
	// Salary
	public Income(
			final double salary,
			final double duration,
			final double currentSavings,
			final double bonus
	) {
		// Static Duration
		this.hoursPerShift = DEFAULT_HOURS_PER_SHIFT;
		this.hoursPerWeek = DEFAULT_HOURS_PER_WEEK;
		this.shiftsPerWeek = DEFAULT_SHIFTS_PER_WEEK;
		
		// Dynamic Income
		this.salary = salary;
		this.hourly = salary / WEEKS_IN_YEAR / DEFAULT_HOURS_PER_WEEK;
		this.perDiem = hourly * DEFAULT_HOURS_PER_SHIFT;
		
		// Dynamic Duration
		this.duration = duration;
		
		// Static Income
		this.currentSavings = currentSavings;
		this.bonus = bonus;
	}
	
	// Hourly
	public Income(
			final double hourly,
			final double hoursPerShift,
			final double hoursPerWeek,
			final double duration,
			final double currentSavings,
			final double bonus
	) {
		// Static Duration
		this.hoursPerShift = hoursPerShift;
		this.hoursPerWeek = hoursPerWeek;
		this.shiftsPerWeek = hoursPerWeek / hoursPerShift;
		
		// Dynamic Income
		this.hourly = hourly;
		this.salary = hourly * hoursPerWeek * WEEKS_IN_YEAR;
		this.perDiem = (hourly * hoursPerShift) + bonus;
		
		// Dynamic Duration
		this.duration = duration;
		
		// Static Income
		this.currentSavings = currentSavings;
		this.bonus = bonus;
	}
	
	// PerDiem
	public Income(
			final double perDiem,
			final double hoursPerShift,
			final double shiftsPerWeek,
			final double duration,
			final double currentSavings,
			final double bonus,
			final String overloadedPlaceholder
	) {
		// Static Duration
		this.hoursPerShift = hoursPerShift;
		this.shiftsPerWeek = shiftsPerWeek;
		this.hoursPerWeek = hoursPerShift * shiftsPerWeek;
		
		// Dynamic Income
		this.perDiem = perDiem;
		this.salary = perDiem * shiftsPerWeek * WEEKS_IN_YEAR;
		this.hourly = perDiem / hoursPerShift;
		
		// Dynamic Duration
		this.duration = duration;
		
		// Static Income
		this.currentSavings = currentSavings;
		this.bonus = bonus;
	}
	
	// Member Methods ==============================================================================
	public double getNetSavings(final String incomeSource) {
		System.out.println(incomeSource);
		
		// Gross Income
		final double TOT_GROSS_INCOME = (hourly * hoursPerWeek * duration);
		System.out.println("Gross Income: " + Utility.getDollarAmount(TOT_GROSS_INCOME));
		
		final double TOT_GROSS_BONUS = (bonus * duration);
		System.out.println("Gross Bonus: " + Utility.getDollarAmount(TOT_GROSS_BONUS));
		
		final double TOT_INCOME = TOT_GROSS_INCOME + TOT_GROSS_BONUS;
		System.out.println("Total Gross Income: " + Utility.getDollarAmount(TOT_INCOME));
		System.out.println();
		
		// Taxes
		double TOT_INCOME_TAX = (TOT_GROSS_INCOME * (CA_TAX_COEFF + FED_TAX_COEFF));
		System.out.println("Income Taxes Witheld: " + Utility.getDollarAmount(TOT_INCOME_TAX));
		
		final double TOT_BONUS_TAX = (TOT_GROSS_BONUS * (CA_BONUS_TAX_COEFF + FED_BONUS_TAX_COEFF));
		System.out.println("Bonus Taxes Witheld: " + Utility.getDollarAmount(TOT_BONUS_TAX));
		
		final double TOT_TAXES = TOT_INCOME_TAX + TOT_BONUS_TAX;
		System.out.println("Total Taxes Witheld: " + Utility.getDollarAmount(TOT_TAXES));
		System.out.println();
		
		// Net Income
		final double NET_INCOME = TOT_GROSS_INCOME - TOT_INCOME_TAX;
		System.out.println("Net Income: " + Utility.getDollarAmount(NET_INCOME));
		
		final double NET_BONUS = TOT_GROSS_BONUS - TOT_BONUS_TAX;
		System.out.println("Net Bonus: " + Utility.getDollarAmount(NET_BONUS));
		
		final double TOT_NET_INCOME = (NET_INCOME + NET_BONUS);
		System.out.println("Total Net Income: " + Utility.getDollarAmount(TOT_NET_INCOME));
		System.out.println("Current Savings: " + Utility.getDollarAmount(currentSavings));
		
		final double COMPLETE_TOT_SAVINGS = TOT_NET_INCOME + currentSavings;
		System.out.println(incomeSource + "'s Total Net Savings: " + Utility.getDollarAmount(COMPLETE_TOT_SAVINGS));
		System.out.println("------------------------------------------------------------------------");
		System.out.println("------------------------------------------------------------------------");
		System.out.println("------------------------------------------------------------------------");
		System.out.println();
		
		return COMPLETE_TOT_SAVINGS;
	}
	
	public void printCalculatedIncomes() {
		System.out.println("Calculated Incomes =====================================================");
		System.out.println("Gross Salary: " + Utility.getDollarAmount(this.salary));
		System.out.println("Gross Hourly: " + Utility.getDollarAmount(this.hourly));
		System.out.println("Gross PerDiem: " + Utility.getDollarAmount(this.perDiem));
	}
}
