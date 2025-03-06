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
        int withdrawAmount = 300;
        int balanceAfterWithdraw = 700;
        bronzeBankAccountTest.deposit(DEPOSIT_AMOUNT);
        bronzeBankAccountTest.withdraw(withdrawAmount);
        assertEquals(balanceAfterWithdraw, bronzeBankAccountTest.getBalance());
    }

    @Test
    public void testCannotWithdrawMoreThanAvailable(){
        int withdrawAmountExceed = 1200;
        bronzeBankAccountTest.deposit(DEPOSIT_AMOUNT);
        assertThrows(IllegalStateException.class, () -> this.bronzeBankAccountTest.withdraw(withdrawAmountExceed));
    }
}
