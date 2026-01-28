package session04;

import java.util.Scanner;

public class b2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nhap mo ta sach: ");
        String description = sc.nextLine();

        String lowerDescription = description.toLowerCase();

        if (lowerDescription.contains("ke")) {
            int startIndex = lowerDescription.indexOf("ke") + 2;
            int endIndex;

            if (lowerDescription.indexOf(",", startIndex) != -1) {
                endIndex = lowerDescription.indexOf(",", startIndex);
            } else {
                endIndex = description.length();
            }

            // Trich xuat ma vi tri
            String shelfCode = description.substring(startIndex, endIndex).trim();

            // Thay the tu khoa
            String newDescription = description.replace("ke", "vi tri luu tru");

            System.out.println("Ma vi tri sach: " + shelfCode);
            System.out.println("Mo ta moi: " + newDescription);

        } else {
            System.out.println("Khong tim thay thong tin ke sach trong mo ta.");
        }
    }
}

