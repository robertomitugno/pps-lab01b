package e1;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class BronzeBankAccountTest extends BankAccountTest{

    BankAccount bronzeBankAccountTest;

    @BeforeEach
    public void beforeEach() {
        super.beforeEach();
        bronzeBankAccountTest = new BronzeBankAccount(super.account);
    }

    @Test
    public void testCanWithdraw() {
        bronzeBankAccountTest.deposit(1000);
        bronzeBankAccountTest.withdraw(300);
        assertEquals(700, bronzeBankAccountTest.getBalance());
    }
}
