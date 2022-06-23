package lesson_07;

public class WindRobotCat extends RobotCat {



    public WindRobotCat(String name, String productionDate) {
        super(name, productionDate);
    }

    public WindRobotCat(){
        super(); // call default constructor of class cha: public RobotCat() {}
    }

    @Override
    public String charge() {
        return super.charge() + " with Wind Energy";
    }
}
