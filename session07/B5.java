package session07;


public class B5 {
    public static final int maxScore = 10;
    public static final int minScore = 0;

    public static void main(String[] args) {
        int score = 8;
        if(score >= minScore && score <= maxScore){
             System.out.println("Điểm hợp lệ");
        } else {
            System.out.println("Điểm không hợp lệ");
        }
    }    
}
