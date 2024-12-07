package CONTROLLER;

import MODEL.Account;
import VIEW.AccountView;

public class AccountController {
    private Account account;
    private AccountView accountView;

    // Constructor
    public AccountController(Account account, AccountView accountView) {
        this.account = account;
        this.accountView = accountView;
    }

    // Deposit money into the account
    public void deposit(double amount) {
      
    }

    // Display account details
    public void showAccountDetails() {
        accountView.displayAccountDetails(account);
    }

    
}
