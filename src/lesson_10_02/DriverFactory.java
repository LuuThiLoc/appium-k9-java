package lesson_10_02;

public class DriverFactory {
    public AppiumDriver getAppiumDriver() {

        AppiumDriver appiumDriver;
        String platform = System.getenv("platform");

        if (platform.equals("android")) {
            appiumDriver = new AndroidDriver();
        } else if (platform.equals("ios")) {
            appiumDriver = new IOSDriver();
        } else {
            throw new IllegalArgumentException("We don't support " + platform);
        }

        return appiumDriver;
    }
}
