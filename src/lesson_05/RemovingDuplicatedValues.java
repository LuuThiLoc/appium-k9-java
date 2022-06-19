package lesson_05;

import java.util.*;

public class RemovingDuplicatedValues {

    public static void main(String[] args) {

        List<Integer> myArrList = new ArrayList<>();

        myArrList.add(1);
        myArrList.add(3);
        myArrList.add(9);
        myArrList.add(1);
        myArrList.add(5);
        myArrList.add(10);
        myArrList.add(3);

        /*
        * Lấy ra 3 giá trị nhỏ nhất của List:
        * Remove duplicate > Sort list > Get 3 min values
        * */

        // Cách 1 - Sử dụng contains(number)
        List<Integer> withoutDuplicatedValuesList = new ArrayList<>();

        for (Integer number : myArrList) {
            if (!withoutDuplicatedValuesList.contains(number)){
                withoutDuplicatedValuesList.add(number);
            }
        }

        Collections.sort(withoutDuplicatedValuesList);

        System.out.println(myArrList);
        System.out.println(withoutDuplicatedValuesList);

        // Cách 2 - SET
        Set<Integer> set = new HashSet<>(myArrList);
        // Set: lấy dữ liệu từ myArrList đổ vào và ko có dữ liệu trùng lặp
        // Set: tự sort theo ascending

        myArrList = new ArrayList<>(set);
        System.out.println(myArrList);

        // SUBLIST: lấy 1 đoạn nào đó ra
        List<Integer> first3minValues = myArrList.subList(0,3); //Exclusive: vùng biên - boundary
        System.out.println(first3minValues);
    }
}