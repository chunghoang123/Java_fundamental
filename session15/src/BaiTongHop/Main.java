package BaiTongHop;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        HospitalManagement hm = new HospitalManagement();
        Scanner sc = new Scanner(System.in);

        int choice;

        do{
            System.out.println("\n===== MENU =====");
            System.out.println("1. Dang ky kham");
            System.out.println("2. Goi kham");
            System.out.println("3. Danh sach cho");
            System.out.println("4. Tim kiem");
            System.out.println("5. Sap xep");
            System.out.println("6. Xem lich su");
            System.out.println("0. Thoat");

            choice = sc.nextInt();
            sc.nextLine();

            switch(choice){

                case 1:
                    hm.add();
                    break;

                case 2:
                    hm.callPatient();
                    break;

                case 3:
                    hm.display();
                    break;

                case 4:
                    System.out.print("Nhap ID/Ten: ");
                    hm.search(sc.nextLine());
                    break;

                case 5:
                    hm.sort();
                    break;

                case 6:
                    System.out.print("Nhap ID: ");
                    hm.viewHistory(sc.nextLine());
                    break;
            }

        }while(choice != 0);
    }
}