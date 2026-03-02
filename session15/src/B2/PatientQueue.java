package B2;

import java.util.LinkedList;
import java.util.Queue;

public class PatientQueue {
    private Queue<Patient> queue = new LinkedList<>();

    // Thêm bệnh nhân vào hàng đợi
    public void addPatient(Patient p) {
        queue.add(p);
        System.out.println("Đã thêm bệnh nhân: " + p);
    }

    // Gọi bệnh nhân tiếp theo
    public Patient callNextPatient() {
        if (queue.isEmpty()) {
            System.out.println("Không còn bệnh nhân chờ!");
            return null;
        }
        Patient p = queue.poll();
        System.out.println("Đang khám bệnh nhân: " + p);
        return p;
    }

    // Xem bệnh nhân tiếp theo
    public Patient peekNextPatient() {
        if (queue.isEmpty()) {
            return null;
        }
        return queue.peek();
    }

    // Kiểm tra hàng đợi rỗng
    public boolean isEmpty() {
        return queue.isEmpty();
    }

    // Hiển thị danh sách bệnh nhân đang chờ
    public void displayQueue() {
        if (queue.isEmpty()) {
            System.out.println("Danh sách chờ trống!");
            return;
        }

        System.out.println("Danh sách bệnh nhân đang chờ:");
        for (Patient p : queue) {
            System.out.println(p);
        }
    }
}
