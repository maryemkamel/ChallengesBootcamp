package Day7.Challenge2;

import java.util.ArrayList;

public abstract class BankAccount implements Transactable{
    private String accountNumber;
    private double balance;
    private ArrayList<Transaction> transactionsHistory=new ArrayList<>();

   public BankAccount(String accountNumber, double balance){
        this.accountNumber=accountNumber;
        this.balance=balance;
    }
   public void transfertTransaction(BankAccount bank){
       System.out.println("please enter your destinat accoundert");

   }
    @Override
    public void deposit(double amount)
    {
        if(amount>0) {
            balance += amount;
            System.out.println("Deposited $ "+amount+ " ||"+" new balance $" + balance);
            transactionsHistory.add(new Transaction("deposit",amount));
        }
        else{
            System.out.println("Invalid amount");
        }

    }
    public double getBalance(){
        return balance;
    }
    public void trackTransaction(){
        System.out.println("history of your account : ");
        for(Transaction transaction :transactionsHistory){
            System.out.println(transaction);
            transaction.toString();
        }

    }
    @Override
    public void withdrow(double amount)
    {
        if(amount<=balance){
        balance-=amount;
            System.out.println("Withrow $ "+amount+ " || "+"new balance $" + balance);
            transactionsHistory.add(new Transaction("withdrow",amount));

        }
    }


public static void main(String[]args){
    /*BankAccount bankAccount=new BankAccount("#123456",10000);
    bankAccount.deposit(500);
    bankAccount.withdraw(1000);
    System.out.println("current balance: $"+bankAccount.getBalance());*/


}



}
