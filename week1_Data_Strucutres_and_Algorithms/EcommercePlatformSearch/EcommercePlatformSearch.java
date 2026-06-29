package week1_Data_Strucutres_and_Algorithms.EcommercePlatformSearch;
import java.util.*;

class Product {

    int productId;
    String productName;
    String category;

    Product(int id, String name, String category) {
        productId = id;
        productName = name;
        this.category = category;
    }
}

public class EcommercePlatformSearch {

    static int linearSearch(Product arr[], String key) {

        for (int i = 0; i < arr.length; i++) {
            if (arr[i].productName.equalsIgnoreCase(key))
                return i;
        }

        return -1;
    }

    static int binarySearch(Product arr[], String key) {

        int low = 0;
        int high = arr.length - 1;

        while (low <= high) {

            int mid = (low + high) / 2;

            int cmp = arr[mid].productName.compareToIgnoreCase(key);

            if (cmp == 0)
                return mid;
            else if (cmp < 0)
                low = mid + 1;
            else
                high = mid - 1;
        }

        return -1;
    }

    public static void main(String[] args) {

        Product products[] = {
                new Product(1, "Keyboard", "Electronics"),
                new Product(2, "Laptop", "Electronics"),
                new Product(3, "Mouse", "Electronics"),
                new Product(4, "Phone", "Electronics")
        };

        System.out.println("Linear Search Index : "
                + linearSearch(products, "Mouse"));

        Arrays.sort(products,
                (a, b) -> a.productName.compareToIgnoreCase(b.productName));

        System.out.println("Binary Search Index : "
                + binarySearch(products, "Mouse"));
    }
}