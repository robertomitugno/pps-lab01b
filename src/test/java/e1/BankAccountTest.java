package e1;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class BankAccountTest {

    protected BankAccount account;
    private static final int BALANCE_INITIALLY = 0;
    protected static final int DEPOSIT_AMOUNT = 1000;

    @BeforeEach
    void beforeEach() {
        account = new BankAccountImpl();
    }

    @Test
    public void testInitiallyEmpty() {
        assertEquals(BALANCE_INITIALLY, account.getBalance());
    }

    @Test
    public void testCanDeposit() {
        account.deposit(DEPOSIT_AMOUNT);
        assertEquals(DEPOSIT_AMOUNT, account.getBalance());
    }

}