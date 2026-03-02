package B5;

import java.util.LinkedList;
import java.util.Queue;

public class EmergencyCaseQueue {
    private Queue<EmergencyCase> cases = new LinkedList<>();

    // Thêm ca cấp cứu
    public void addCase(EmergencyCase c) {
        cases.add(c);
        System.out.println("➕ Tiếp nhận bệnh nhân: " + c.getPatient());
    }

    // Lấy ca tiếp theo
    public EmergencyCase getNextCase() {
        if (cases.isEmpty()) {
            System.out.println("❌ Không còn ca cấp cứu nào");
            return null;
        }
        EmergencyCase c = cases.poll();
        System.out.println("➡️ Đang xử lý ca: " + c.getPatient());
        return c;
    }
}