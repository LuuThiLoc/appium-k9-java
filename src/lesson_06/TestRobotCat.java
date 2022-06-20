package lesson_06;

public class TestRobotCat {

    public static void main(String[] args) {

        // Default Constructor: ko có đối số
        RobotCat cat1 = new RobotCat();
        // Tại thời điểm RunTime, khi gọi new RobotCat() sẽ tự sinh ra 1 default constructor trong file: out>lesson_06>RobotCat.class

        // public class RobotCat {
        //    public RobotCat() {
        //    }
        //}


        // Constructor Overloading:
        RobotCat cat2 = new RobotCat("Kitty");
        cat2.setName("Meo Meo");
        cat2.printName();
    }

}

