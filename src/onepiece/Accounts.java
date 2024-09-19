
package onepiece;

public class Accounts {
    private int aid;
    private String firstName;
    private String lastName;
    private String email;
    private String username;
    private String password;

   
    public Accounts(int aid, String firstName, String lastName, String email, String username, String password) {
        this.aid = aid;
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.username = username;
        this.password = password;
    }

    
    public int getAid() {
        return aid;
    }

    public String getEmail() {
        return email;
    }

    public String getUsername() {
        return username;
    }

    
    public void viewAccounts() {
        System.out.printf("%-5d %-10s %-10s %-20s %-10s\n", aid, firstName, lastName, email, username);
    }
}
