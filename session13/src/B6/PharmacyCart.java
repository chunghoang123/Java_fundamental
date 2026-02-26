package B6;

import java.util.*;

public class PharmacyCart {

    static Scanner sc = new Scanner(System.in);
    static List<Medicine> cart = new ArrayList<>();

    public static void addMedicine() {
        System.out.print("Nhap ma thuoc: ");
        String id = sc.nextLine();

        for (Medicine m : cart) {
            if (m.drugId.equalsIgnoreCase(id)) {
                System.out.print("Thuoc da ton tai, nhap so luong them: ");
                int extra = Integer.parseInt(sc.nextLine());
                m.quantity += extra;
                System.out.println("Da cong don so luong!");
                return;
            }
        }

        System.out.print("Nhap ten thuoc: ");
        String name = sc.nextLine();

        System.out.print("Nhap don gia: ");
        double price = Double.parseDouble(sc.nextLine());

        System.out.print("Nhap so luong: ");
        int qty = Integer.parseInt(sc.nextLine());

        cart.add(new Medicine(id, name, price, qty));
        System.out.println("Them thuoc thanh cong!");
    }

    public static void updateQuantity() {
        System.out.print("Nhap ma thuoc can sua: ");
        String id = sc.nextLine();

        for (Medicine m : cart) {
            if (m.drugId.equalsIgnoreCase(id)) {

                System.out.print("Nhap so luong moi: ");
                int newQty = Integer.parseInt(sc.nextLine());

                if (newQty == 0) {
                    cart.remove(m);
                    System.out.println("Thuoc da bi xoa!");
                } else {
                    m.quantity = newQty;
                    System.out.println("Cap nhat thanh cong!");
                }
                return;
            }
        }

        System.out.println("Khong tim thay thuoc!");
    }

    public static void deleteMedicine() {
        System.out.print("Nhap ma thuoc can xoa: ");
        String id = sc.nextLine();

        Iterator<Medicine> it = cart.iterator();

        while (it.hasNext()) {
            Medicine m = it.next();
            if (m.drugId.equalsIgnoreCase(id)) {
                it.remove();
                System.out.println("Xoa thanh cong!");
                return;
            }
        }

        System.out.println("ID thuoc khong ton tai!");
    }

    public static void printInvoice() {

        if (cart.isEmpty()) {
            System.out.println("Don thuoc rong!");
            return;
        }

        double total = 0;

        System.out.println("\n===== HOA DON =====");
        System.out.printf("%-10s %-20s %-10s %-10s %-15s\n",
                "ID", "Ten Thuoc", "Gia", "SL", "Thanh Tien");

        for (Medicine m : cart) {
            double money = m.getTotalPrice();
            total += money;

            System.out.printf("%-10s %-20s %-10.0f %-10d %-15.0f\n",
                    m.drugId,
                    m.drugName,
                    m.unitPrice,
                    m.quantity,
                    money);
        }

        System.out.println("-----------------------------------------------");
        System.out.println("Tong tien: " + total + " VND");

        cart.clear();
        System.out.println("Da xoa du lieu don thuoc!");
    }

    public static void cheapMedicine() {

        boolean found = false;

        System.out.println("\nThuoc duoi 50.000 VND:");

        for (Medicine m : cart) {
            if (m.unitPrice < 50000) {
                System.out.println(
                        m.drugId + " - " +
                                m.drugName + " - " +
                                m.unitPrice);
                found = true;
            }
        }

        if (!found)
            System.out.println("Khong co thuoc gia re!");
    }

    public static void main(String[] args) {

        int choice;

        do {
            System.out.println("\n===== MENU KE DON =====");
            System.out.println("1. Them thuoc");
            System.out.println("2. Dieu chinh so luong");
            System.out.println("3. Xoa thuoc");
            System.out.println("4. In hoa don");
            System.out.println("5. Tim thuoc gia re");
            System.out.println("0. Thoat");

            System.out.print("Chon: ");
            choice = Integer.parseInt(sc.nextLine());

            switch (choice) {
                case 1:
                    addMedicine();
                    break;
                case 2:
                    updateQuantity();
                    break;
                case 3:
                    deleteMedicine();
                    break;
                case 4:
                    printInvoice();
                    break;
                case 5:
                    cheapMedicine();
                    break;
                case 0:
                    System.out.println("Thoat chuong trinh!");
                    break;
                default:
                    System.out.println("Lua chon khong hop le!");
            }

        } while (choice != 0);
    }
}