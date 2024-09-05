
package onepiece;

import java.util.Scanner;

public class Receipt {
    
    public void getReceipt(){
   
    Scanner input = new Scanner(System.in);
     String cname, pname;
     int  quan, pr, cash;
     
        System.out.print("Customer Name: ");
        cname= input.nextLine();
        System.out.print("Product Name: ");
        pname= input.nextLine();
        System.out.print("Quantity: ");
        quan= input.nextInt();
        System.out.print("Price: ");
        pr= input.nextInt();
        System.out.print("Cash: ");
        cash= input.nextInt();
        System.out.println("-----------------------------------");
        System.out.println("RECEIPT");
        System.out.println("-----------------------------------");
        System.out.println("Name: "+cname);
        System.out.println("Item: " +pname);
        System.out.println("Quantity: " +quan);
        System.out.println("-----------------------------------");
        System.out.println("Total due: " +(quan*pr));
        System.out.println("Cash: "+(cash));
        System.out.println("Change: " +(cash-(quan*pr)));
        
        
        
        
        
        
        
        
    }
}
