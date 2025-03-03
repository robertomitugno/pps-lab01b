package e1;

public class GoldBankAccount implements BankAccount{

    private CoreBankAccount coreBankAccount;

    public GoldBankAccount(CoreBankAccount coreBankAccount) {
        this.coreBankAccount = coreBankAccount;
    }

    public int getBalance() {
        return coreBankAccount.getBalance();
    }

    public void deposit(int amount) {
        coreBankAccount.deposit(amount);
    }

    public void withdraw(int amount) {
        coreBankAccount.withdraw(amount);
    }
}
