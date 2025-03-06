package e1;

public class SilverBankAccount extends CoreBankAccount{

    private static final int FEE = 1;

    public SilverBankAccount(BankAccount bankAccount) {
        super(bankAccount);
    }

    public void withdraw(int amount) {
        if (this.getBalance() < amount){
            throw new IllegalStateException();
        }
        bankAccount.withdraw(amount + FEE);
    }
}
