package session04;

import java.time.LocalDateTime;

public class b3 {
    public static void main(String[] args) {

        String[] transactions = new String[10000];

        for (int i = 0; i < transactions.length; i++) {
            transactions[i] = "Ma sach: BOOK" + (i + 1) + ", Ngay muon: 2026-01-28";
        }

        long start = System.nanoTime();

        String report = "BAO CAO GIAO DICH\n";
        report += "Thoi gian tao: " + LocalDateTime.now() + "\n";

        for (int i = 0; i < transactions.length; i++) {
            report += transactions[i] + "\n";
        }

        long end = System.nanoTime();

        System.out.println("Thoi gian thuc thi (dung +): " + (end - start) + " ns");
    }
}
