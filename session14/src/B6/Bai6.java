package B6;

import java.util.*;

class Patient {
    String name;
    int age;
    String department;

    public Patient(String name, int age, String department) {
        this.name = name;
        this.age = age;
        this.department = department;
    }

    @Override
    public String toString() {
        return name + " (" + age + " tuổi)";
    }
}

public class Bai6 {
    public static void main(String[] args) {

        // Danh sách bệnh nhân ban đầu
        List<Patient> patients = Arrays.asList(
                new Patient("Lan", 30, "Tim mạch"),
                new Patient("Hùng", 45, "Nội tiết"),
                new Patient("Mai", 28, "Tim mạch")
        );

        // Map<Khoa, Danh sách bệnh nhân>
        Map<String, List<Patient>> departmentMap = new HashMap<>();

        // ===== Gom nhóm bệnh nhân =====
        for (Patient p : patients) {

            if (!departmentMap.containsKey(p.department)) {
                departmentMap.put(p.department, new ArrayList<>());
            }

            departmentMap.get(p.department).add(p);
        }

        // ===== In cấu trúc Map =====
        System.out.println("Danh sách theo khoa:");
        for (String dept : departmentMap.keySet()) {
            System.out.println(
                    "Khoa " + dept + " -> " + departmentMap.get(dept)
            );
        }

        // ===== Hiển thị bệnh nhân của 1 khoa =====
        String khoaCanXem = "Tim mạch";
        System.out.println("\nBệnh nhân khoa " + khoaCanXem + ":");
        System.out.println(departmentMap.get(khoaCanXem));

        // ===== Tìm khoa đông nhất =====
        String maxDept = "";
        int max = 0;

        for (Map.Entry<String, List<Patient>> entry : departmentMap.entrySet()) {
            if (entry.getValue().size() > max) {
                max = entry.getValue().size();
                maxDept = entry.getKey();
            }
        }

        System.out.println("\nKhoa " + maxDept +
                " đang đông nhất (" + max + " bệnh nhân)");
    }
}