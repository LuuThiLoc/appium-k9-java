package lesson_04;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ArrayListLearning {

    public static void main(String[] args) {

        // Raw data
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

        // Summary:
        List<Integer> myArrayList = new ArrayList<>(); // ko có dữ liệu
        List<Integer> myArrayList_ = Arrays.asList(1, 18, 41); // có dữ liệu đổ vào

        // CRUD:
        myArrayList.add(1);
        myArrayList.add(2);
        myArrayList.add(0, 3);

        // ArrayList: dùng size() & Collections.sort()
        myArrayList.size();
        Collections.sort(myArrayList);

        // Còn Array dùng length & Arrays.sort()
        int[] array = {5, 9, 14};
        int len = array.length;
        Arrays.sort(array);

        // Get index of element
        for (int index = 0; index < myArrayList.size(); index++) {
            System.out.println(myArrayList.get(index));
        }

        for (Integer integer : myArrayList) {
            System.out.println(integer);
        }
    }
}
