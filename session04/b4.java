package session04;

import java.util.Scanner;

public class b4 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap ma the: ");
        String card = sc.nextLine();

        if (!card.matches("^[A-Z]{2}.*")) {
            System.out.println("Thieu tien to 2 chu cai viet hoa");
            return;
        }

        if (!card.matches("^[A-Z]{2}\\d{4}.*")) {
            System.out.println("Nam khong hop le");
            return;
        }

        if (!card.matches("^[A-Z]{2}\\d{4}\\d{5}$")) {
            System.out.println("Sai so luong chu so cuoi");
            return;
        }

        System.out.println("Ma the hop le");
    }
    
}
