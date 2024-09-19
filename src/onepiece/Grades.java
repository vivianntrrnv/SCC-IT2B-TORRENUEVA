
package onepiece;

import java.util.ArrayList;

public class Grades {
    
  
    static class Student {
        int studentId;
        String name;
        double prelim, midterm, prefinal, finalGrade, average;
        String remarks;

      
        public Student(int id, String name, double prelim, double midterm, double prefinal, double finalGrade) {
            this.studentId = id;
            this.name = name;
            this.prelim = prelim;
            this.midterm = midterm;
            this.prefinal = prefinal;
            this.finalGrade = finalGrade;
            this.average = (prelim + midterm + prefinal + finalGrade) / 4;
            this.remarks = (average >= 1.5) ? "Passed" : "Failed"; 
        }

       
        public void displayGrades() {
            System.out.printf("%-10d %-10s %-10.2f %-10.2f %-10.2f %-10.2f %-10.2f %-10s\n",
                    studentId, name, prelim, midterm, prefinal, finalGrade, average, remarks);
        }
    }

   
    private ArrayList<Student> students = new ArrayList<>();

   
    public void addGrades(int id, String name, double prelim, double midterm, double prefinal, double finalGrade) {
        Student student = new Student(id, name, prelim, midterm, prefinal, finalGrade);
        students.add(student);
    }

   
    public void viewGrades() {
        for (Student student : students) {
            student.displayGrades();
        }
    }
}

