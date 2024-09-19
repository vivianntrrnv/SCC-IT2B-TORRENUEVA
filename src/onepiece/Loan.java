
package onepiece;

import java.util.Scanner;

public class Loan {
    
     public void getisLoanApp(String[] args) {
       
        Scanner sc = new Scanner(System.in);

        LoanApp[] lp = new LoanApp[100000];
       
        System.out.print("Enter credit score: ");
        int creditScore = sc.nextInt();

                System.out.print("Enter annual income: ");
        double annualIncome = sc.nextDouble();

       
        System.out.print("Enter existing debt: ");
        double existingDebt = sc.nextDouble();

      
        LoanApp loanApplication = new LoanApp(creditScore, annualIncome, existingDebt);

        
        if (loanApplication.isLoanApproved()) {
            System.out.println("Loan approved");
        } else {
            System.out.println("Loan denied");
        }

        
        sc.close();
    }
}
