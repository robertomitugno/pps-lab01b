package e1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class GoldBankAccountTest {

    CoreBankAccount coreBankAccount = new CoreBankAccount();
    BankAccount account;

    @Test
    public void testInitiallyEmpty(){
        account = new GoldBankAccount(coreBankAccount);
        assertEquals(0, account.getBalance());
    }
}
