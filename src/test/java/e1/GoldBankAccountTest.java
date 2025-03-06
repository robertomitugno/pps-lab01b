package e1;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class GoldBankAccountTest extends BankAccountTest {

    private static final int WITHDRAW_AMOUNT = 300;
    private static final int BALANCE_AFTER_WITHDRAW = 200;

    private BankAccount goldBankAccount;

    @BeforeEach
    void beforeEach() {
        super.beforeEach();
        goldBankAccount = new GoldBankAccount(super.account);
    }

    @Test
    public void testCanWithdraw() {
        this.goldBankAccount.deposit(DEPOSIT_AMOUNT);
        this.goldBankAccount.withdraw(WITHDRAW_AMOUNT);
        assertEquals(BALANCE_AFTER_WITHDRAW, this.goldBankAccount.getBalance());
    }

    @Test
    public void testCanWithdrawOverdraft() {
        this.goldBankAccount.deposit(DEPOSIT_AMOUNT);
        this.goldBankAccount.withdraw(1500);
        assertEquals(-500, this.goldBankAccount.getBalance());
    }
}
