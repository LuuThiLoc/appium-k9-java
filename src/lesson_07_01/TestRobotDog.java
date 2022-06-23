package lesson_07_01;

public class TestRobotDog {

    public static void main(String[] args) {
        //tạo ra 1 object
        RobotDog dog = new SolarRobotDog(); //--> dogID = 0 + 1

        // dogID là 1 class variable của RobotDog, nên class RobotDog có thể truy cập trực tiếp đc, mà ko cần tạo ra 1 object
        System.out.println(RobotDog.dogId); //--> dogID = 0 + 1

        // changeId() là 1 class method của RobotDog, nên class RobotDog có thể truy cập trực tiếp đc.
        RobotDog.changeId(); //--> dogID = 1 + 1

        RobotDog dog2 = new WindRobotDog(); // --> dogId = 2 + 1
        RobotDog dog3 = new WindRobotDog();

        System.out.println(dog.getDogID()); //share last value = 3
        System.out.println(dog2.getDogID()); //share last value = 3
        System.out.println(dog3.getDogID()); //share last value = 3
    }
}
