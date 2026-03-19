package dz2;

public class BankAccount {
    String owner;
    int balance;

    public BankAccount(String owner, int balance) {
        this.owner = owner;
        this.balance = balance;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public int getBalance() {
        return balance;
    }

    public void deposit(int count) {
        this.balance = balance + count;
    }

    public void withdraw(int count) {
        this.balance = balance - count;
    }

    public void printBalance() {
        System.out.println("Баланс " + balance);
    }
}
