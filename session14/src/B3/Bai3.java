package B3;

import java.util.HashSet;
import java.util.Set;

public class Bai3 {
    public static void main(String[] args) {

        // Set A: Thành phần thuốc
        Set<String> thuoc = new HashSet<>();
        thuoc.add("Aspirin");
        thuoc.add("Caffeine");
        thuoc.add("Paracetamol");

        // Set B: Chất dị ứng
        Set<String> diUng = new HashSet<>();
        diUng.add("Penicillin");
        diUng.add("Aspirin");

        // ===== Tìm giao (chất gây dị ứng) =====
        Set<String> canhBao = new HashSet<>(thuoc);
        canhBao.retainAll(diUng);

        // ===== Tìm hiệu (thành phần an toàn) =====
        Set<String> anToan = new HashSet<>(thuoc);
        anToan.removeAll(diUng);

        // In kết quả
        System.out.println("Cảnh báo dị ứng: " + canhBao);
        System.out.println("Thành phần an toàn: " + anToan);
    }
}