package session02;

import java.util.Scanner;
public class b6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int total = 0;
        int count = 0;
        int maxTurn = 0;
        int minTurn = 0;
        for (int i = 2; i <= 8 ; i++) {
            if(i == 8){
                System.out.print("Nhap luot muon ngay chu nhat: ");
            }else{
                System.out.printf("Nhap luot muon ngay thu %d: " , i);
            }
            int turn = sc.nextInt();

            if(turn == 0){
                continue;
            }

            if(count == 0){
                minTurn = turn;
                maxTurn = turn;
            }

            if (turn > maxTurn) {
                maxTurn = turn;
            }
            if (turn < minTurn) {
                minTurn = turn;
            }
            total = total + turn;
            count++;
        }
        double avg = (double) total / count;

        System.out.println("--- KET QUA THONG KE ---");
        System.out.println("Luot muon cao nhat: " + maxTurn);
        System.out.println("Luot muon thap nhat: " + minTurn);
        System.out.println("Trung binh luot muon/ngay: " + avg);
    }
}
