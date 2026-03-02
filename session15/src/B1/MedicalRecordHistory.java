package B1;
import java.util.Stack;
public class MedicalRecordHistory {
    private Stack<EditAction> history = new Stack<>();

    // Thêm chỉnh sửa
    public void addEdit(EditAction action) {
        history.push(action);
        System.out.println("Đã thêm chỉnh sửa: " + action);
    }

    // Undo chỉnh sửa gần nhất
    public EditAction undoEdit() {
        if (history.isEmpty()) {
            System.out.println("Không có chỉnh sửa để undo!");
            return null;
        }
        EditAction removed = history.pop();
        System.out.println("Đã undo: " + removed);
        return removed;
    }

    // Xem chỉnh sửa gần nhất
    public EditAction getLatestEdit() {
        if (history.isEmpty()) {
            return null;
        }
        return history.peek();
    }

    // Kiểm tra Stack rỗng
    public boolean isEmpty() {
        return history.isEmpty();
    }

    // Hiển thị toàn bộ lịch sử
    public void displayHistory() {
        if (history.isEmpty()) {
            System.out.println("Lịch sử chỉnh sửa rỗng!");
            return;
        }

        System.out.println("Danh sách chỉnh sửa (mới → cũ):");
        for (int i = history.size() - 1; i >= 0; i--) {
            System.out.println(history.get(i));
        }
    }
}
