package B1;

import java.util.LinkedHashSet;
import java.util.Set;

public class Bai1 {
    public static void main(String[] args) {

        String[] patients = {
                "Nguyễn Văn A – Yên Bái",
                "Trần Thị B – Thái Bình",
                "Nguyễn Văn A – Yên Bái",
                "Lê Văn C – Hưng Yên"
        };


        Set<String> patientList = new LinkedHashSet<>();

        for (String p : patients) {
            patientList.add(p);
        }

        System.out.println("Danh sách gọi khám:");
        for (String name : patientList) {
            System.out.println(name);
        }
    }
}
