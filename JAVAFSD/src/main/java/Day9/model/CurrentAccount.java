package Day9.model;

import Day9.*;

public class CurrentAccount extends Account{
	
	public CurrentAccount(int accNo,String name, double balance)
	{
		super(accNo,name,balance);
	}

	
	public void displayAccount()
	{
		System.out.println(getAccNo()+" "+
	                       getName()+" "+
				           getBalance()+"(Current Account)");
	}
}