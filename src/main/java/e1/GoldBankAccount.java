package e1;

public class GoldBankAccount extends CoreBankAccount{

    private static final int MAX_NEGATIVE_BALANCE = -500;

    public GoldBankAccount(BankAccount coreBankAccount) {
        super(coreBankAccount);
    }

    public void withdraw(int amount) {
        if (this.getBalance() - amount < MAX_NEGATIVE_BALANCE){
            throw new IllegalStateException("The balance cannot go below -500.");
        }
        bankAccount.withdraw(amount);
    }

}
