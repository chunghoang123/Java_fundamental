package session02;

import java.util.Scanner;
public class b2 {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Nhap ma khu vuc (A,B,C,D): ");
        String a = sc.nextLine();

        switch (a){
            case"A":
                System.out.println( "Tầng 1: Sách Văn học");
                break;
            case"B":
                System.out.println("Tàng 2: Sách Khoa học");
                break;
            case"C":
                System.out.println("Tầng 3: Sách Ngoại ngữ");
                break;
            case"D":
                System.out.println("Tầng 4: Sách Tin học");
                break;
            default:
                System.out.println("Khong hop le");
         
        }
    }
}
