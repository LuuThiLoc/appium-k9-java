package lesson_12;

public class DriverFactory {

    public static AppiumDriver getAppiumDriver(String platform) {
        AppiumDriver appiumDriver;

        switch (platform) {
            case "IOS":
                appiumDriver = new IOSDriver();
                break;
            case "ANDROID":
                appiumDriver = new AndroidDriver();
                break;
            default:
                throw new IllegalArgumentException("Please provide correct platform!");
        }

        return appiumDriver;
    }

    public static void main(String[] args) {
        AppiumDriver appiumDriver = null;

        try {
            appiumDriver = DriverFactory.getAppiumDriver("ANDROID");
            appiumDriver.initDriver();
            // continue the logic here

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (appiumDriver != null)
            appiumDriver.closeDriver();
        }
    }
}

