
package onepiece;

public class LoanApp {
    
    private int creditScore;
    private double annualIncome;
    private double existingDebt;

    
    public LoanApp(int creditScore, double annualIncome, double existingDebt) {
        this.creditScore = creditScore;
        this.annualIncome = annualIncome;
        this.existingDebt = existingDebt;
    }

   
    public boolean isLoanApproved() {
        
        if (creditScore < 700) {
            return false;
        }

        
        if (annualIncome < 300000) {
            return false;
        }

        
        if (existingDebt > 0.5 * annualIncome) {
            return false;
        }

        return true;
    }

   
    public int getCreditScore() {
        return creditScore;
    }

    public void setCreditScore(int creditScore) {
        this.creditScore = creditScore;
    }

    public double getAnnualIncome() {
        return annualIncome;
    }

    public void setAnnualIncome(double annualIncome) {
        this.annualIncome = annualIncome;
    }

    public double getExistingDebt() {
        return existingDebt;
    }

    public void setExistingDebt(double existingDebt) {
        this.existingDebt = existingDebt;
    }

    
    public static void main(String[] args) {
       
        LoanApp loanApplication = new LoanApp(750, 350000, 160000);

        
        if (loanApplication.isLoanApproved()) {
            System.out.println("Loan approved");
        } else {
            System.out.println("Loan denied");
        }
    }
}