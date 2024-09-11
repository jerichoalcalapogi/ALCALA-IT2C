
package alcala.it2c;

import java.util.*;
public class EXECUTION {
   
    int id;
    String name;
    String cat;
    int stockq;
    double price;
    String status;

    public void addProduct(int id, String name, String cat, int stockq, double price) {
        this.id = id;
        this.name = name;
        this.cat = cat;
        this.stockq = stockq;
        this.price = price;
        validateProduct();
    }

    private void validateProduct() {
        if (stockq >= 0 && price > 0) {
            status = "Valid";
        } else {
            status = "Invalid";
        }
    }

    public void viewProduct() {
        System.out.printf("%-5d %-15s %-15s %-10d %-10.2f %-10s\n", id, name, cat, stockq, price, status);
    }
}
