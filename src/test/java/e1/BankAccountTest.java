package e1;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class BankAccountTest {

    private static final int BALANCE_INITIALLY = 0;
    private static final int DEPOSIT_AMOUNT = 1000;
    private static final int WITHDRAW_AMOUNT = 200;
    private static final int BALANCE_AFTER_WITHDRAW_WITH_FEE = 799;
    private static final int WITHDRAW_AMOUNT_EXCEED = 1200;

    private BankAccount account;

    @BeforeEach
    void init(){
        this.account = new BankAccount();
    }

    @Test
    public void testInitiallyEmpty() {
        assertEquals(BALANCE_INITIALLY, this.account.getBalance());
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
        assertEquals(BALANCE_AFTER_WITHDRAW_WITH_FEE, this.account.getBalance());
    }

    @Test
    public void testCannotWithdrawMoreThanAvailable(){
        this.account.deposit(DEPOSIT_AMOUNT);
        assertThrows(IllegalStateException.class, () -> this.account.withdraw(WITHDRAW_AMOUNT_EXCEED));
    }

}
