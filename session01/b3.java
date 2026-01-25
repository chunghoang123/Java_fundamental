package session01;

import java.util.Scanner;

public class b3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String book1 = "Java Basic";
        String book2 = "Python Intro";
        System.out.printf(" truoc khi doi: Book 1: , Book 2:" + book1, book2);

        String temp = book1;
        book1 = book2;
        book2 = temp;

        System.out.println();
        System.out.printf(" sau khi doi: Book 1: , Book 2:" + book1, book2);
    }
}
