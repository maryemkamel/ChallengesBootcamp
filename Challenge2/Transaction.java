package Day7.Challenge2;

public class Transaction {
    private String type;
    private double amount;

    public Transaction(String type, double amount){
        this.type=type;
        this.amount=amount;
    }

    @Override
    public String toString() {
        return "Transaction {" +
                " type='" + type + '\'' +
                ", amount=" + amount +
                 '}';
    }
}
