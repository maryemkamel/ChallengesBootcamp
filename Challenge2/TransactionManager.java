package Day7.Challenge2;

import java.util.ArrayList;


public class TransactionManager {
    public ArrayList<BankAccount> bankAccounts = new ArrayList<>();
    public ArrayList<Transaction> transactions = new ArrayList<>();


    public void displayInfoHistory() {
        for (Transaction transaction : transactions){
            System.out.println(transaction);
        }
    }

    public void addAcount(BankAccount account){
        bankAccounts.add(account);
    }
    public void diposit(BankAccount account, double amount) throws Exception {
        account.deposit(amount);
        transactions.add(new Transaction("diposit",amount));

    }
    public void withdrawal(BankAccount account, double amount){
        account.withdraw(amount);
        transactions.add(new Transaction("withdrawal",amount));
    }
    public void displayInfo(BankAccount account){
            System.out.println(account.numberAccount + "   " + account.balance);
    }

    public void transfert(BankAccount bankAccountDepited, BankAccount bankAccountCredited, Double amount) {
        try {
            if (!bankAccounts.contains(bankAccountDepited)) {
                throw new ClassNotFoundException("hana");
            } else {
                bankAccountDepited.balance -= amount;
            }

            if (!bankAccounts.contains(bankAccountCredited)) {
                throw new ClassNotFoundException("hana");
            } else {
                bankAccountCredited.balance += amount;
            }
        } catch (ClassNotFoundException e) {
            // Handle or log the exception
            e.printStackTrace();
        }

}
    public static void main(String[]args){
        SavingsAccount savingsAccount = new SavingsAccount("kiehii-99",40000.5);
        CheckingAccount checkingAccount = new CheckingAccount("jjjj#89",200.00);
        TransactionManager transactionManager = new TransactionManager();
        transactionManager.addAcount(savingsAccount);
        transactionManager.addAcount(checkingAccount);
        transactionManager.displayInfoHistory();
        transactionManager.transfert(savingsAccount,checkingAccount,20000.5);
        transactionManager.displayInfo(savingsAccount);
        transactionManager.displayInfo(checkingAccount);
    }


}
