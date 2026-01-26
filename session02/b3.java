package session02;

import java.util.Scanner;

public class b3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nhap so luong sach tra muon: ");
        int n = sc.nextInt();
        int day = 0;
        int total = 0;
        int totalDay = 0;
        for (int i = 1; i <= n; i++) {
            System.out.printf("So ngay tre cuon thu %d: ", i);
            day = sc.nextInt();
            totalDay = totalDay + day;
        }

        total = totalDay * 5000;
        System.out.printf("===> Tong so tien phat: %d VND ", total);

    }
}
