package lesson_08;

public class TestPerson {

    public static void main(String[] args) {
        Person person = new Person("Mary", -18);
        //bị chặn ở dòng này vì age < 0 --> throw ra 1 exception --> control input đầu vào dữ liệu ntn?
        //Affect: Model > Controller > Nơi sử dụng --> apply model để dễ maintain

//  Nếu name & age: public -> gán giá trị trực tiếp đc
//        person.name = "Mary";
//        person.age = 18;

        //  Nếu name & age: private -> gán giá trị thông qua Setter;
        person.setName("Mary"); // --> write ability
        person.setAge(18);

        person.getName(); // --> read ability
        person.getAge();

        person.doSth();
        System.out.println(person);

        // Builder Design Pattern

    }
}
