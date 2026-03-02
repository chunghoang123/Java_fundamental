package B4;

import java.util.LinkedList;
import java.util.Queue;

public class EmergencyQueue {

    private Queue<EmergencyPatient> emergencyQueue = new LinkedList<>();
    private Queue<EmergencyPatient> normalQueue = new LinkedList<>();

    // Thêm bệnh nhân
    public void addPatient(EmergencyPatient p) {
        if (p.getPriority() == 1) {
            emergencyQueue.add(p);
            System.out.println(" Thêm bệnh nhân CẤP CỨU: " + p);
        } else {
            normalQueue.add(p);
            System.out.println(" Thêm bệnh nhân THƯỜNG: " + p);
        }
    }

    // Gọi bệnh nhân tiếp theo
    public EmergencyPatient callNextPatient() {
        EmergencyPatient p;

        if (!emergencyQueue.isEmpty()) {
            p = emergencyQueue.poll();
        } else if (!normalQueue.isEmpty()) {
            p = normalQueue.poll();
        } else {
            System.out.println(" Không còn bệnh nhân chờ!");
            return null;
        }

        System.out.println(" Đang khám: " + p);
        return p;
    }

    // Hiển thị danh sách chờ
    public void displayQueue() {
        System.out.println("\n DANH SÁCH CHỜ KHÁM");

        if (emergencyQueue.isEmpty() && normalQueue.isEmpty()) {
            System.out.println("Danh sách trống!");
            return;
        }

        System.out.println(" Cấp cứu:");
        for (EmergencyPatient p : emergencyQueue) {
            System.out.println(p);
        }

        System.out.println(" Thường:");
        for (EmergencyPatient p : normalQueue) {
            System.out.println(p);
        }
    }
}