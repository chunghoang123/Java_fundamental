package BaiTongHop;

public class EmergencyPatient extends Patient {

    private int priorityLevel;

    public EmergencyPatient(String id, String name,
                            int age, String condition,
                            int priorityLevel) {
        super(id, name, age, condition);
        this.priorityLevel = priorityLevel;
    }

    public int getPriorityLevel() {
        return priorityLevel;
    }

    @Override
    public void showInfo() {
        System.out.println("[CAP CUU] "
                + id + " | " + fullName
                + " | Tuoi: " + age
                + " | Uu tien: " + priorityLevel);
    }
}
