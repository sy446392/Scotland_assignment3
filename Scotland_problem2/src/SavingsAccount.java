public class SavingsAccount {
    
	static double annualInterestRate;
	private double savingsBalance;
	
	public void calculateMonthlyInterest() 
	{
		double sBalance = savingsBalance;
		double annInt = annualInterestRate;
		savingsBalance = sBalance + (sBalance * annInt / 12);
	}
	public double getBalance() 
	{
		return savingsBalance;
	}
	public void setBalance(double x) 
	{
		savingsBalance = x;
	}
	static void modifyInterestRate(double x) 
	{
		annualInterestRate = x;
	}
}