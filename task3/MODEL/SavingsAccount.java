package MODEL;

public class SavingsAccount extends Account {
    private double interestRate;

    public SavingsAccount(String accountNumber, double balance, double interestRate) {
        super(accountNumber, balance);
        this.interestRate = interestRate;
    }

    public double getInterestRate() {
        return interestRate;
    }

    @Override
    public void deposit(double amount) {
        setBalance(getBalance() + amount);
    }   // when saving account is created initially and get deposited

    public double calculateInterest() {
        return getBalance() * interestRate;
    }
}
