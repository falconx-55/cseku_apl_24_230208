public class Withdraw {
    public void processWithdrawal(Account account, double amount) {
        if (amount > 0) {
            account.withdraw(amount);
            System.out.println("Withdrawn " + amount + " from account " + account.getAccountNumber());
        } else {
            System.out.println("Invalid withdrawal amount.");
        }
    }
}
