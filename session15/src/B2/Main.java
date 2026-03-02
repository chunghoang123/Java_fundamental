package B2;

public class Main {
    public static void main(String[] args) {
        PatientQueue patientQueue = new PatientQueue();

        patientQueue.addPatient(new Patient("BN001", "Nguyễn Văn A", 30));
        patientQueue.addPatient(new Patient("BN002", "Trần Thị B", 25));
        patientQueue.addPatient(new Patient("BN003", "Lê Văn C", 40));

        System.out.println("\nBệnh nhân tiếp theo:");
        System.out.println(patientQueue.peekNextPatient());

        System.out.println("\nGọi khám:");
        patientQueue.callNextPatient();

        System.out.println("\nDanh sách còn chờ:");
        patientQueue.displayQueue();
    }
}