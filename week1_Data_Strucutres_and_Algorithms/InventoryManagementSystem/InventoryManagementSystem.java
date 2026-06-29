package week1_Data_Strucutres_and_Algorithms.InventoryManagementSystem;

import java.util.*;

class Product {
    int productId;
    String productName;
    int quantity;
    double price;

    Product(int productId, String productName, int quantity, double price) {
        this.productId = productId;
        this.productName = productName;
        this.quantity = quantity;
        this.price = price;
    }

    public String toString() {
        return productId + " " + productName +
                " Qty:" + quantity +
                " Price:" + price;
    }
}

public class InventoryManagementSystem {

    static HashMap<Integer, Product> inventory = new HashMap<>();

    static void addProduct(Product p) {
        inventory.put(p.productId, p);
    }

    static void updateProduct(int id, int qty, double price) {
        if (inventory.containsKey(id)) {
            Product p = inventory.get(id);
            p.quantity = qty;
            p.price = price;
        }
    }

    static void deleteProduct(int id) {
        inventory.remove(id);
    }

    static void displayProducts() {
        for (Product p : inventory.values())
            System.out.println(p);
    }

    public static void main(String[] args) {

        addProduct(new Product(101, "Laptop", 10, 65000));
        addProduct(new Product(102, "Mouse", 50, 600));

        System.out.println("Inventory:");
        displayProducts();

        updateProduct(101, 15, 68000);

        System.out.println("\nAfter Update:");
        displayProducts();

        deleteProduct(102);

        System.out.println("\nAfter Delete:");
        displayProducts();
    }
}