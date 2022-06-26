package lesson_08;

public class Person {
    //private: trong cùng class có thể truy cập đc
    //public: khác class có thể truy cập đc

    private String name;
    private int age;

    public Person(String name, int age) {
        // Control t/h invalid bằng throw exception.
        if (age < 0){
            throw new IllegalArgumentException("Age cann't be negative number!");
        }
        this.name = name;
        this.age = age;
    }


    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        if (age < 0){
            throw new IllegalArgumentException("Age cann't be negative number!");
        }
        this.age = age;
    }


    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() { //toString(): để print ra các attributes
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    public void doSth(){

    }


    /*
    * Bug Leakage = User's bugs / (QA's bugs - Invalid bugs) * 100
    *
    * (QA's bugs - Invalid bugs) --> nếu mẫu  = 0 thì đây là 1 t/h invalid cần phải control --> throw e
    *
    * */
}
