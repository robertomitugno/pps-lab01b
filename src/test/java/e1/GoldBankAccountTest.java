package e1;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class GoldBankAccountTest extends BankAccountTest {

    private BankAccount goldBankAccount;

    @BeforeEach
    void beforeEach() {
        super.beforeEach();
        goldBankAccount = new GoldBankAccount(super.account);
    }

    @Test
    public void testCanWithdraw() {
        int withdrawAmount = 300;
        int balanceAfterWithdraw = 700;
        this.goldBankAccount.deposit(DEPOSIT_AMOUNT);
        this.goldBankAccount.withdraw(withdrawAmount);
        assertEquals(balanceAfterWithdraw, this.goldBankAccount.getBalance());
    }

    @Test
    public void testCanWithdrawOverdraft() {
        int withdrawAmountOverdraft = 1500;
        int expectedBalanceOverdraft = DEPOSIT_AMOUNT - withdrawAmountOverdraft;
        this.goldBankAccount.deposit(DEPOSIT_AMOUNT);
        this.goldBankAccount.withdraw(withdrawAmountOverdraft);
        assertEquals(expectedBalanceOverdraft, this.goldBankAccount.getBalance());
    }

    @Test
    public void testWithdrawExceedOverdraft() {
        int withdrawAmountExceed = 1600;
        this.goldBankAccount.deposit(DEPOSIT_AMOUNT);
        assertThrows(IllegalStateException.class, () -> this.goldBankAccount.withdraw(withdrawAmountExceed));
    }
}
