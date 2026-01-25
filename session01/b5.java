package session01;

import java.util.Scanner;

public class b5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nhap ma sach (4 chu so): ");
        int ma = sc.nextInt();

        int hangNghin = ma / 1000;
        int hangTram = (ma / 100) % 10;
        int hangChuc = (ma / 10) % 10;
        int donVi = ma % 10;

        int tongBaSoDau = hangNghin + hangTram + hangChuc;
        int soKiemTra = tongBaSoDau % 10;

        boolean hopLe = (soKiemTra == donVi);

        System.out.println("Chu so kiem tra ky vong: " + soKiemTra);
        System.out.println("Ket qua kiem tra ma sach: " + (hopLe ? "HOP LE" : "KHONG HOP LE"));
    }
}
