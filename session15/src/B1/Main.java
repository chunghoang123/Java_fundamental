package B1;

public class Main {
    public static void main(String[] args) {
        MedicalRecordHistory history = new MedicalRecordHistory();

        history.addEdit(new EditAction("Cập nhật chẩn đoán", "08:30"));
        history.addEdit(new EditAction("Thay đổi liều thuốc", "09:00"));
        history.addEdit(new EditAction("Bổ sung kết quả xét nghiệm", "09:30"));

        System.out.println("\nChỉnh sửa gần nhất:");
        System.out.println(history.getLatestEdit());

        System.out.println("\nUndo chỉnh sửa:");
        history.undoEdit();

        System.out.println("\nLịch sử hiện tại:");
        history.displayHistory();
    }
}