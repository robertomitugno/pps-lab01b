package e1;

class CoreBankAccount implements BankAccount {
    protected BankAccount bankAccount;

    public CoreBankAccount(BankAccount bankAccount) {
        this.bankAccount = bankAccount;
    }

    public int getBalance() {
        return bankAccount.getBalance();
    }

    public void deposit(int amount) {
        this.bankAccount.deposit(amount);
    }

    public void withdraw(int amount) {
        this.bankAccount.withdraw(amount);
    }
}