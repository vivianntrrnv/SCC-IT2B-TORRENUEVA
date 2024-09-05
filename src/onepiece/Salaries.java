
package onepiece;


public class Salaries {
  
    
     String ename;
     int  id, emp, nemp;
    double hrate, hworked, redu;
    
    public void inputSalaries( String name,int eid, int empl, int noemp,double rate,double worked,double red ){
     this.id= eid;
     this.emp=empl;
     this.nemp=noemp;
     this.ename=name;
     this.hrate=rate;
     this.hworked=worked;
     this.redu=red;
    }
    
     public class viewSalaries(){
    
            System.out.println("Number of Employees: " + this.emp);
        System.out.println("Employee ID: " + this.id);
        System.out.println("Employee Name: " + this.ename);
        System.out.println("Hours Rate: " + this.hrate);
        System.out.println("Hours Worked: " + this.hworked);
        System.out.println("Reduction: " + this.redu);
        System.out.println("Calculated Salary: " + calculateSalary());
        System.out.println();
}
     private double calculateSalary() {
        return (hrate * hworked) - redu;
    }
        public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Salaries salary = new Salaries();
        
        System.out.print("Enter employee name: ");
        String name = scanner.nextLine();
        
        System.out.print("Enter employee ID: ");
        int eid = scanner.nextInt();
        
        System.out.print("Enter number of employees: ");
        int empl = scanner.nextInt();
        
        System.out.print("Enter employee number: ");
        int noemp = scanner.nextInt();
        
        System.out.print("Enter hourly rate: ");
        double rate = scanner.nextDouble();
        
        System.out.print("Enter hours worked: ");
        double worked = scanner.nextDouble();
        
        System.out.print("Enter reduction: ");
        double red = scanner.nextDouble();
        
        // Set the employee details
        salary.inputSalaries(name, eid, empl, noemp, rate, worked, red);
        
        // Display employee details
        salary.viewSalaries();
        
        scanner.close();
    }
}
     
     
     
     
     
     
     
     
     
     
     
     
     
     
   

