package lesson_10_02;

public class TestAppiumDriver {

    public static void main(String[] args) {
        AppiumDriver appiumDriver = new DriverFactory().getAppiumDriver();
        appiumDriver.initDriver();
    }
}
