package Bai1;

class Rectangle implements Shape {

    private double width;
    private double height;

    // Constructor
    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    // Override phương thức tính diện tích
    @Override
    public double getArea() {
        return width * height;
    }

    // Override phương thức tính chu vi
    @Override
    public double getPerimeter() {
        return 2 * (width + height);
    }
}