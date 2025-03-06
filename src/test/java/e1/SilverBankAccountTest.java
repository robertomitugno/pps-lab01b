package e1;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class SilverBankAccountTest extends BankAccountTest{

    private BankAccount silverBankAccount;

    @BeforeEach
    void beforeEach(){
        super.beforeEach();
        silverBankAccount = new SilverBankAccount(super.account);
    }


    @Test
    public void testCanWithdraw() {
        int withdrawAmount = 200;
        int balanceAfterWithdrawWithFee = 799;
        this.silverBankAccount.deposit(DEPOSIT_AMOUNT);
        this.silverBankAccount.withdraw(withdrawAmount);
        assertEquals(balanceAfterWithdrawWithFee, this.silverBankAccount.getBalance());
    }

    @Test
    public void testCannotWithdrawMoreThanAvailable(){
        int withdrawAmountExceed = 1200;
        this.silverBankAccount.deposit(DEPOSIT_AMOUNT);
        assertThrows(IllegalStateException.class, () -> this.silverBankAccount.withdraw(withdrawAmountExceed));
    }

}
