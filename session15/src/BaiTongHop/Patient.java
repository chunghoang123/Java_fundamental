package BaiTongHop;

import java.util.Stack;

public class Patient extends Person {

    protected String medicalCondition;
    protected Stack<String> history;

    public Patient(String id, String name, int age, String condition) {
        super(id, name, age);
        this.medicalCondition = condition;
        history = new Stack<>();
    }

    public void addHistory(String record) {
        history.push(record);
    }

    public void showHistory() {
        if(history.isEmpty()){
            System.out.println("Khong co lich su dieu tri!");
            return;
        }

        System.out.println("=== Lich su dieu tri ===");
        for(int i = history.size()-1; i>=0; i--){
            System.out.println(history.get(i));
        }
    }

    @Override
    public void showInfo() {
        System.out.println(id + " | " + fullName +
                " | Tuoi: " + age +
                " | Benh: " + medicalCondition);
    }
}
