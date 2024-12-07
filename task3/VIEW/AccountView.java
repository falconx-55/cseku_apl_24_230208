package VIEW;

import MODEL.Account;

public class AccountView {
    public void displayAccountDetails(Account account) {
        System.out.println("Account Number: " + account.getAccountNumber());
        System.out.println("Balance: " + account.getBalance());
    }

    public void displayMessage(String message) {
        System.out.println(message);
    }
}
