package lesson_04;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ArrayListLearning {

    public static void main(String[] args) {

        // Raw type: ko có kiểu dữ liệu là gì
        ArrayList myArrList = new ArrayList();

        myArrList.add(0);
        myArrList.add(1.8D);
        myArrList.add(5.6F);
        myArrList.add(235235L);
        myArrList.add(false);
        myArrList.add(true);
        myArrList.add("Mary");

        // Should declare data type of ArrayList
        // ArrayList: only accept Wrapper Class data type
        ArrayList<Integer> myIntArrList = new ArrayList<>();

        // Should declare List<> instead of ArrayList<>, because of Polymorphism (tính đa hình của OOP)
        // List implement nhiều loại khác nhau, ArrayList<> là 1 trong số đó. List sức chứa lớn hơn ArrayList
        List<String> myStrArrList = new ArrayList<>();

        // Convert Array into ArrayList(List): ->  Arrays.asList();
        List<Integer> myIntArr = Arrays.asList(1, 18, 41);
        List<Float> myFlArrList = Arrays.asList(0.4F, 4.7F, 0.9F);
        List<Double> myDbArrList = Arrays.asList(0.4D, 4.7D, 0.9D);
        List<String> myStringArrList = Arrays.asList("Teo", "Ti", "Xiu");
        List<Boolean> myBlArrList = Arrays.asList(true, false);

        // Summary: có 2 cách viết
        // 1:
        List<Integer> myArrayList = new ArrayList<>(); // ko có dữ liệu --> ArrayList Instance

        // 2:
        List<Integer> myArrasList = Arrays.asList(1, 18, 41); // có dữ liệu đổ vào --> Arrays.asList()
        //or:
        Integer[] arr = {1, 2, 3}; // List<Integer>
        List<Integer> myArrasList_ = Arrays.asList(arr); //Arrays.asList(arr) --> return: List<Integer>

        //int[] arr0 = {0, 1, 2}; // Array Integer


        // CRUD:
        // 1-CREATE
        myArrayList.add(1);
        myArrayList.add(2);
        myArrayList.add(0, 3);

        // Unsupported Error: Arrays.asList() --> only read/update, NOT add/remove
        // myArrasList.add(5);

        // Support for all CRUD: ArrayList Instance
        myArrayList.add(4);



        // 2-READ
        // ARRAY lIST:
        // Print each element of ArrayList
        for (int index = 0; index < myArrayList.size(); index++) {
            System.out.println(myArrayList.get(index)); // get element at [index] of ArrayList: arrayList.get(index)
            myArrayList.remove(1); // 4-DELETE
        }

        for (Integer element : myArrayList) {
            System.out.println(element);
        }

        // Print all elements of ArrayList
        System.out.println(myArrayList);


        // ARRAY:
        // Print all elements of Array
        int[] array = {6, 7, 8, 9};
        System.out.println(Arrays.toString(array));

        // Print each element of Array
        for (int element : array) {
            System.out.println(element);
        }

        // get element at [index] of Array: array[index]
        System.out.println(array[3]);


        // 3-UPDATE --> Lesson 05

        // 4-DELETE
        // arrayList.remove(index);

    }
}
