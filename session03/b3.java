package session03;

public class b3 {
      // Tìm và in sách có số lượng lớn nhất
    public static void maxQuantityOfBooks(String[] names, int[] quantities) {
        int max = quantities[0];

        // Tìm số lượng lớn nhất
        for (int i = 1; i < quantities.length; i++) {
            if (quantities[i] > max) {
                max = quantities[i];
            }
        }

        System.out.println("Sach co so luong nhieu nhat:");
        for (int i = 0; i < quantities.length; i++) {
            if (quantities[i] == max) {
                System.out.println("- " + names[i] + ": " + quantities[i]);
            }
        }
    }

    // Tìm và in sách có số lượng nhỏ nhất
    public static void minQuantityOfBooks(String[] names, int[] quantities) {
        int min = quantities[0];

        // Tìm số lượng nhỏ nhất
        for (int i = 1; i < quantities.length; i++) {
            if (quantities[i] < min) {
                min = quantities[i];
            }
        }

        System.out.println("Sach co so luong it nhat:");
        for (int i = 0; i < quantities.length; i++) {
            if (quantities[i] == min) {
                System.out.println("- " + names[i] + ": " + quantities[i]);
            }
        }
    }

    public static void main(String[] args) {

        // Khởi tạo dữ liệu
        String[] names = {
            "Lap trinh Java",
            "Co so du lieu",
            "Cau truc du lieu",
            "Mang may tinh",
            "He dieu hanh"
        };

        int[] quantities = {10, 5, 10, 3, 3};

        // Gọi các phương thức
        maxQuantityOfBooks(names, quantities);
        System.out.println();
        minQuantityOfBooks(names, quantities);
    }
    
}
