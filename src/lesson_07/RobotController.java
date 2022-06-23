package lesson_07;

import java.util.Arrays;
import java.util.List;

public class RobotController {

    public static void main(String[] args) {
        RobotController robotController = new RobotController();

        // Query Dữ liệu lấy lên từ DB, dùng các template để tạo ra các object và đổ dữ liệu vào xử lý
        // Model lưu dũ liệu xuống DB, sau đó đổ dữ liệu ra xử lý logic, rồi trả ra output ở 1 nơi nào đó và display trên UI.
        RobotCat batteryRobotCat = new BatteryRobotCat("batteryRobotCat", "23/06/2022");
        RobotCat solarRobotCat = new SolarRobotCat("solarRobotCat", "06/06/2022");
        RobotCat windRobotCat = new WindRobotCat("solarRobotCat", "01/06/2022");

        robotController.charge(Arrays.asList(batteryRobotCat, solarRobotCat, windRobotCat));
    }


    //Controller | IS-A Relationship  -> nơi xử lý dữ liệu đưa vào
    public void charge(List<RobotCat> robotCatList){
        for (RobotCat robotCat : robotCatList) {
            System.out.println(robotCat.charge());
        }
    }
}
