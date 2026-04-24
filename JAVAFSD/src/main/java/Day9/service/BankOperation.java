package Day9.service;

public interface BankOperation {
	
	void deposit(int accNo,double amount);
	void withdraw(int accNo, double amount);
	void checkbalance(int accNo);

}
