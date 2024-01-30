package Day7.Challenge2;

public class CheckingAccount extends BankAccount{
    private double creditLimit;

    public CheckingAccount(String accountNumber, double balance,double creditLimit) {
        super(accountNumber, balance);
        this.creditLimit = creditLimit;
    }

    @Override
    public void withdrow(double amount)
    {
        if(amount<=getBalance()){
            super.withdrow(amount);
            super.trackTransaction();
        }
        else if (amount <= getBalance() + creditLimit) {
            super.withdrow(amount);

            if (amount > getBalance() && (amount - getBalance()) <= creditLimit) {
                    System.out.println("Your credit was used for overdraft");
                    super.trackTransaction();
                }
        } else {
            System.out.println("You have reached the balance limits !!!!!!");
        }
    }




}
