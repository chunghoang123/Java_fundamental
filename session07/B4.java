package session07;

public class B4 {
      // CỦA CHUNG - quỹ lớp
    static int classFund = 0;

    // CỦA RIÊNG - tên sinh viên
    String studentName;

    // Constructor
    B4(String name) {
        studentName = name;
    }

    // Sinh viên đóng tiền
    void payFund(int amount) {
        classFund += amount;
        System.out.println(studentName + " đóng " + amount);
    }

    // Xem tổng quỹ lớp
    static void showFund() {
        System.out.println("Tổng quỹ lớp: " + classFund);
    }

     public static void main(String[] args) {

        B4 sv1 = new B4("An");
        B4 sv2 = new B4("Bình");
        B4 sv3 = new B4("Chi");

        sv1.payFund(100);
        sv2.payFund(200);
        sv3.payFund(150);

        B4.showFund();
    }
    
}
