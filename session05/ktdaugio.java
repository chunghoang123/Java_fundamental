package session05;

import java.util.Scanner;
import java.util.regex.Pattern;

public class ktdaugio {

    private static final int MAX_SIZE = 100;
    private String[] mssvArray = new String[MAX_SIZE];
    private int count = 0;
    private Scanner scanner = new Scanner(System.in);
    private static final String MSSV_REGEX = "^B\\d{7}$";

    public static void main(String[] args) {
        ktdaugio manager = new ktdaugio();
        manager.run();
    }

    public void run() {
        int choice;
        do {
            displayMenu();
            choice = scanner.nextInt();
            scanner.nextLine(); // clear buffer
            switch (choice) {
                case 1 -> displayMSSV();
                case 2 -> addMSSV();
                case 3 -> updateMSSV();
                case 4 -> deleteMSSV();
                case 5 -> searchMSSV();
                case 6 -> System.out.println("Thoát chương trình.");
                default -> System.out.println("Lựa chọn không hợp lệ.");
            }
        } while (choice != 6);
    }

    private void displayMenu() {
        System.out.println("\n----- MENU -----");
        System.out.println("1. Hiển thị danh sách MSSV");
        System.out.println("2. Thêm MSSV mới");
        System.out.println("3. Cập nhật MSSV");
        System.out.println("4. Xóa MSSV");
        System.out.println("5. Tìm kiếm MSSV");
        System.out.println("6. Thoát");
        System.out.print("Chọn: ");
    }

    private void displayMSSV() {
        if (count == 0) {
            System.out.println("Danh sách rỗng.");
            return;
        }
        for (int i = 0; i < count; i++) {
            System.out.println((i + 1) + ". " + mssvArray[i]);
        }
    }

    private void addMSSV() {
        if (count >= MAX_SIZE) {
            System.out.println("Danh sách đầy.");
            return;
        }
        System.out.print("Nhập MSSV: ");
        String mssv = scanner.nextLine();

        while (!isValidMSSV(mssv) || exists(mssv)) {
            System.out.print("MSSV không hợp lệ hoặc bị trùng. Nhập lại: ");
            mssv = scanner.nextLine();
        }

        mssvArray[count++] = mssv;
        System.out.println("Thêm thành công.");
    }

    private void updateMSSV() {
        if (count == 0) {
            System.out.println("Danh sách rỗng.");
            return;
        }

        System.out.print("Nhập vị trí (1 - " + count + "): ");
        int index = scanner.nextInt() - 1;
        scanner.nextLine(); // clear buffer

        if (index < 0 || index >= count) {
            System.out.println("Vị trí không hợp lệ.");
            return;
        }

        System.out.print("Nhập MSSV mới: ");
        String mssv = scanner.nextLine();

        while (!isValidMSSV(mssv) || exists(mssv)) {
            System.out.print("MSSV không hợp lệ hoặc bị trùng. Nhập lại: ");
            mssv = scanner.nextLine();
        }

        mssvArray[index] = mssv;
        System.out.println("Cập nhật thành công.");
    }

    private void deleteMSSV() {
        System.out.print("Nhập MSSV cần xóa: ");
        String mssv = scanner.nextLine();

        for (int i = 0; i < count; i++) {
            if (mssvArray[i].equalsIgnoreCase(mssv)) {
                for (int j = i; j < count - 1; j++) {
                    mssvArray[j] = mssvArray[j + 1];
                }
                mssvArray[--count] = null;
                System.out.println("Xóa thành công.");
                return;
            }
        }
        System.out.println("Không tìm thấy MSSV.");
    }

    private void searchMSSV() {
        System.out.print("Nhập chuỗi cần tìm: ");
        String key = scanner.nextLine();
        boolean found = false;

        for (int i = 0; i < count; i++) {
            if (mssvArray[i].toLowerCase().contains(key.toLowerCase())) {
                System.out.println(mssvArray[i]);
                found = true;
            }
        }

        if (!found) {
            System.out.println("Không có kết quả.");
        }
    }

    private boolean isValidMSSV(String mssv) {
        return Pattern.matches(MSSV_REGEX, mssv);
    }

    private boolean exists(String mssv) {
        for (int i = 0; i < count; i++) {
            if (mssvArray[i].equalsIgnoreCase(mssv)) {
                return true;
            }
        }
        return false;
    }
}
