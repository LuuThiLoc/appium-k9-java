package lesson_07;

public class TestRobotCat {

    public static void main(String[] args) {
        RobotCat batteryRobotCat = new BatteryRobotCat("batteryRobotCat", "23/06/2022");
        RobotCat solarRobotCat = new SolarRobotCat("solarRobotCat", "06/06/2022");

//        batteryRobotCat.setName("Meo");
//        batteryRobotCat.setProductionDate("23/06/2022");

//        System.out.println(batteryRobotCat);
//        System.out.println(solarRobotCat);

        System.out.println(batteryRobotCat.charge());
        System.out.println(solarRobotCat.charge());

        batteryRobotCat.doSth();
        batteryRobotCat.toString();
    }
}
