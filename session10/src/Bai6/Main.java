package Bai6;

import java.util.*;

public class Main {

    public static void main(String[] args) {

        List<Product> products = new ArrayList<>();
        products.add(new Product("Laptop", 1500));
        products.add(new Product("Phone", 800));
        products.add(new Product("Tablet", 1200));
        products.add(new Product("Mouse", 50));


        Collections.sort(products, new Comparator<Product>() {

            @Override
            public int compare(Product p1, Product p2) {
                return Double.compare(p1.getPrice(), p2.getPrice());
            }
        });

        System.out.println("=== Sap xep theo gia tang dan (Anonymous) ===");
        for (Product p : products) {
            System.out.println(p);
        }


        Collections.sort(products,
                (p1, p2) -> p1.getName().compareTo(p2.getName())
        );

        System.out.println("\n=== Sap xep theo ten A-Z (Lambda) ===");
        for (Product p : products) {
            System.out.println(p);
        }


    }
}