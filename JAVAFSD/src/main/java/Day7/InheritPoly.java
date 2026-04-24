package Day7;

class Account
{
	protected double balance;
	
	public Account(double balance)
	{
		this.balance = balance;
	}
	
	public boolean withdraw(double amount)
	{
		if(amount<=balance)
		{
			balance-=amount;
			return true;
		}
	return false;
	}
	
	public void display()
	{
		System.out.println("Balance:"+balance);
	}
}


class SavingsAccount extends Account
{
	private final double minimumBalance = 500;
	
	public SavingsAccount(double balance)
	{
		super(balance);
	}

	public boolean withdraw(double amount)
	{
		if(balance-amount>=minimumBalance)
		{
			balance-= amount;
			return true;
		}
		else
		{
			System.out.println("Cannot withdraw, minimum balance must be maintained");
			return false;
		}
	}
}

class CurrentAccount extends Account
{
	private double overdraftLimit;
	
	public CurrentAccount(double balance, double overdraftLimit)
	{
		super(balance);
		this.overdraftLimit = overdraftLimit;
	}
	
	public boolean withdraw(double amount)
	{
		if(amount<=(balance+overdraftLimit))
		{
			balance-=amount;
			return true;
		}
		else
		{
			System.out.println("Overdraft limit succeeded");
			return false;
		}
	}
	
}

public class InheritPoly {
	
	public static void main(String[] args)
	{
		Account acc1 = new SavingsAccount(2000);
		Account acc2 = new CurrentAccount(1000,500);
		
		System.out.println("Savings withdraw:"+acc1.withdraw(1200));
		acc1.display();
		
		System.out.println("Current withdraw:"+acc2.withdraw(1300));
		acc2.display();
	}
	

}