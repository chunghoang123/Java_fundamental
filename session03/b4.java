package session03;

public class b4 {
     // Phương thức sắp xếp nổi bọt (Bubble Sort)
    public static void sortBooks(int[] arr) {
        int n = arr.length;
        int temp;

        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    // đổi chỗ
                    temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }

    // Phương thức hiển thị mảng
    public static void displayBooks(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
            if (i < arr.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println();
    }

    public static void main(String[] args) {

        // Khởi tạo mảng ISBN ngẫu nhiên
        int[] books = {145, 23, 98, 67, 12, 200};

        System.out.println("Danh sach ma sach truoc khi sap xep:");
        displayBooks(books);

        // Gọi hàm sắp xếp
        sortBooks(books);

        System.out.println("Danh sach ma sach sau khi sap xep:");
        displayBooks(books);
    }
}
