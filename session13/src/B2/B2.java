package B2;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class B2 {
    public static List<String> locVaSapXepThuoc(List<String>danhSachNhap){
        List<String> danhSachKhongTrung = new ArrayList<>();
        for ( String thuoc :danhSachNhap){
            if(!danhSachKhongTrung.contains(thuoc)){
                danhSachKhongTrung.add(thuoc);
            }
        }
        Collections.sort(danhSachKhongTrung);
        return danhSachKhongTrung;


        
    }
    public static void main(String[] args){
        List<String> input = new ArrayList<>();
        input.add("Paracetamol");
        input.add("Ibuprofen");
        input.add("Panadol");
        input.add("Paracetamol");
        input.add("Aspirin");
        input.add("Ibuprofen");

        System.out.println("Input: " + input);

        List<String> output = locVaSapXepThuoc(input);
        System.out.println("Output: " + output);
        


        
    }
}
