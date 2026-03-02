package B6;

import java.util.*;

import java.util.*;

class PatientWaitingQueue {
    Queue<Patient> waitingQueue = new LinkedList<>();
    int totalPatients = 0;

    void addPatient(Patient p) {
        waitingQueue.offer(p);
        totalPatients++;
    }

    Patient callNextPatient() {
        if (waitingQueue.isEmpty()) {
            System.out.println("Khong co benh nhan!");
            return null;
        }
        totalPatients--;
        return waitingQueue.poll();
    }

    void displayQueue() {
        for (Patient p : waitingQueue)
            System.out.println(p);
    }
}