package CONTROLLER;

import MODEL.Loan;
import VIEW.LoanView;

public class LoanController {
    private Loan loan;
    private LoanView loanView;

    // Constructor
    public LoanController(Loan loan, LoanView loanView) {
        this.loan = loan;
        this.loanView = loanView;
    }

    // Display loan details
    public void showLoanDetails() {
        loanView.displayLoanDetails(loan);
    }

    public void calculateAndShowRepayment() {
       
    }

    
    public void updateInterestRate(double newRate) {
       
    }

    
    public void updateLoanTerm(int newTermYears) {
    }
}
