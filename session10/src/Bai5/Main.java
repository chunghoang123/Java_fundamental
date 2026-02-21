package Bai5;

public class Main {

    public static void main(String[] args) {

        Employee staff = new OfficeStaff("Nguyen Van A", 8000);
        Employee manager = new Manager("Tran Thi B", 15000, 5000);

        System.out.println("===== BANG LUONG =====");

        staff.displayInfo();
        manager.displayInfo();
    }
}