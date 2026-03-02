package BaiTongHop;

import java.util.*;

public class HospitalManagement implements IManagement {

    Queue<Patient> queue = new LinkedList<>();
    Scanner sc = new Scanner(System.in);

    // ================= ADD =================
    @Override
    public void add() {

        System.out.println("1. Benh nhan thuong");
        System.out.println("2. Benh nhan cap cuu");
        int choice = sc.nextInt();
        sc.nextLine();

        System.out.print("ID: ");
        String id = sc.nextLine();

        System.out.print("Ten: ");
        String name = sc.nextLine();

        System.out.print("Tuoi: ");
        int age = sc.nextInt();
        sc.nextLine();

        System.out.print("Tinh trang benh: ");
        String condition = sc.nextLine();

        if(choice == 2){
            System.out.print("Muc do uu tien: ");
            int priority = sc.nextInt();

            EmergencyPatient ep =
                    new EmergencyPatient(id,name,age,condition,priority);

            // ưu tiên lên đầu
            LinkedList<Patient> temp =
                    (LinkedList<Patient>) queue;
            temp.addFirst(ep);

        }else{
            queue.offer(new Patient(id,name,age,condition));
        }

        System.out.println("Dang ky thanh cong!");
    }

    // ================= DISPLAY =================
    @Override
    public void display() {

        if(queue.isEmpty()){
            System.out.println("Hang doi rong!");
            return;
        }

        for(Patient p : queue){
            p.showInfo();
        }
    }

    // ================= SEARCH =================
    @Override
    public void search(String key) {

        for(Patient p : queue){
            if(p.getId().equalsIgnoreCase(key)
                    || p.getFullName().contains(key)){
                p.showInfo();
                return;
            }
        }

        System.out.println("Khong tim thay!");
    }

    // ================= SORT =================
    @Override
    public void sort() {

        List<Patient> list = new ArrayList<>(queue);

        list.sort(Comparator.comparingInt(Patient::getAge));

        queue.clear();
        queue.addAll(list);

        System.out.println("Da sap xep theo tuoi!");
    }

    // ================= CALL PATIENT =================
    public void callPatient(){

        if(queue.isEmpty()){
            System.out.println("Khong co benh nhan!");
            return;
        }

        Patient p = queue.poll();

        System.out.println("Dang kham:");
        p.showInfo();

        sc.nextLine();
        System.out.print("Chan doan / Thuoc: ");
        String record = sc.nextLine();

        p.addHistory(record);

        System.out.println("Kham xong!");
    }

    // ================= VIEW HISTORY =================
    public void viewHistory(String id){

        for(Patient p : queue){
            if(p.getId().equalsIgnoreCase(id)){
                p.showHistory();
                return;
            }
        }

        System.out.println("Khong tim thay benh nhan!");
    }
}
