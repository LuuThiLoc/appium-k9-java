package lesson_07;

import java.util.ArrayList;
import java.util.List;

public class ArrayListAndObject {

    public static void main(String[] args) {
        // <Person>: Reference data -> Được tạo ra từ User Defined Class (do người dùng tự define ra)
        List<Person> personList = new ArrayList<>();

        Person teo = new Person();

        teo.setName("Teo");
        teo.setAge(18);

        // cả 2 entry đều chỉ đến 1 vùng nhớ trong array list
        personList.add(teo);
        personList.add(teo); //add thêm 1 entry vào array list, ko phải add vào 1 object mới, mà tham chiếu đến vùng nhớ của object cũ.

        System.out.println(personList);

        personList.get(1).setName("Ti"); // thay đổi giá trị ở vùng nhớ thành "Tí" -> refresh lại data ở cả 2 entry, vì cùng 1 vùng nhớ.
        System.out.println(personList);

        for (Person person : personList) {
            System.out.println(person.getName());
            System.out.println(person.getAge());
        }
    }

}
