package week1_Data_Strucutres_and_Algorithms.LibraryManagementSystem;

import java.util.*;

class Book {

    int bookId;
    String title;
    String author;

    Book(int id, String title, String author) {
        bookId = id;
        this.title = title;
        this.author = author;
    }
}

public class LibraryManagementSystem {

    static int linearSearch(Book arr[], String key) {

        for (int i = 0; i < arr.length; i++) {

            if (arr[i].title.equalsIgnoreCase(key))
                return i;
        }

        return -1;
    }

    static int binarySearch(Book arr[], String key) {

        int low = 0;
        int high = arr.length - 1;

        while (low <= high) {

            int mid = (low + high) / 2;

            int cmp = arr[mid].title.compareToIgnoreCase(key);

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

        Book books[] = {
                new Book(1, "C Programming", "Dennis"),
                new Book(2, "Data Structures", "Mark"),
                new Book(3, "Java", "James"),
                new Book(4, "Python", "Guido")
        };

        System.out.println("Linear Search Index: "
                + linearSearch(books, "Java"));

        Arrays.sort(books,
                (a, b) -> a.title.compareToIgnoreCase(b.title));

        System.out.println("Binary Search Index: "
                + binarySearch(books, "Java"));
    }
}