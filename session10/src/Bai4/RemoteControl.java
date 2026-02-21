package Bai4;

public interface RemoteControl {

    // Phương thức trừu tượng
    void powerOn();

    // Default method
    default void checkBattery() {
        System.out.println("Pin on dinh");
    }
}