package B4;

import java.util.LinkedList;

public class Bai4 {
    private LinkedList<String> waitingList = new LinkedList<>();

    public void patentCheckIn(String name){
        waitingList.addLast(name);
        System.out.println(name + "vao hang doi kham");
    }
    public void emergencyCheckIn(String name){
        waitingList.addFirst(name);
        System.out.println(name+"cap cau khan cap");
    }
    public void treatPatient(){
        if(waitingList.isEmpty()){
            System.out.println("ko co benh nhan");
            return;
        }
        String patient = waitingList.removeFirst();
        System.out.println("dang khams"+ patient);
    }
    public static void main(String[] args) {

        Bai4 room = new Bai4();

        // Mô phỏng đề bài
        room.patientCheckIn("A");
        room.patientCheckIn("B");
        room.emergencyCheckIn("C");

        System.out.println("\n--- Bắt đầu khám ---");

        room.treatPatient(); // C
        room.treatPatient(); // A
        room.treatPatient(); // B
    }

    private void patientCheckIn(String a) {
    }
}
