package B5;

import java.util.Stack;

public class EmergencyCase {
    private Patient patient;
    private Stack<TreatmentStep> steps = new Stack<>();

    public EmergencyCase(Patient patient) {
        this.patient = patient;
    }

    // Thêm bước xử lý
    public void addStep(TreatmentStep step) {
        steps.push(step);
        System.out.println("➕ Thêm bước: " + step);
    }

    // Undo bước xử lý gần nhất
    public TreatmentStep undoStep() {
        if (steps.isEmpty()) {
            System.out.println("❌ Không có bước nào để undo");
            return null;
        }
        TreatmentStep removed = steps.pop();
        System.out.println("↩️ Undo bước: " + removed);
        return removed;
    }

    // Hiển thị các bước xử lý
    public void displaySteps() {
        System.out.println("📋 Các bước xử lý của " + patient.getName());
        if (steps.isEmpty()) {
            System.out.println("Chưa có bước xử lý");
            return;
        }
        for (int i = steps.size() - 1; i >= 0; i--) {
            System.out.println(steps.get(i));
        }
    }

    public Patient getPatient() {
        return patient;
    }
}