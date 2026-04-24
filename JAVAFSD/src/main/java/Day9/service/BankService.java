package Day9.service;

import Day9.*;

public class BankService implements BankOperation {
	
	private static final double MIN_BALANCE=500;
	private Account[] accounts = new Account[5];
	private int count=0;
	
	public void addAccount(Account acc)
	{
		if(count<accounts.length)
		{
			accounts[count++]=acc;
		}
		else
		{
			System.out.println("Bank storage is full");
		}
	}
	
	@Override
	public void deposit(int accNo,double amount)
	{
		for(int i=0;i<count;i++)
		{
			if(accounts[i].getAccNo()==accNo)
			{
				accounts[i].setBalance(accounts[i].getBalance()+amount);
				System.out.println("Amount deposited successfully");
				return;
			}
		}
	}
	


	@Override
	public void withdraw(int accNo,double amount)
	{
		for(int i=0;i<count;i++)
		{
			if(accounts[i].getAccNo()==accNo)
			{
				if(accounts[i].getBalance()>=MIN_BALANCE)
				{
				accounts[i].setBalance(accounts[i].getBalance()-amount);	
				System.out.println("Withdraw successful");
				}
				else
				{
					System.out.println("Minimum balance of" +MIN_BALANCE+"must be maintained");

				}
			}
		}
	}
	@Override
	public void checkbalance(int accNo)
	{
	  if(count==0)
	   {
		   System.out.println("No accounts available");
	   }
	   else
	   {
		   

		for(int i=0;i<count;i++)
		{
			if(accNo==accounts[i].getAccNo())
			{
			System.out.println(accounts[i].getAccNo()+"  "+
	                       accounts[i].getName()+"  "+
				           accounts[i].getBalance()+"  ");
			}
		
		}
	   }
	}
	
	public void displayAccounts()
	{
		for(int i=0;i<count;i++)
		{
			System.out.println(accounts[i].getAccNo()+"  "+
		                       accounts[i].getName()+"  "+
					           accounts[i].getBalance()+"  ");
			
		
		}
	}
		
	}


