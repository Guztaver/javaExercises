package com.guztaver.bank;

import com.guztaver.entities.BankPerson;

import java.util.Scanner;

import static java.lang.System.*;
import static java.lang.System.in;

public class Solution {
    public Solution() {
        System.out.println("Bank user solution: ");

        var userInput = new Scanner(in);

        out.print("Enter account number: ");
        var accountNumber = userInput.nextInt();

        userInput.nextLine();

        out.print("Enter account holder: ");
        var accountName = userInput.next();

        out.print("Is there an initial deposit? (yes/no): ");
        var haveInitialDeposit = userInput.next();

        BankPerson bankPerson;
        if (haveInitialDeposit.startsWith("y")) {
            out.print("How much? ");
            var depositValue = userInput.nextDouble();
            bankPerson = new BankPerson(accountNumber, accountName, depositValue);
        } else {
            bankPerson = new BankPerson(accountNumber, accountName);
        }

        out.printf("""
                \n
                Account data:
                Account Nª %d, Holder: %s, Balance: $%.2f""",
                bankPerson.getAccountNumber(),
                bankPerson.getAccountHolder(),
                bankPerson.getBalance());

        // Withdraw/Deposit logic
        out.print("\n" +
                "Enter a deposit value: ");
        var addBalance = userInput.nextDouble();
        bankPerson.bankDeposit(addBalance);

        out.printf("""
                \n
                Updated account data:
                Account Nª %d, Holder: %s, Balance: $%.2f""",
                bankPerson.getAccountNumber(),
                bankPerson.getAccountHolder(),
                bankPerson.getBalance());

        out.print("\n" +
                "Enter a withdraw value: ");
        var withdrawBalance = userInput.nextDouble();
        bankPerson.bankWithdraw(withdrawBalance);

        out.printf("""
                \n
                Updated account data:
                Account Nª %d, Holder: %s, Balance: $%.2f""",
                bankPerson.getAccountNumber(),
                bankPerson.getAccountHolder(),
                bankPerson.getBalance());

        userInput.close();
    }
}
