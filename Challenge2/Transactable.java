package Day7.challenge2;

public interface Transactable {
    public void deposit(double amount) throws Exception;
    public void withdraw(double amount);
}
