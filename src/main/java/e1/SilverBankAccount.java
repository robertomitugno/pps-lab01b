package e1;

public class SilverBankAccount implements BankAccount{

    private static final int FEE = 1;

    private CoreBankAccount coreBankAccount;

    public SilverBankAccount(CoreBankAccount coreBankAccount) {
        this.coreBankAccount = coreBankAccount;
    }

    public int getBalance() {
        return coreBankAccount.getBalance();
    }

    public void deposit(int amount) {
        coreBankAccount.deposit(amount);
    }

    public void withdraw(int amount) {
        if (this.getBalance() < amount){
            throw new IllegalStateException();
        }
        coreBankAccount.withdraw(amount + FEE);
    }
}
