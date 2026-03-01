package B2;

import java.util.HashMap;
import java.util.Scanner;

public class Bai2 {
    public static void main(String[] args) {

        HashMap<String, String> medicines = new HashMap<>();

        medicines.put("T01", "Paracetamol");
        medicines.put("T02", "Ibuprofen");
        medicines.put("T03", "Aspirin");
        medicines.put("T04", "Amoxicillin");
        medicines.put("T05", "Vitamin C");

        Scanner sc = new Scanner(System.in);

        System.out.print("Nhập mã thuốc: ");
        String code = sc.nextLine();

        if (medicines.containsKey(code)) {
            System.out.println("Tên thuốc: " + medicines.get(code));
        } else {
            System.out.println("Thuốc không tồn tại.");
        }
    }
}