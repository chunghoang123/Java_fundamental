package B4;

public class Main {
    public static void main(String[] args) {
        EmergencyQueue queue = new EmergencyQueue();

        queue.addPatient(new EmergencyPatient("BN001", "Nguyễn Văn A", 2));
        queue.addPatient(new EmergencyPatient("BN002", "Trần Thị B", 1));
        queue.addPatient(new EmergencyPatient("BN003", "Lê Văn C", 2));
        queue.addPatient(new EmergencyPatient("BN004", "Phạm Văn D", 1));

        queue.displayQueue();

        System.out.println("\n=== GỌI KHÁM ===");
        queue.callNextPatient();
        queue.callNextPatient();

        queue.displayQueue();
    }
}
