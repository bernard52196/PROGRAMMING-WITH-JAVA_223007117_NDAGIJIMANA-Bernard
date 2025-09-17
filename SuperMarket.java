package case1;
import java.util.Scanner;


public class SuperMarket {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of different items bought: ");
        int n = sc.nextInt();
        sc.nextLine(); 

       
        String[] itemNames = new String[n];
        double[] pricePerUnit = new double[n];
        int[] quantities = new int[n];
        double[] subtotals = new double[n];

        double totalBill = 0;

      
        for (int i = 0; i < n; i++) {
            System.out.println("\nEnter details for item " + (i + 1) + ":");
            
            System.out.print("Item name: ");
            itemNames[i] = sc.nextLine();

            System.out.print("Price per unit (RWF): ");
            pricePerUnit[i] = sc.nextDouble();

            System.out.print("Quantity purchased (kg): ");
            quantities[i] = sc.nextInt();
            sc.nextLine(); 

            
            subtotals[i] = pricePerUnit[i] * quantities[i];
            totalBill += subtotals[i];
        }

       
        double discount = 0;
        if (totalBill > 50000) {
            discount = totalBill * 0.05; 
        }
        double finalAmount = totalBill - discount;

        
        System.out.println("\n========== SUPERMARKET RECEIPT ==========");
        System.out.println("Item Name\tQuantity\tPrice/Unit\tSubtotal");
        
        for (int i = 0; i < n; i++) {
            System.out.println(itemNames[i] + "\t\t" 
                    + quantities[i] + " kg\t\t" 
                    + (int)pricePerUnit[i] + " RWF\t\t" 
                    + (int)subtotals[i] + " RWF");
        }
        
        System.out.println("Grand Total (Before Discount): " + (int)totalBill + " RWF");
        System.out.println("Discount: " + (int)discount + " RWF");
        System.out.println("Final Amount Payable: " + (int)finalAmount + " RWF");
        

        sc.close();
    }
}
