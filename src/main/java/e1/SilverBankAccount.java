package e1;

public class SilverBankAccount {

    private static final int FEE = 1;

    private CoreBankAccount base = new CoreBankAccount();

    public int getBalance() {
        return base.getBalance();
    }

    public void deposit(int amount) {
        base.deposit(amount);
    }

    public void withdraw(int amount) {
        if (this.getBalance() < amount){
            throw new IllegalStateException();
        }
        base.withdraw(amount + FEE);
    }
}
