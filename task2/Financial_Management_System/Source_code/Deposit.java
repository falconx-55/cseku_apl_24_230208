public class Deposit {
    public void processDeposit(Account account, double amount) {
        if (amount > 0) {
            account.deposit(amount);
            System.out.println("Deposited " + amount + " to account " + account.getAccountNumber());
        } else {
            System.out.println("Invalid deposit amount.");
        }
    }
}
