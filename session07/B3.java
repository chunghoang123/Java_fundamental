package session07;

public class B3 {

    public static boolean pass(double score) {
        return score >= 5;
    }

    public static double avg(double a, double b, double c) {
        return (a + b + c) / 3;
    }

    public static void main(String[] args) {

        double dtb = B3.avg(6, 7, 8);
        System.out.println("Điểm TB: " + dtb);

        System.out.println(
            B3.pass(dtb) ? "Đạt" : "Không đạt"
        );
    }

    
}
