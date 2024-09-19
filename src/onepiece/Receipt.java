
package onepiece;

import java.util.Scanner;

public class Receipt {
    private String customerName;
    private String productName;
    private int quantity;
    private int price;
    private int cash;

    public Receipt(String customerName, String productName, int quantity, int price, int cash) {
        this.customerName = customerName;
        this.productName = productName;
        this.quantity = quantity;
        this.price = price;
        this.cash = cash;
    }

    public void display() {
        int totalCost = quantity * price;
        System.out.println("Customer: " + customerName);
        System.out.println("Product: " + productName);
        System.out.println("Quantity: " + quantity);
        System.out.println("Price: " + price);
        System.out.println("Total: " + totalCost);
        System.out.println("Cash: " + cash);
        System.out.println("Change: " + (cash - totalCost));
        System.out.println("---------------------");
    }
}
