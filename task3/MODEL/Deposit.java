package MODEL;

public class Deposit{
    public void processDeposit(Account account, double amount) {
        if (amount > 0) {
            account.deposit(amount);
        } else {
            System.out.println("Invalid deposit amount.");
        }
    }
}
