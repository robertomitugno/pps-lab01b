package e1;

public interface BankAccount {

    int balance = 0;

    void deposit(int amount);

    void withdraw(int amount);

    int getBalance();

}
