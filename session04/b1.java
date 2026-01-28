package session04;

import java.util.Scanner;

public class b1 {
    public void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nhap ten sach: ");
        String bookTitle = sc.nextLine();

        System.out.print("Nhap ten tac gia: ");
        String authorName = sc.nextLine();

        System.out.print("Nhap the loai: ");
        String category = sc.nextLine();

        bookTitle = chuanHoa(bookTitle).toUpperCase();
        authorName= vietHoaChuCaiDau(chuanHoa(authorName));

        System.out.println(bookTitle +"-Tac gia: "+authorName);

    }

    static String chuanHoa(String input) {

        return input.trim().replaceAll("\\s+", " ");
    }

    static String vietHoaChuCaiDau(String input) {
        String[] words = input.split(" ");
        StringBuilder result = new StringBuilder();

        for (String word : words) {
            result.append(Character.toUpperCase(word.charAt(0)))
                    .append(word.substring(1).toLowerCase())
                    .append(" ");

        }

        return result.toString().trim();
    }

}
