package Bai5;

public abstract class Employee {

    protected String name;
    protected double baseSalary;

    public Employee(String name, double baseSalary) {
        this.name = name;
        this.baseSalary = baseSalary;
    }

    // Phương thức trừu tượng
    public abstract double calculateSalary();

    // Phương thức chung để in thông tin
    public void displayInfo() {
        System.out.println("Ten: " + name);
        System.out.println("Luong co ban: " + baseSalary);
        System.out.println("Luong thuc nhan: " + calculateSalary());
        System.out.println("---------------------------");
    }
}