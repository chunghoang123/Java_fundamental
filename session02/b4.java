package session02;

import java.util.Scanner;

public class b4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        do {
            System.out.print("Nhap ma ID sach moi(>0): ");
            n = sc.nextInt();
            if (n <= 0)
                System.out.println("ko phai so am");

        } while (n <= 0);

        System.out.printf("Xac nhan: ma sach %d da dc ghi nhan", n);

    }
}
