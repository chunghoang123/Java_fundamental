package session03;
import java.util.Scanner;

public class b5 {
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] books = new int[100]; // mảng cố định
        int n;

        // nhập số lượng sách
        System.out.print("Nhap so luong sach ban dau: ");
        n = sc.nextInt();

        // nhập mã sách
        for (int i = 0; i < n; i++) {
            System.out.print("Nhap ma sach [" + (i + 1) + "]: ");
            books[i] = sc.nextInt();
        }

        // xóa nhiều lần
        while (n > 0) {
            System.out.print("Nhap ma sach can xoa: ");
            int bookId = sc.nextInt();

            int pos = -1;

            // tìm vị trí cần xóa
            for (int i = 0; i < n; i++) {
                if (books[i] == bookId) {
                    pos = i;
                    break;
                }
            }

            if (pos == -1) {
                System.out.println("Khong tim thay ma sach " + bookId);
            } else {
                // dồn trái
                for (int i = pos; i < n - 1; i++) {
                    books[i] = books[i + 1];
                }
                n--;
                System.out.println("Da xoa ma sach " + bookId);
            }

            // in danh sách sau khi xóa
            if (n == 0) {
                System.out.println("Danh sach rong");
                break;
            } else {
                System.out.print("Danh sach hien tai: ");
                for (int i = 0; i < n; i++) {
                    System.out.print(books[i]);
                    if (i < n - 1) System.out.print(", ");
                }
                System.out.println();
            }

            System.out.print("Ban co muon xoa tiep khong? (1: Co, 0: Khong): ");
            int choice = sc.nextInt();
            if (choice == 0) break;
        }
    }
    
}
