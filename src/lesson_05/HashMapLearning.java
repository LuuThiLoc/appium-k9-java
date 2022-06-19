package lesson_05;

import java.util.HashMap;
import java.util.Map;

public class HashMapLearning {
// HashMap implements Map Interface

    public static void main(String[] args) {
        Map<Integer, String> emergencyList = new HashMap<>();

        emergencyList.put(113, "Canh Sat");
        emergencyList.put(114, "Cuu Hoa");
        emergencyList.put(115, "Cap Cuu");
        emergencyList.put(116, "Others");
        emergencyList.put(116, "Something Else!");

        System.out.println(emergencyList.get(113));
        //boxing: tự gói vào object: new Integer(113)

        System.out.println(emergencyList.get(117));
        //nếu key ko tồn tại thì ko throw ra lỗi exception, mà print ra default value của kiểu dữ liệu String là null.

        System.out.println(emergencyList.get(116));
        //ko cho phép key trùng lặp: unique key, nhưng vẫn thực thi và thay thế key trùng lắp.
        //value vẫn có thể trùng.

        //get ra 1 bộ của ~ keys -> .keySet()
        for (int key : emergencyList.keySet()) {

            //get ra value của key -> .get(key)
            System.out.println(emergencyList.get(key));
        }

        System.out.println("Has 113 key: " + emergencyList.containsKey(113));
        System.out.println("Has 117 key: " + emergencyList.containsKey(117));
        System.out.println("Has \"Canh Sat\" value: " + emergencyList.containsValue("Canh Sat"));
        System.out.println("Has \"Nothing\" value: " + emergencyList.containsValue("Nothing"));


        // UPDATE;
        emergencyList.replace(116, "116");
        emergencyList.replace(117, "117");
        System.out.println(emergencyList.get(116));
        System.out.println(emergencyList.get(117));

        emergencyList.replace(116, "116","Something Else!");
        System.out.println(emergencyList.get(116));
    }
}
