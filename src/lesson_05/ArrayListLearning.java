package lesson_05;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayListLearning {

    public static void main(String[] args) {
        // 3-UPDATE
        // Đổi 1 list số lẻ thành 1 list số chẵn

        List<Integer> myArrayList = Arrays.asList(1, 2, 3, 4, 5);

        for (int index = 0; index < myArrayList.size(); index++) {
            boolean isElementOddNumber = myArrayList.get(index) % 2 != 0;

            if (isElementOddNumber) {
                myArrayList.set(index, myArrayList.get(index) + 1);
            }
        }

        System.out.println(myArrayList);


        // 4-REMOVE
        List<Integer> myArrayList01 = new ArrayList<>();
        myArrayList01.add(1);
        myArrayList01.add(2);
        myArrayList01.add(3);
        myArrayList01.add(4);
        myArrayList01.add(4);

        myArrayList01.remove(1); // remove theo index
        myArrayList01.remove(Integer.valueOf(1)); // remove theo giá trị
        //myArrayList01.remove(new Integer(1)); // remove theo object

        System.out.println(myArrayList01);

        //CRUD operations: 1-add, 2-get, 3-set, 4-remove


        // Some methods of ArrayList:
        // isEmpty()
        if (!myArrayList.isEmpty()) {
            System.out.println("List's Size: " + myArrayList.size());
        }

        // Check element's existence
        System.out.println(myArrayList.contains(2)); //boxing
        System.out.println(myArrayList.contains(5)); //boxing
        System.out.println(myArrayList.indexOf(4)); //boxing - get index of an element -> Utility method
    }
}




