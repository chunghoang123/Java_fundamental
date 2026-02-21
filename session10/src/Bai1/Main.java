package Bai1;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // ===== Nhập bán kính hình tròn =====
        System.out.print("Nhap ban kinh hinh tron: ");
        double radius = sc.nextDouble();
        Circle circle = new Circle(radius);

        // ===== Nhập chiều rộng và chiều cao hình chữ nhật =====
        System.out.print("Nhap chieu rong hinh chu nhat: ");
        double width = sc.nextDouble();

        System.out.print("Nhap chieu cao hinh chu nhat: ");
        double height = sc.nextDouble();
        Rectangle rectangle = new Rectangle(width, height);

        // ===== In kết quả =====
        System.out.println("\n=== Ket qua ===");

        System.out.println("Hinh tron:");
        System.out.println("Dien tich: " + circle.getArea());
        System.out.println("Chu vi: " + circle.getPerimeter());

        System.out.println("\nHinh chu nhat:");
        System.out.println("Dien tich: " + rectangle.getArea());
        System.out.println("Chu vi: " + rectangle.getPerimeter());

        sc.close();
    }
}
