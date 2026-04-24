package Day8;

interface BankOperations{
	
	default void addAccount(int accNo,String name,double balance)
	{
		System.out.println("Add account");
	}
	
	static void displayAccounts(Bank bank)
	{
		for(int i=0;i<bank.count;i++)
		{
			System.out.println(
					bank.accounts[i].getAccNo()+" "+
			        bank.accounts[i].getName()+" "+
					bank.accounts[i].getBalance());
		}
	}
}

	
	class BankAccount
	{
		private int accNo;
		private String name;
		private double balance;
		
		public BankAccount(int accNo,String name,double balance)
		{
			this.accNo=accNo;
			this.name=name;
			this.balance=balance;
		}

		public int getAccNo() {
			return accNo;
		}


		public String getName() {
			return name;
		}


		public double getBalance() {
			return balance;
		}
	}
	
      class Bank implements BankOperations
	{
		BankAccount[] accounts = new BankAccount[10];
		int count = 0;
	
	@Override
	public void addAccount(int accNo,String name,double balance)
	{
		accounts[count] = new BankAccount(accNo,name,balance);
		count++;
		
	}
	
	}
public class Main
{
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Bank bank = new Bank();
		
		bank.addAccount(101,"Balaji",5000);
		bank.addAccount(201,"Gowthami",7000);
		bank.addAccount(301,"Durga",9000);
		
		BankOperations.displayAccounts(bank);
	}
}
