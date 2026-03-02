package B3;

import java.util.Stack;

public class MedicationProcessChecker {
    private Stack<String> stack = new Stack<>();

    // Kiểm tra quy trình phát thuốc
    public boolean checkProcess(String[] actions) {
        for (String action : actions) {

            if (action.equalsIgnoreCase("PUSH")) {
                stack.push("MEDICATION");
            }

            else if (action.equalsIgnoreCase("POP")) {
                if (stack.isEmpty()) {
                    System.out.println("Lỗi: POP khi chưa có phát thuốc (Stack rỗng)");
                    return false;
                }
                stack.pop();
            }

            else {
                System.out.println("Lỗi: Thao tác không hợp lệ → " + action);
                return false;
            }
        }

        if (!stack.isEmpty()) {
            System.out.println("Lỗi: Ca trực kết thúc nhưng còn phát thuốc chưa hoàn tất");
            return false;
        }

        System.out.println("Quy trình phát thuốc HỢP LỆ");
        return true;
    }

    // Reset Stack cho ca trực mới
    public void reset() {
        stack.clear();
    }
}