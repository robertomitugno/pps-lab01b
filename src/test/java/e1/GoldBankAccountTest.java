package e1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class GoldBankAccountTest {

    private static final int BALANCE_INITIALLY = 0;

    CoreBankAccount coreBankAccount = new CoreBankAccount();
    BankAccount account;

    @Test
    public void testInitiallyEmpty(){
        account = new GoldBankAccount(coreBankAccount);
        assertEquals(BALANCE_INITIALLY, account.getBalance());
    }
}
