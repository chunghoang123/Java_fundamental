package session03;

import java.util.Scanner;
public class b2 {
    // Phương thức tìm kiếm sách
    public static int searchBooks(String[] arr, String search) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].equalsIgnoreCase(search)) {
                return i; // trả về vị trí nếu tìm thấy
            }
        }
        return -1; // không tìm thấy
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Khai báo và khởi tạo mảng sách
        String[] books = {
                "Lap trinh Java",
                "Co so du lieu",
                "Cau truc du lieu",
                "Mang may tinh",
                "He dieu hanh"
        };

        System.out.print("Nhap ten sach can tim: ");
        String search = sc.nextLine();

        int result = searchBooks(books, search);

        if (result != -1) {
            System.out.println("Tim thay tai vi tri " + result);
        } else {
            System.out.println("Sach khong ton tai");
        }
    }


}
