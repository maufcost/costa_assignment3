package costa_problem2;

public class SavingsAccountTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String months[] = {"January", "Feburary", "March", "April",
				"May", "June", "July", "August", "September", "October", "November", "December"};
		
		// Instantiating both required objects.
		SavingsAccount saver1 = new SavingsAccount(2000.0);
		SavingsAccount saver2 = new SavingsAccount(3000.0);
		
		// Setting the interest rate to 4% for each account.
		SavingsAccount.modifyInterestRate(0.04);
		
		// Calculating the monthly interests for both accounts.
		System.out.println("\n--- Saver 1 Account Monthly Interests at 4%: ---\n");
		for(int i = 0; i < 12; i++) {
			System.out.printf("%s's Balance: %.2f.\n", months[i], saver1.calculateMonthlyInterest());
		}
		
		System.out.println("\n--- Saver 2 Account Monthly Interests at 4%: ---\n");
		for(int i = 0; i < 12; i++) {
			System.out.printf("%s's Balance: %.2f.\n", months[i], saver2.calculateMonthlyInterest());
		}
		
		// Setting the interest rate to 5% for each account.
		SavingsAccount.modifyInterestRate(0.05);
		
		// Calculating the monthly interest.
		System.out.println("\n--- Saver 1 Account Monthly Interests at 5%: ---\n");
		for(int i = 0; i < 12; i++) {
			System.out.printf("%s's Balance: %.2f.\n", months[i], saver1.calculateMonthlyInterest());
		}
		
		System.out.println("\n--- Saver 2 Account Monthly Interests at 5%: ---\n");
		for(int i = 0; i < 12; i++) {
			System.out.printf("%s's Balance: %.2f.\n", months[i], saver2.calculateMonthlyInterest());
		}
	}
}
