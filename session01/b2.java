package session01;

import java.util.Scanner;

public class b2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap so ngay tre: ");
       int n = sc.nextInt();
        System.out.print("Nhap so lan muon sach: ");
       int  m = sc.nextInt();
       double total = n * m * 5000;

        if (n > 7 && m >= 3) {
            total = total * 1.2;
        }
        System.out.println("Tong tien phai tra la: " + total);

        boolean lock = false;
        if (total > 50000) {
            lock = true;
        }
        System.out.println("Yeu cau khoa the: " + lock);

    }

}
