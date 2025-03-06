package e1;

public class GoldBankAccount extends CoreBankAccount{

    public GoldBankAccount(BankAccount coreBankAccount) {
        super(coreBankAccount);
    }

    public void withdraw(int amount) {
        if (this.getBalance() - amount < -500){
            throw new IllegalStateException("The balance cannot go below -500.");
        }
        bankAccount.withdraw(amount);
    }

}
