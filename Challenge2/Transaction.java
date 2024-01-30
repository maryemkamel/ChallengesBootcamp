package Day7.Challenge2;

import java.util.Date;

public class Transaction {
    private String type;
    private double balance;

    private Date date_Transaction;

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public Transaction(String type, double balance) {
        this.type = type;
        this.balance = balance;
    }

    @Override
    public String toString() {
        return "Transaction{" +
                "type='" + type + '\'' +
                ", balance=" + balance +
                '}';
    }
}
