package e1;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class SilverBankAccountTest extends BankAccountTest{

    private static final int WITHDRAW_AMOUNT = 200;
    private static final int BALANCE_AFTER_WITHDRAW_WITH_FEE = 799;
    private static final int WITHDRAW_AMOUNT_EXCEED = 1200;

    private BankAccount silverBankAccount;

    @BeforeEach
    void beforeEach(){
        super.beforeEach();
        silverBankAccount = new SilverBankAccount(super.account);
    }


    @Test
    public void testCanWithdraw() {
        this.silverBankAccount.deposit(DEPOSIT_AMOUNT);
        this.silverBankAccount.withdraw(WITHDRAW_AMOUNT);
        assertEquals(BALANCE_AFTER_WITHDRAW_WITH_FEE, this.silverBankAccount.getBalance());
    }

    @Test
    public void testCannotWithdrawMoreThanAvailable(){
        this.silverBankAccount.deposit(DEPOSIT_AMOUNT);
        assertThrows(IllegalStateException.class, () -> this.silverBankAccount.withdraw(WITHDRAW_AMOUNT_EXCEED));
    }

}
