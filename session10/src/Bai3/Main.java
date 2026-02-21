package Bai3;

public class Main {
    public static void main(String[] args) {

        Duck duck = new Duck("Vit Donald");
        Fish fish = new Fish("Ca Nemo");

        System.out.println("=== Duck ===");
        duck.swim();
        duck.fly();

        System.out.println("\n=== Fish ===");
        fish.swim();
    }
}