package onepiece;

import java.util.Scanner;

public class Onepiece {

    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            boolean running = true;

            while (running) {
                System.out.println("\nChoose an option:");
                System.out.println("1. Receipt");
                System.out.println("2. Salary");
                System.out.println("3. Account Management");
                System.out.println("4. Exit");
                System.out.print("Enter your choice: ");
                int choice = input.nextInt();
                input.nextLine();

                switch (choice) {
                    case 1:
                        System.out.println("----- Receipt -----");
                        Receipts receiptManager = new Receipts();
                        
                        System.out.print("Enter customer name: ");
                        String customerName = input.nextLine();
                        System.out.print("Enter product name: ");
                        String productName = input.nextLine();
                        System.out.print("Enter quantity: ");
                        int quantity = input.nextInt();
                        System.out.print("Enter price: ");
                        int price = input.nextInt();
                        System.out.print("Enter cash received: ");
                        int cash = input.nextInt();
                        input.nextLine();

                        
                        receiptManager.addReceipt(customerName, productName, quantity, price, cash);
                        receiptManager.viewReceipts();
                        break;
                    
                    case 2:
                        System.out.println("----- Salary -----");
                        Salaries salary = new Salaries();
                        
                        System.out.print("Enter employee name: ");
                        String name = input.nextLine();
                        System.out.print("Enter employee ID: ");
                        int eid = input.nextInt();
                        System.out.print("Enter number of employees: ");
                        int emp = input.nextInt();
                        System.out.print("Enter hourly rate: ");
                        double rate = input.nextDouble();
                        System.out.print("Enter hours worked: ");
                        double worked = input.nextDouble();
                        System.out.print("Enter reduction: ");
                        double red = input.nextDouble();
                        input.nextLine(); 

                        
                        salary.inputSalaries(name, eid, emp, rate, worked, red);
                        salary.viewSalaries();
                        break;

                    case 3:
                        System.out.println("----- Account -----");
                        Accounts accountManager = new Accounts();
                       
                        accountManager.getAccount();
                        break;
                    
                    case 4:
                        running = false;
                        break;

                    default:
                        System.out.println("Invalid option. Please try again.");
                }
            }
        }
    }
}

    



