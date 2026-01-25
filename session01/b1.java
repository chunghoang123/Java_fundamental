package session01;

import java.util.Scanner;
public class b1 {
    public static void main(String[] args){
        Scanner sc  = new Scanner (System.in);

        String bookId;
        String bookName;
        int publishYear;
        double price;
        boolean isAvailable;


        System.out.print("Nhap ma sach: ");
        bookId = sc.nextLine();
        System.out.print("nhap ten sach: ");
        bookName = sc.nextLine();
        System.out.print("Nhap nam san xuat: ");
        publishYear = sc.nextInt();
        System.out.print("Nhap gia sach: ");
        price = sc.nextDouble();
        System.out.print("Nhap trang thai sach: ");
        isAvailable = sc.nextBoolean();

        int bookage = 2026 - publishYear;

        System.out.println("PHIEU THONG TIN SACH");

        System.out.println("Ma sach: " + bookId);
        System.out.println("Ten sach: " + bookName);
        System.out.println("Nam san xuat: " + publishYear);
        System.out.println("Gia sach: " + price);
        System.out.println("Trang thai sach: " + isAvailable);
        System.out.println("Tuoi sach: " + bookage + "nam");
        if(isAvailable){
            System.out.println("Sach co the muon");
        }else{
            System.out.println("Sach khong co the muon");
        }
    }   
}
