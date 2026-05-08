package pac1;

import org.junit.jupiter.api.BeforeEach;
import org.testng.annotations.Test;

import Day9.Account;
import Day9.service.BankService;

public class BankServiceTest {

    private BankService bankService;
    private Account acc1;
    private Account acc2;

    @BeforeEach
    public void setUp() {
        bankService = new BankService();
        acc1 = new Account(101, "Balaji", 1000);
        acc2 = new Account(102, "Gow", 600);
        bankService.addAccount(acc1);
        bankService.addAccount(acc2);
    }


    @Test
    public void testDeposit() {
        bankService.deposit(101, 500);
        assertEquals(1500, acc1.getBalance());
    }

    @Test
    public void testWithdrawSuccess() {
        bankService.withdraw(101, 200);
        assertEquals(800, acc1.getBalance());
    }

    private void assertEquals(int i, double balance) {
		// TODO Auto-generated method stub
		
	}

	@Test
    public void testWithdrawFailsWhenBelowMinBalance() {
        bankService.withdraw(102, 200); // Bob has 600, withdraw 200 → balance = 400 < MIN_BALANCE
        assertEquals(600, acc2.getBalance()); // Balance should remain unchanged
    }

    @Test
    public void testCheckBalance() {
        bankService.checkbalance(101);
        assertEquals(1000, acc1.getBalance());
    }

   
}

