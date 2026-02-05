package session07;

public class B1 {

    private String studentId;  
    private String studentName;
    
    private static int totalStudent = 0;

    public B1(String studentId, String studentName) {
        this.studentId = studentId;
        this.studentName = studentName;
        totalStudent++;
        
    }

    public void display() {
        System.out.println("ID: " + studentId);
        System.out.println("Name: " + studentName);
        System.out.println("----------------------");
    }

    public void displayTotal() {
        System.out.println("Total student: " + totalStudent);
    }
    public static void main(String[] args) {
        B1 student1 = new B1("A001", "Nguyen Van A");
        B1 student2 = new B1("A002", "Nguyen Van B");
        B1 student3 = new B1("A003", "Nguyen Van C");
        student1.display();
        student2.display();
        student3.display();
        student1.displayTotal();
    }
}