package Day7.Challenge2;

import Day7.Challenge2.TransactionType;

import java.util.ArrayList;

public abstract class BankAccount implements Day7.challenge2.Transactable {

    public String numberAccount;
    public double balance;

    public ArrayList<TransactionType> transactionTypes;
    public BankAccount(String numberAccount, double balance) {
        this.numberAccount = numberAccount;
        this.balance = balance;
    }


    public void deposit(double amount) throws Exception {
        if (amount>0) balance+=amount;
        else{
            System.err.println("Error");
            throw new Exception("Invalide ");
        }

    }

    public void withdraw(double amount) {
        if (amount <= balance) {
            balance -= amount;
        } else {
            System.err.println("Insufficient funds");
        }
    }

}
