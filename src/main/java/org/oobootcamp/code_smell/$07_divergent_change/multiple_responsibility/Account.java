package org.oobootcamp.code_smell.$07_divergent_change.multiple_responsibility;

public class Account {
    private int accountNumber;
    private double balance = 0;

    public Account(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public void credit(double amount) {
        balance += amount;
    }

    public void debit(double amount) {
        balance -= amount;
    }

    public String toXml() {
        return "<account><id>" + getAccountNumber()
                + "</id><balance>" + getBalance()
                + "</balance></account>";
    }

    public String toText() {
        return "Account: " + accountNumber + "\nBalance: " + balance;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public double getBalance() {
        return balance;
    }
}
