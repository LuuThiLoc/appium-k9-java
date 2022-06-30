package lesson_12;

public class LaunchAppTest {

    public static void main(String[] args) {
//        AppiumDriver appiumDriver = DriverFactory.getAppiumDriver(Platform.IOS);
        AppiumDriver appiumDriver = DriverFactory.getAppiumDriver("null");

        appiumDriver.initDriver();
        appiumDriver.closeDriver();
    }
}
