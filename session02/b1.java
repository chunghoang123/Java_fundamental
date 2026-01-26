package session02;

import java.util.Scanner;

public class b1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("nhap so tuoi: ");
        int age = sc.nextInt();
        System.out.print("NHap so sach dang muon");
        int numberBook = sc.nextInt();
        System.out.print("ket qua: ");

        if (age >= 18 && numberBook < 3) {
            System.out.println("quy hiem");
        } else {
            System.out.println("KO du dk");
            if (age < 18)
                System.out.println("ko du 18 tuoi");
            if (numberBook > 3)
                System.out.println("da muon toi da 3 quyen");

        }

    }

}
