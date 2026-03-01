package B4;

import java.util.*;

public class Bai4 {
    public static void main(String[] args) {

        // Danh sách ca bệnh trong ngày
        List<String> danhSachBenh = Arrays.asList(
                "Cúm A",
                "Sốt xuất huyết",
                "Cúm A",
                "Covid-19",
                "Cúm A",
                "Sốt xuất huyết"
        );

        // TreeMap tự động sắp xếp theo Alphabet
        TreeMap<String, Integer> thongKe = new TreeMap<>();

        // Thống kê số ca bệnh
        for (String benh : danhSachBenh) {
            if (thongKe.containsKey(benh)) {
                thongKe.put(benh, thongKe.get(benh) + 1);
            } else {
                thongKe.put(benh, 1);
            }
        }

        // In báo cáo
        System.out.println("Báo cáo ca bệnh:");
        for (Map.Entry<String, Integer> entry : thongKe.entrySet()) {
            System.out.println(entry.getKey() + ": "
                    + entry.getValue() + " ca");
        }
    }
}