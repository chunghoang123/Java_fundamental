package Bai2;

abstract class Vehicle {

    protected String brand; // Tên hãng xe

    // Constructor khởi tạo hãng xe
    public Vehicle(String brand) {
        this.brand = brand;
    }

    // Phương thức trừu tượng
    public abstract void move();
}