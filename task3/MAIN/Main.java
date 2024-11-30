package MAIN;

import CONTROLLER.BankController;
import MODEL.Account;
import MODEL.Customer;
import MODEL.SavingsAccount;
import VIEW.BankView;

public class Main {
    public static void main(String[] args) {
        // Create customer and account
        Customer customer = new Customer("01", "Pranto Mondol", "Hall Road", "01308020274");
        Account savingsAccount = new SavingsAccount("01", 5000, 0.03);

        // Initialize View and Controller
        BankView view = new BankView();
        BankController controller = new BankController(view, customer, savingsAccount);

    }
}
