package lesson_08;

public class House {
    private int doorNum = 1;
    private String topRoofColor = "Red";
    private String color = "White";

//    CÁCH 1: chỉ dùng constructor
//    NHƯỢC ĐIỂM: nếu có quá nhiều attributes thì constructors sẽ overloading rất nhiều params

//    public House(int doorNum, String topRoofColor, String color) {
//
//        if (doorNum != 1 && doorNum > 0) {
//            this.doorNum = doorNum;
//        }
//
//        if (topRoofColor != null)
//        this.topRoofColor = topRoofColor;
//
//        if (color != null)
//        this.color = color;
//
//    }
//
//    public static void main(String[] args) {
//        int doorNum = 1;
//        String topRoofColor = null;
//        String color = "green";
//
//        House house = new House(1, null, "green");
//    }


    //    CÁCH 2: chỉ dùng Setter

    public void setDoorNum(int doorNum) {
        this.doorNum = doorNum;
    }

    public void setTopRoofColor(String topRoofColor) {
        this.topRoofColor = topRoofColor;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public static void main(String[] args) {
        House house = new House();

        house.setDoorNum(2);
        house.setTopRoofColor("Blue");
        house.setColor("Pink");
    }

    // Solution: tạo constructor cho ~ attributes quan trọng, còn lại thì tạo Setter.

    // Immutable Object: khi nào tạo ra Immutable Object thì sử dụng Builder Design Pattern


}
