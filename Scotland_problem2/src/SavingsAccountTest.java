import java.util.*;

public class SavingsAccountTest {
    
	public static void main(String[] args) {		
		
		int i;
				
		SavingsAccount saver1 = new SavingsAccount();
		SavingsAccount saver2 = new SavingsAccount();
		saver1.setBalance(2000);
		saver2.setBalance(3000);
		SavingsAccount.modifyInterestRate(.04);
		for(i = 1; i < 13; i++) 
    	{
			String Mth = getMonths(i);
			saver1.calculateMonthlyInterest();
			saver2.calculateMonthlyInterest();
			System.out.print( Mth+ ":\n");
			System.out.print("  Saver 1 Balance: " + saver1.getBalance() + "\n");
			System.out.print("  Saver 2 Balance: " + saver2.getBalance() + "\n");
    	}
		saver1.setBalance(2000);
		saver2.setBalance(3000);
		SavingsAccount.modifyInterestRate(.05);
		saver1.calculateMonthlyInterest();
		saver2.calculateMonthlyInterest();
		System.out.print(  "\n\nMarch :\n");
		System.out.print("  Saver 1 Balance: " + saver1.getBalance() + "\n");
		System.out.print("  Saver 2 Balance: " + saver2.getBalance() + "\n");
	
	}
	public static String getMonths(int i)
	{
		String mth = "";
		switch(i)
		{
		   case 1:
			   mth = "January";
			   break;
		   case 2:
			   mth = "February";
			   break;
		   case 3:
			   mth = "March";
			   break;
		   case 4:
			   mth = "April";
			   break;
		   case 5:
			   mth = "May";
			   break;
		   case 6:
			   mth = "June";
			   break;
		   case 7:
			   mth = "July";
			   break;
		   case 8:
			   mth = "August";
			   break;
		   case 9:
			   mth = "September";
			   break;
		   case 10:
			   mth = "October";
			   break;
		   case 11:
			   mth = "November";
			   break;
		   case 12:
			   mth = "Dececember";
			   break;   
		}
		return mth;
	}

}