package week1_Data_Strucutres_and_Algorithms.SortingCustomerOrders;

class Order {

    int orderId;
    String customerName;
    double totalPrice;

    Order(int id, String name, double price) {
        orderId = id;
        customerName = name;
        totalPrice = price;
    }

    public String toString() {
        return orderId + " " + customerName + " " + totalPrice;
    }
}

public class SortingCustomerOrders {

    static void bubbleSort(Order arr[]) {

        for (int i = 0; i < arr.length - 1; i++) {

            for (int j = 0; j < arr.length - i - 1; j++) {

                if (arr[j].totalPrice > arr[j + 1].totalPrice) {

                    Order temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }

    static int partition(Order arr[], int low, int high) {

        double pivot = arr[high].totalPrice;
        int i = low - 1;

        for (int j = low; j < high; j++) {

            if (arr[j].totalPrice <= pivot) {

                i++;

                Order temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }

        Order temp = arr[i + 1];
        arr[i + 1] = arr[high];
        arr[high] = temp;

        return i + 1;
    }

    static void quickSort(Order arr[], int low, int high) {

        if (low < high) {

            int pi = partition(arr, low, high);

            quickSort(arr, low, pi - 1);
            quickSort(arr, pi + 1, high);
        }
    }

    static void display(Order arr[]) {

        for (Order o : arr)
            System.out.println(o);

        System.out.println();
    }

    public static void main(String[] args) {

        Order orders[] = {
                new Order(1, "Sai", 5000),
                new Order(2, "Tarun", 2000),
                new Order(3, "Rahul", 7000)
        };

        System.out.println("Bubble Sort:");

        bubbleSort(orders);
        display(orders);

        Order orders2[] = {
                new Order(1, "Sai", 5000),
                new Order(2, "Tarun", 2000),
                new Order(3, "Rahul", 7000)
        };

        System.out.println("Quick Sort:");

        quickSort(orders2, 0, orders2.length - 1);
        display(orders2);
    }
}
