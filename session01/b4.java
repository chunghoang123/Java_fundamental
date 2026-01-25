package session01;

import java.util.Scanner;

public class b4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Nhập dữ liệu
        System.out.print("Nhập giá sách (USD): ");
        double priceUSD = sc.nextDouble();

        System.out.print("Nhập tỷ giá (VND): ");
        float exchangeRate = sc.nextFloat();

        // Tính tổng tiền VNĐ
        double totalVND = priceUSD * exchangeRate;

        // Ép kiểu từ double sang long (lấy số tiền chẵn)
        long totalRounded = (long) totalVND;

        // In kết quả
        System.out.println("Tổng tiền VNĐ (double): " + totalVND);
        System.out.println("Tổng tiền VNĐ sau khi ép kiểu (long): " + totalRounded);
    }
}
