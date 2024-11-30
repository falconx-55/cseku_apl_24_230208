package MODEL;

public class Loan {
    private double loanAmount;
    private double interestRate;
    private int loanTermYears;

    public Loan(double loanAmount, double interestRate, int loanTermYears) {
        this.loanAmount = loanAmount;
        this.interestRate = interestRate;
        this.loanTermYears = loanTermYears;
    }

    public double calculateLoanRepayment() {
        return loanAmount * (1 + interestRate * loanTermYears);
    }
}
