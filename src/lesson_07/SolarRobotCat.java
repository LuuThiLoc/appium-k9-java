package lesson_07;

public class SolarRobotCat extends RobotCat {

    public SolarRobotCat(String name, String productionDate) {
        super(name, productionDate);
    }

    // method
//    void doSth(){
//    }

    @Override
    public String charge() {
        return super.charge() + " with Solar Energy";
    }
}
