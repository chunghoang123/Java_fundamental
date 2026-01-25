package session01;

import java.util.Scanner;

public class b4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nhap gia sach (USD): ");
        double priceUSD = sc.nextDouble();

        System.out.print("Nhap ty gia (VND): ");
        float exchangeRate = sc.nextFloat();

        double totalVND = priceUSD * exchangeRate;

        long totalRounded = (long) totalVND;

        System.out.println("Tong tien VND (double): " + totalVND);
        System.out.println("Tong tien VND sau khi ep kieu (long): " + totalRounded);
    }
}
