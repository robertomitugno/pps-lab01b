package e1;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class BronzeBankAccountTest extends BankAccountTest{

    private BankAccount bronzeBankAccountTest;

    @BeforeEach
    public void beforeEach() {
        super.beforeEach();
        bronzeBankAccountTest = new BronzeBankAccount(super.account);
    }

    @Test
    public void testCanWithdraw() {
        int withdrawAmount = 50;
        int balanceAfterWithdraw = 950;
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

    @Test
    public void testWithdrawWithFeeEqualsOne(){
        int withdrawAmount = 100;
        int balanceAfterWithdrawWithFee = DEPOSIT_AMOUNT - withdrawAmount - 1;
        bronzeBankAccountTest.deposit(DEPOSIT_AMOUNT);
        bronzeBankAccountTest.withdraw(withdrawAmount);
        assertEquals(balanceAfterWithdrawWithFee, bronzeBankAccountTest.getBalance());
    }
}
