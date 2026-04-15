package Day3_Lab2;

public class Account  {
	private long acctNum;
	private double balance;
	private Person acctHolder;
	private static long count = 1001;
	private static final double MIN_Balance = 500;
	
	public Account() {
		
	}
	       
	@Override
	public String toString() {
		return "Account [acctNum=" + acctNum + ", balance=" + balance + ", acctHolder=" + acctHolder.getName()  + "]";
	}

	
	
	public Account(Person p1, double i) {
		this.acctNum = count++;
		this.acctHolder = p1;
		if(i >= MIN_Balance) {
			this.balance = i;
		}else {
			System.out.println("Need to deposite atleast 500 MINIMUM BALANCE");
		}
	}

	public long getAcctNum() {
		return acctNum;
	}

	public void setAcctNum(long acctNum) {
		this.acctNum = acctNum;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public Person getAcctHolder() {
		return acctHolder;
	}

	public void setAcctHolder(Person acctHolder) {
		this.acctHolder = acctHolder;
	}

	public static double getMinBalance() {
		return MIN_Balance;
	}

	
	public void deposite(double bal) {
		balance+=bal;
		System.out.println(bal +" deposited succesfully");
	}
	
	public void withdraw(double bal) {
		if(balance - bal <= 500) {
			System.out.println("Need to keep min 500");
		}else {
			this.balance = balance - bal;
			System.out.println(bal +" Withdraw succesfully");

		}
	}
	

}
