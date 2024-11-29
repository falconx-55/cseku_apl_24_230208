public abstract class Account {
    private String accountNumber;
    private double balance;

    public Account(String accountNumber, double balance) {
       
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    protected void setBalance(double balance) {
       
    }

    public abstract void withdraw(double amount);
    public abstract void deposit(double amount);
}
