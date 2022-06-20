package lesson_06;

public class RobotCat {

    // 1 default constructor:
    public RobotCat() {
    }


    // Not default constructor:
//        public RobotCat(){
//        System.out.println("Hello");
//    }


    // Tất cả ~ j liên quan đến attribute đều là private
    // RobotCat: có attribute là name
    // private String name: class field --> có default value

    private String name;
    // default dữ liệu của string: null


    // Constructor Overloading:
    public RobotCat(String name) {
        // this.name: name của object đc sinh ra từ bản thiết kế RobotCat = name truyền vào
        this.name = name;
    }


    // Setter:
    public void setName(String name) { // dùng để thay đổi attribute value
        this.name = name;
    }


    // Getter:
    public String getName() { // (trả về attribute value)
        return name;
    }

    public void printName() {
        System.out.println(name);
    }


    private String nickname;
    private String year;
    private String color;

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public RobotCat(String nickname, String year, String color) {
        this.nickname = nickname;
        this.year = year;
        this.color = color;
    }

}
