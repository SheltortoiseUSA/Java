package financialCalculator;

public class Income {
	// Static Data Members =========================================================================
	// Income Tax
	private static double CA_TAX_COEFF = 0.098;
	private static double FED_TAX_COEFF = 0.24;
	private static double TOT_TAX_COEFF = 
			(1 - (CA_TAX_COEFF + FED_TAX_COEFF));
	
	// Bonus Tax
	private static double CA_BONUS_TAX_COEFF = 0.1023;
	private static double FED_BONUS_TAX_COEFF = 0.22;
	private static double TOT_BONUS_TAX_COEFF = 
			(1 - (CA_BONUS_TAX_COEFF + FED_BONUS_TAX_COEFF));
	
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
	public double getNetIncome() {
		final double netSalary = ((hourly * hoursPerWeek * duration) * TOT_TAX_COEFF);
		final double netBonus = ((bonus * duration) * TOT_BONUS_TAX_COEFF);
		return (netSalary + netBonus + currentSavings);
	}
	
	public void printNetIncome() {
		System.out.println("Input =================================================");
		System.out.println("Gross Salary: " + Utility.getDollarAmount(this.salary));
		System.out.println("Gross Hourly: " + Utility.getDollarAmount(this.hourly));
		System.out.println("Gross PerDiem: " + Utility.getDollarAmount(this.perDiem));
		
		System.out.println("Final Output ==========================================");
		System.out.println("Net Income: " + Utility.getDollarAmount(this.getNetIncome()));
		
		System.out.println();
	}
}
