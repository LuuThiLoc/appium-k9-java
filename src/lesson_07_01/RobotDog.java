package lesson_07_01;

public class RobotDog {

    //class variable (static): share value -> thay đổi value 1 chỗ ở static thì ~ chỗ khác cũng thay đổi theo.
    //tất cả các objects đc sinh ra đều sử dụng chung var này
    protected static int dogId = 0; //nếu ko có static thì dogId là 1 attribute
    private final int robotId;

    public RobotDog() {
        robotId = dogId + 1;
        dogId++;
    }

    public int getDogID() {
        changeId(); //non-static method có thể truy cập đc static method
        return robotId;
    }

    public static void changeId(){
        dogId++;
    }

    public static void main(String[] args) {
        changeId(); //static method gọi đc static method
        //getDogID(); //static method ko gọi đc non-static method
    }
}
