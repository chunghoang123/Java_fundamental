package B6;

import java.util.Scanner;

public class HospitalManagement {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        PatientWaitingQueue patientQueue =
                new PatientWaitingQueue();

        MedicalRecordHistory history =
                new MedicalRecordHistory("REC01");

        TicketSystem ticketSystem =
                new TicketSystem();

        UndoManager undoManager =
                new UndoManager();

        int choice;

        do {
            System.out.println("\n===== HOSPITAL SYSTEM =====");
            System.out.println("1. Them benh nhan");
            System.out.println("2. Goi benh nhan");
            System.out.println("3. Phat so");
            System.out.println("4. Goi so");
            System.out.println("5. Sua benh an");
            System.out.println("6. Undo benh an");
            System.out.println("7. Nhap lieu");
            System.out.println("8. Undo nhap lieu");
            System.out.println("0. Thoat");

            choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {

                case 1:
                    System.out.print("ID: ");
                    String id = sc.nextLine();
                    System.out.print("Ten: ");
                    String name = sc.nextLine();
                    System.out.print("Tuoi: ");
                    int age = sc.nextInt();
                    sc.nextLine();
                    System.out.print("Gioi tinh: ");
                    String gender = sc.nextLine();

                    patientQueue.addPatient(
                            new Patient(id,name,age,gender));
                    break;

                case 2:
                    System.out.println(
                            patientQueue.callNextPatient());
                    break;

                case 3:
                    System.out.println(
                            "Phat so: "
                                    + ticketSystem.issueTicket());
                    break;

                case 4:
                    ticketSystem.callNext();
                    break;

                case 5:
                    System.out.print("Noi dung sua: ");
                    String desc = sc.nextLine();
                    history.addEdit(
                            new EditAction(desc,"Doctor"));
                    break;

                case 6:
                    history.undoEdit();
                    break;

                case 7:
                    undoManager.saveAction(
                            new InputAction(
                                    "Name",
                                    "Old",
                                    "New"));
                    break;

                case 8:
                    undoManager.undo();
                    break;
            }

        } while (choice != 0);
    }
}