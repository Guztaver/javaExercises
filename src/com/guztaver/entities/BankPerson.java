package com.guztaver.entities;

public class BankPerson {
    private final int accountNumber;
    private String accountHolder;
    private double accountBalance;

    public BankPerson(int accountNumber, String accountHolder) {
        this.accountNumber = accountNumber;
        this.accountHolder = accountHolder;
    }

    public BankPerson(int accountNumber, String accountHolder, double depositInitial) {
        this.accountNumber = accountNumber;
        this.accountHolder = accountHolder;
        bankDeposit(depositInitial);
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public String getAccountHolder() {
        return accountHolder;
    }

    public void setAccountHolder() {
        this.accountHolder = accountHolder;
    }

    public double getBalance() {
        return accountBalance;
    }

    public void bankWithdraw(double accountBalance) {
        this.accountBalance -= accountBalance + 5.00;
    }

    public void bankDeposit(double accountBalance) {
        this.accountBalance += accountBalance;
    }
}
