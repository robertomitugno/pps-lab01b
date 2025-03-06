package e1;

public class BankAccountImpl implements BankAccount {

    private int balance;

    @Override
    public void deposit(int amount) {
        this.balance = this.balance + amount;
    }

    @Override
    public void withdraw(int amount) {
        this.balance = this.balance - amount;

    }

    @Override
    public int getBalance() {
        return this.balance;
    }

}
