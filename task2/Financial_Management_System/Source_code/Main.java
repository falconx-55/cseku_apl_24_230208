public class Main {
    public static void main(String[] args) {
        // Create customer
        Customer customer1 = new Customer("01", "Pranto Mondol", "Hall Road", "01308020274");
        Customer customer2 = new Customer("02", "Emon", "Hall Road", "01998020274");

        // Create savings and current accounts
        SavingsAccount savingsAccount = new SavingsAccount("01", 5000, 0.03);  // 3% interest rate
        CurrentAccount currentAccount = new CurrentAccount("01", 2000, 1000);  // 1000 overdraft limit

        // Create transaction classes
        Deposit depositTransaction = new Deposit();
        Withdraw withdrawTransaction = new Withdraw();
    }
}
