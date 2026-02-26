package B3;

import java.util.ArrayList;
import java.util.List;

public class Bai3 {
    public static <T> List<T> findCommonPatients(List<T> listA, List<T> listB){
        List<T> commonPatients =  new ArrayList<>();


        for ( T patient : listA){
            if(listB.contains(patient)){
                commonPatients.add(patient);
            }

        }
        return commonPatients;
    }

    public static void main(String[] args){
        List<Integer> khoaNoiInt = List.of(101, 102, 105);
        List<Integer> khoaNgoaiInt = List.of(102, 105, 108);

        List<Integer> resultInt = findCommonPatients(khoaNoiInt, khoaNgoaiInt);
        System.out.println("Test Case 1 Output: " + resultInt);

        List<String> khoaNoiStr = List.of("DN01", "DN02", "DN03");
        List<String> khoaNgoaiStr = List.of("DN02", "DN04");

        List<String> resultStr = findCommonPatients(khoaNoiStr, khoaNgoaiStr);
        System.out.println("Test Case 2 Output: " + resultStr);

    }
}
