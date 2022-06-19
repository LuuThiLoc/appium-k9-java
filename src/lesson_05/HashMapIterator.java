package lesson_05;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class HashMapIterator {

    public static void main(String[] args) {
        Map<Integer, String> emergencyList = new HashMap<>();

        emergencyList.put(113, "Canh Sat");
        emergencyList.put(114, "Cuu Hoa");
        emergencyList.put(115, "Cap Cuu");
        emergencyList.put(116, "Others");
        emergencyList.put(117, "Others");
        emergencyList.put(118, "Nothing");

        for (Integer key : emergencyList.keySet()) {
            if (emergencyList.get(key).equals("Others")) {
                emergencyList.replace(key, "Something Else");
                // emergencyList.remove(key); --> throw Exception

            }
        }

        //To avoid that exception, we need to have an Iterator with Entry from Map.Entry

        Iterator<Map.Entry<Integer, String>> emergencyListIterator = emergencyList.entrySet().iterator();
        while (emergencyListIterator.hasNext()) {
            Map.Entry<Integer, String> entry = emergencyListIterator.next();
            String entryValue = entry.getValue();
            if (entryValue.equals("Nothing"))
                emergencyListIterator.remove();
        }

        //Print values of key list
        for (Integer key : emergencyList.keySet()) {
            System.out.println(emergencyList.get(key));
        }

    }
}
