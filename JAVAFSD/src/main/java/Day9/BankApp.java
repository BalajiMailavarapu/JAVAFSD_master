package Day9;

import Day9.service.*;
import Day9.util.TransactionUtil;

import java.util.Scanner;

public class BankApp {
	
	static
	{
		System.out.println("Bank application started");
	}

	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		BankService service = new BankService();
		
		Account a1 = new Account(101,"Balaji",1000);
		Account a2 = new Account(102,"Durga",2000);
		
		service.addAccount(a1);
		service.addAccount(a2);
		
		service.displayAccounts();
		
		System.out.println("Enter account number:");
		int accNo = sc.nextInt();
		
		double amount=500;
		TransactionUtil Transactionutil = new TransactionUtil();
		
		if(Transactionutil.isvalidamount(amount))
		{
		 service.deposit(accNo,amount);
		}
		service.checkbalance(accNo);
		sc.close();
	}
	
	

}