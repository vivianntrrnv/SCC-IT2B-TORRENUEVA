package onepiece;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AccountManager {
    private static final Scanner sc = new Scanner(System.in);
    private List<Accounts> accountsList = new ArrayList<>();

    
    public void addNewAccounts() {
        System.out.print("Enter number of users to add: ");
        int userCount = sc.nextInt();
        sc.nextLine(); 

        for (int i = 0; i < userCount; i++) {
            System.out.println("\nEnter details of User " + (i + 1));
            System.out.print("ID: ");
            int ID = sc.nextInt();
            sc.nextLine(); 
            System.out.print("First Name: ");
            String fName = sc.nextLine();
            System.out.print("Last Name: ");
            String lName = sc.nextLine();
            System.out.print("Email: ");
            String email = sc.nextLine();
            System.out.print("Username: ");
            String username = sc.nextLine();

            String password = getPasswordFromUser();

            
            if (duplicateVerify(ID, email, username)) {
                System.out.println("Duplicate account found. Try again.");
                i--; 
                continue;
            }

            Accounts account = new Accounts(ID, fName, lName, email, username, password);
            accountsList.add(account);
        }
    }

    
    private String getPasswordFromUser() {
        System.out.println("\nPassword criteria:"
                + "\n1. Must be above 8 characters"
                + "\n2. Must have at least 1 upper & 1 lower case letter"
                + "\n3. Must have at least 1 number"
                + "\n4. Must have at least 1 special character"
                + "\n5. Must not have common passwords like 'admin', 'password', or '1234'");

        System.out.print("\nPassword: ");
        String password = sc.nextLine();

        while (!passwordVerify(password)) {
            System.out.print("\nEnter a valid Password: ");
            password = sc.nextLine();
        }

        return password;
    }

    
    private boolean duplicateVerify(int id, String email, String username) {
        for (Accounts account : accountsList) {
            if (id == account.getAid()) {
                System.out.println("Duplicate ID found.");
                return true;
            } else if (email.equals(account.getEmail())) {
                System.out.println("Duplicate email found.");
                return true;
            } else if (username.equals(account.getUsername())) {
                System.out.println("Duplicate username found.");
                return true;
            }
        }
        return false;
    }

    
    public void displayAccounts() {
        System.out.printf("\n%-5s %-10s %-10s %-20s %-10s\n", "ID", "First Name", "Last Name", "Email", "Username");
        for (Accounts account : accountsList) {
            account.viewAccounts();
        }
    }

    
    private boolean passwordVerify(String password) {
        if (password.length() <= 8) {
            System.out.println("Password must be longer than 8 characters.");
            return false;
        }

        if (password.equals("admin") || password.equals("password") || password.equals("1234")) {
            System.out.println("Password cannot be common ('admin', 'password', '1234').");
            return false;
        }

        boolean hasUppercase = false;
        boolean hasLowercase = false;
        boolean hasDigit = false;
        boolean hasSpecialchar = false;

        for (char c : password.toCharArray()) {
            if (Character.isLowerCase(c)) hasLowercase = true;
            if (Character.isUpperCase(c)) hasUppercase = true;
            if (Character.isDigit(c)) hasDigit = true;
            if (!Character.isLetterOrDigit(c)) hasSpecialchar = true;
        }

        if (!(hasUppercase && hasLowercase)) {
            System.out.println("Password must have both upper and lower case letters.");
            return false;
        } else if (!hasDigit) {
            System.out.println("Password must have at least one digit.");
            return false;
        } else if (!hasSpecialchar) {
            System.out.println("Password must have at least one special character.");
            return false;
        }

        return true;
    }
}

