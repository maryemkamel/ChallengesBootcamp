package Day7.Challenge2;

import java.util.ArrayList;
import java.util.List;

public class TransactionManager {

    private List<BankAccount> accounts;

    public TransactionManager() {
        this.accounts = new ArrayList<>();
    }

    public void addAccount(BankAccount account) {
        accounts.add(account);
    }

    public void performTransactions() {

        for (BankAccount account : accounts) {
            account.deposit(1000.0);
            account.withdrow(500.0);
        }
    }

    public void displayAllTransactionHistories() {
        System.out.println("Transaction Histories for All Accounts:");
        for (BankAccount account : accounts) {
            System.out.println("Account Type: " + account.getClass().getSimpleName());
            account.trackTransaction();
            System.out.println("---------------------------------------");
        }
    }

    public static void main(String[] args) {
        TransactionManager transactionManager = new TransactionManager();

        // Create instances of different account types
        SavingsAccount savingsAccount = new SavingsAccount( "122",1200.0);
        CheckingAccount checkingAccount = new CheckingAccount("5678",1000.0,500.0);
        // Add accounts to the manager
        transactionManager.addAccount(savingsAccount);
        transactionManager.addAccount(checkingAccount);
        transactionManager.performTransactions();
        transactionManager.displayAllTransactionHistories();
        //transfert transaction
    }
}

