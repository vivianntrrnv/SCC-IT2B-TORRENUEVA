
package onepiece;

import java.util.Scanner;
import java.util.ArrayList;

public class Grade {
    
    public class Account {
        Scanner sc = new Scanner(System.in);
        ArrayList<Accounts> acs = new ArrayList<>();
        
        public void getAccount() {
            System.out.print("Add number of users: ");
            int user = sc.nextInt();
            
            for (int i = 0; i < user; i++) {
                System.out.println("\nEnter details of User " + (i + 1));
                System.out.print("ID: ");
                int ID = sc.nextInt();
                sc.nextLine();  
                System.out.print("First name: ");
                String fName = sc.nextLine();
                System.out.print("Last name: ");
                String lName = sc.nextLine();
                System.out.print("Email: ");
                String Eadd = sc.next();
                System.out.print("Username: ");
                String usern = sc.next();
                
                System.out.println("\nPassword criteria:"
                        + "\n1. Must be above 8 characters"
                        + "\n2. Must have at least 1 upper & 1 lower case letters"
                        + "\n3. Must have at least 1 number"
                        + "\n4. Must have at least 1 special character"
                        + "\n5. Must not have common passwords like 'admin', 'password', and '1234'");
                
                System.out.print("\nPassword: ");
                String passw = sc.next();
                
                while (!passwordVerify(passw)) {
                    System.out.print("\nPassword: ");
                    passw = sc.next();
                }
                
                if (duplicateVerify(ID, Eadd, usern)) {
                    System.out.println("Duplicate found, please re-enter details.");
                    i--; 
                    continue;
                }
                
                Accounts account = new Accounts(); 
                account.addAccounts(ID, fName, lName, Eadd, usern, passw);
                acs.add(account);  
            }
            
            System.out.printf("\n\n%-5s %-10s %-10s %-20s %-10s %-10s\n", "ID", "First Name", "Last Name", "Email", "Username", "Password");
            
            acs.forEach((account) -> {
                account.viewAccounts();  
            });
        }
        
        private boolean duplicateVerify(int id, String email, String user) {
            for (Accounts account : acs) {
                if (id == account.aid) {
                    System.out.println("\nInput invalid, must not have a duplicated ID.");
                    return true;
                } else if (email.equals(account.email)) {
                    System.out.println("\nInput invalid, must not have a duplicated Email.");
                    return true;
                } else if (user.equals(account.user)) {
                    System.out.println("\nInput invalid, must not have a duplicated Username.");
                    return true;
                }
            }
            return false;
        }
        
        private boolean passwordVerify(String password) {
            if (password.length() <= 8) {
                System.out.println("\nPassword is invalid, password must be above 8 characters");
                return false;
            }
            
            if (password.equals("admin") || password.equals("password") || password.equals("1234")) {
                System.out.println("\nPassword is invalid, must not use common passwords like 'admin', 'password', or '1234'");
                return false;
            }
            
            boolean hasUppercase = false;
            boolean hasLowercase = false;
            boolean hasDigit = false;
            boolean hasSpecialChar = false;
            
            for (char c : password.toCharArray()) {
                if (Character.isLowerCase(c)) hasLowercase = true;
                if (Character.isUpperCase(c)) hasUppercase = true;
                if (Character.isDigit(c)) hasDigit = true;
                if (!Character.isLetterOrDigit(c)) hasSpecialChar = true;
            }
            
            if (!(hasUppercase && hasLowercase)) {
                System.out.println("\nPassword is invalid, must have both upper and lower case letters");
                return false;
            } else if (!hasDigit) {
                System.out.println("\nPassword is invalid, must have at least 1 number");
                return false;
            } else if (!hasSpecialChar) {
                System.out.println("\nPassword is invalid, must have at least 1 special character");
                return false;
            }
            
            return true;
        }
    }

    
    public class Accounts {
        int aid;
        String fName, lName, email, user, pass;

        public void addAccounts(int ID, String fName, String lName, String Eadd, String usern, String passw) {
            this.aid = ID;
            this.fName = fName;
            this.lName = lName;
            this.email = Eadd;
            this.user = usern;
            this.pass = passw;
        }

        public void viewAccounts() {
            System.out.printf("%-5d %-10s %-10s %-20s %-10s %-10s\n", aid, fName, lName, email, user, pass);
        }
    }
}
