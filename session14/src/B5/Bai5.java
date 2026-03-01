package B5;

import java.util.Comparator;
import java.util.TreeSet;

class Patient {
    String name;
    int severity;
    int arrivalTime; // dùng phút cho dễ so sánh

    public Patient(String name, int severity, int arrivalTime) {
        this.name = name;
        this.severity = severity;
        this.arrivalTime = arrivalTime;
    }

    @Override
    public String toString() {
        return name + " (Mức " + severity +
                ", đến lúc " + arrivalTime + ")";
    }
}

public class Bai5 {
    public static void main(String[] args) {

        // Comparator ưu tiên cấp cứu
        Comparator<Patient> priorityComparator = (p1, p2) -> {

            // So sánh mức độ nghiêm trọng trước
            if (p1.severity != p2.severity) {
                return p1.severity - p2.severity;
            }

            // Nếu cùng severity → so sánh thời gian đến
            return p1.arrivalTime - p2.arrivalTime;
        };

        TreeSet<Patient> queue =
                new TreeSet<>(priorityComparator);

        // Thêm bệnh nhân
        queue.add(new Patient("Bệnh nhân A", 3, 800));
        queue.add(new Patient("Bệnh nhân B", 1, 815));
        queue.add(new Patient("Bệnh nhân C", 1, 805));

        // In thứ tự xử lý
        System.out.println("Thứ tự xử lý cấp cứu:");
        for (Patient p : queue) {
            System.out.println(p);
        }
    }
}