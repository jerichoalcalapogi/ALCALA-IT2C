
package alcala.it2c;

import java.util.Scanner;


public class IMPLEMENTOR {
     Scanner sc = new Scanner(System.in);
    EXECUTION[] products = new EXECUTION[100];

    public void getProducts() {
        
        System.out.print("Enter number of products: ");
        int numpro = sc.nextInt();

        for (int i = 0; i < numpro; i++) {
            System.out.println("\nEnter details of Product " + (i + 1));

            System.out.print("ID: ");
            int id = sc.nextInt();
            
            sc.nextLine();

            System.out.print("Name: ");
            String name = sc.nextLine();

            System.out.print("Category: ");
            String category = sc.nextLine();

            System.out.print("Stock Quantity: ");
            int stockq = sc.nextInt();

            System.out.print("Price per Unit: ");
            double price = sc.nextDouble();
             products[i] = new EXECUTION();
              products[i].addProduct(id, name, category, stockq, price);
        }

       
        System.out.printf("\n\n%-5s %-15s %-15s %-10s %-10s %-10s\n", "ID", "Name", "Category", "Stock Quantity", "Price per Unit", "Status");
        for (int i = 0; i < numpro; i++) {
            products[i].viewProduct();
        }
    }
}

