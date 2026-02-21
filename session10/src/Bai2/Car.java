package Bai2;

class Car extends Vehicle {

    public Car(String brand) {
        super(brand); // Gọi constructor lớp cha
    }

    @Override
    public void move() {
        System.out.println(brand + " - Cach di chuyen: Di chuyen bang dong co");
    }
}