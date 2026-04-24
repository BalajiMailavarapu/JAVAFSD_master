package Day8;

import Day3_Lab2.Person;

abstract class Account {
	
		private int accNum;
		protected double balance;
		private Person accHolder;
		
		public Account(int accNum,Person accHolder, double balance)
		{
			this.accNum=accNum;
			this.accHolder=accHolder;
			this.balance=balance;
		}
		
		public void deposit(double amount)
		{
			balance=balance+amount;
		}
		
		public void withdraw(double amount)
		{
			if(balance-amount>=500)
			{
				balance=balance-amount;
			}
			else
			{
				System.out.println("Minimum balance 500 required");
			}
		}
		
		public double getBalance()
		{
			return balance;
		}

		public String toString()
		{
			return accNum+"  " + accHolder.getName()+" "+balance;
		}
}