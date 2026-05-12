package pac1;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.mockito.Mockito;

import Day19.BankApp;

public class BankAppTest {

    @ParameterizedTest
    @CsvSource({
        "500,1500",
        "1000,2000",
        "200,1200"
    })

    void testDeposit(double depositAmount, double expectedBalance) {

        BankApp b = new BankApp();

        b.deposit(depositAmount);

        System.out.println("Balance: " + b.getBalance());

        assertEquals(expectedBalance, b.getBalance());
    }
    
    @Test
    void testDeposit1() {

        BankApp service = Mockito.mock(BankApp.class);

        Mockito.when(service.deposited(500)).thenReturn("Deposit Success");

        String result = service.deposited(500);

        System.out.println(result);

        assertEquals("Deposit Success", result);
    }
}
