package session02;

import java.util.Scanner;

public class b5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("--- HE THONG DANH GIA DOC GIA ---");
        System.out.println("(Nhap so ngay tre. Nhap 999 de ket thuc)");

        int point = 100;
        int dayLate;

        while (true) {
            System.out.println("So ngay tre cua lan nay: ");
            dayLate = sc.nextInt();

            if (dayLate == 999) {
                break;
            }
            if (dayLate > 0) {
                int miss = dayLate * 2;
                point = point - miss;
                System.out.println("-> Tra tre " + dayLate + " ngay: -" + miss + " diem");
            } else {
                point = point + 5;
                System.out.println("-> Tra dung han: +5 diem");
            }
        }

        System.out.println("Tong diem uy tin: " + point);

        if (point > 120) {
            System.out.println("Xep loai: Doc gia than thiet");
        } else if (point >= 80) {
            System.out.println("Xep loai: Doc gia tieu chuan");
        } else {
            System.out.println("Xep loai: Doc gia can luu y");
        }
    }
}
