package B5;

public class Main {
    public static void main(String[] args) {
        EmergencyCaseQueue queue = new EmergencyCaseQueue();

        EmergencyCase case1 = new EmergencyCase(
                new Patient("BN001", "Nguyễn Văn A"));
        EmergencyCase case2 = new EmergencyCase(
                new Patient("BN002", "Trần Thị B"));

        queue.addCase(case1);
        queue.addCase(case2);

        // Xử lý ca đầu tiên
        EmergencyCase current = queue.getNextCase();
        current.addStep(new TreatmentStep("Tiếp nhận", "08:00"));
        current.addStep(new TreatmentStep("Chẩn đoán", "08:10"));
        current.addStep(new TreatmentStep("Điều trị", "08:30"));

        current.displaySteps();

        // Undo bước sai
        current.undoStep();
        current.displaySteps();
    }
}