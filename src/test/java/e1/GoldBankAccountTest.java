package e1;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class GoldBankAccountTest {

    private static final int BALANCE_INITIALLY = 0;
    private static final int DEPOSIT_AMOUNT = 500;
    private static final int WITHDRAW_AMOUNT = 300;
    private static final int BALANCE_AFTER = 200;

    CoreBankAccount coreBankAccount = new CoreBankAccount();
    BankAccount account;

    @BeforeEach
    void beforeEach() {
        this.account = new GoldBankAccount(coreBankAccount);
    }

    @Test
    public void testInitiallyEmpty(){
        assertEquals(BALANCE_INITIALLY, account.getBalance());
    }

    @Test
    public void testCanDeposit() {
        this.account.deposit(DEPOSIT_AMOUNT);
        assertEquals(DEPOSIT_AMOUNT, this.account.getBalance());
    }

    @Test
    public void testCanWithdraw() {
        this.account.deposit(DEPOSIT_AMOUNT);
        this.account.withdraw(WITHDRAW_AMOUNT);
        assertEquals(BALANCE_AFTER, this.account.getBalance());
    }
}
