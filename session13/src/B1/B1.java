package B1;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Iterator;

public class B1 {
    public static void main(String[] args) {

        ArrayList<Double> temperature = new ArrayList<>();
        temperature.add(25.0);
        temperature.add(26.0);
        temperature.add(27.0);
        temperature.add(28.0);
        temperature.add(29.0);
        temperature.add(30.0);
        temperature.add(31.0);
        temperature.add(32.0);
        temperature.add(33.0);
        temperature.add(34.0);
        temperature.add(35.0);
        temperature.add(36.0);
        temperature.add(37.0);
        temperature.add(38.0);
        temperature.add(39.0);
        temperature.add(40.0);
        temperature.add(41.0);
        temperature.add(42.0);
        System.out.println("danh sach ban dau" + temperature);

        Iterator<Double> iterator = temperature.iterator();
        while (iterator.hasNext()) {
            double temp = iterator.next();
            if (temp < 34.0 || temp > 42.0) {
                iterator.remove();
            }

        }
        System.out.println("danh sach sau khi loc" + temperature);

        double sum  = 0;
        for(double temp : temperature){
            sum += temp;
        }
        double average = sum / temperature.size();
        System.out.println("Nhiet do trung binh la: " + average);

    }
}
