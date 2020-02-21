package costa_problem2;

public class SavingsAccount {

	private static double annualInterestRate;
	private double savingsBalance;
	
	public SavingsAccount(double balance) {
		this.savingsBalance = balance;
	}
	
	public double calculateMonthlyInterest() {
		// Calculates the monthly interest.
		this.savingsBalance += ( (annualInterestRate/12.0) * this.savingsBalance ); 
		return this.savingsBalance;
	}
	
	public static void modifyInterestRate(double newRate) {
		annualInterestRate = newRate;
	}
}
