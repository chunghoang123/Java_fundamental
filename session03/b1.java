package session03;

import java.util.Scanner;

public class b1 {

    public static int[] addBook(int n) {
        Scanner sc = new Scanner(System.in);
        int[] books = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.printf("Nhap ma sach thu %d: ", i + 1);
            books[i] = sc.nextInt();
        }

        return books;
    }

    public static void printBook(int[] books) {
        for (int i = 0; i < books.length; i++) {
            System.out.printf("%d", books[i]);
            if (i < books.length - 1) {
                System.out.print(", ");
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nhap so luong sach: ");
        int n = sc.nextInt();

        int[] libraries = addBook(n);
        System.out.println("Ket qua");
        System.out.print("Danh sach ma sach: ");
        printBook(libraries);
    }

}
