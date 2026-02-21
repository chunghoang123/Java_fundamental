package Bai4;

public class Main {

    public static void main(String[] args) {

        // Tạo Anonymous Class ngay trong main
        RemoteControl smartLight = new RemoteControl() {

            @Override
            public void powerOn() {
                System.out.println("Den da bat");
            }
        };

        smartLight.powerOn();
        smartLight.checkBattery();
    }
}
