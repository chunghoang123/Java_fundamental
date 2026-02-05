package session07;

public class B2 {
    String name;

    public static void main(String[] args) {
        
        int a = 10;
        int b = a;
        b = 20;

        System.out.println("a = " + a);
        System.out.println("b = " + b);

        System.out.println("----------------");

        B2 s1 = new B2();
        s1.name = "An";

        B2 s2 = s1;   
        s2.name = "Binh";

        System.out.println("s1.name = " + s1.name);
        System.out.println("s2.name = " + s2.name);

    }

   
    
}
