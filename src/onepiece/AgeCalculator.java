
package onepiece;

import java.util.Scanner;

public class AgeCalculator {
  
   public void getAge(){
       Scanner input = new Scanner(System.in);
     String fname;
     int byear;
     
        System.out.print("Enter your name: ");
        fname= input.nextLine();
        System.out.print("Enter birthyear: ");
        byear= input.nextInt();
        
        System.out.println("Hello "+fname+"\nYour age is "+(2024-byear));
        
       
   } 
    
    
    
}
