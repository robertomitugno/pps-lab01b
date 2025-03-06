package e1;

public class BronzeBankAccount extends CoreBankAccount{

    public BronzeBankAccount(BankAccount coreBankAccount) {
        super(coreBankAccount);
    }

    @Override
    public void withdraw(int amount) {
        if (this.getBalance() < amount){
            throw new IllegalStateException();
        }
        bankAccount.withdraw(amount);
    }
}
