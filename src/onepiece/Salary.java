
package onepiece;

import java.util.Scanner;

public class Salary {
private Salaries[] sr = new Salaries[100];
private int em = 0;

public void manageSalaries() {
Scanner sc = new Scanner(System.in);
String op;

do {
System.out.println("Welcome to Salary Management App");
System.out.println("-------------------------------------");
System.out.println("1. ADD");
System.out.println("2. VIEW");
System.out.println("3. UPDATE");
System.out.println("4. DELETE");
System.out.println("5. EXIT");
System.out.println("-------------------------------------");

System.out.print("Enter Action: ");
int option = sc.nextInt();

while (option > 5) {
System.out.print("Invalid Action. Try Again: ");
option = sc.nextInt();
}

switch (option) {
case 1:
addEmployeeSalary(sc);
break;
case 2:
viewEmployeeSalaries();
break;
case 3:
updateEmployeeSalary(sc);
break;
case 4:
deleteEmployeeSalary(sc);
break;
}

System.out.println("Do you want to continue? (Y/N): ");
op = sc.next();
} while (op.equalsIgnoreCase("Y"));
}

private void addEmployeeSalary(Scanner sc) {
System.out.println("Details of EMP " + (em + 1));
System.out.print("ID: ");
int id = sc.nextInt();
System.out.print("Name: ");
String name = sc.next();
System.out.print("Rate(Hour): ");
double rate = sc.nextDouble();
System.out.print("Hours worked: ");
int hour = sc.nextInt();
System.out.print("Total deduction: ");
double deduction = sc.nextDouble();

sr[em] = new Salaries();
sr[em].addSalary(id, name, rate, hour, deduction);
em++;

System.out.println("Employee salary added!\n");
}

private void viewEmployeeSalaries() {
System.out.println("\nEMP ID Name Rate Hours Gross Deductions Netpay");
for (int i = 0; i < em; i++) {
sr[i].getSalary();
}
System.out.println("-------------------------------------");
}

private void updateEmployeeSalary(Scanner sc) {
System.out.print("Enter Employee ID to update: ");
int id = sc.nextInt();
for (int i = 0; i < em; i++) {
if (sr[i].eid == id) {
System.out.print("New Rate(Hour): ");
double newRate = sc.nextDouble();
System.out.print("New Hours worked: ");
int newHours = sc.nextInt();
System.out.print("New Total deduction: ");
double newDeduction = sc.nextDouble();

sr[i].addSalary(id, sr[i].ename, newRate, newHours, newDeduction);
System.out.println("Employee salary updated!\n");
return;
}
}
System.out.println("Employee ID not found.\n");
}

private void deleteEmployeeSalary(Scanner sc) {
System.out.print("Enter Employee ID to delete: ");
int id = sc.nextInt();
for (int i = 0; i < em; i++) {
if (sr[i].eid == id) {
for (int j = i; j < em - 1; j++) {
sr[j] = sr[j + 1];
}
sr[em - 1] = null; // Clear last position
em--;
System.out.println("Employee salary deleted!\n");
return;
}
}
System.out.println("Employee ID not found.\n");
}
}