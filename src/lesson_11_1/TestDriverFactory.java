package lesson_11_1;

public class TestDriverFactory {

    public static void main(String[] args) {
//        boolean isRunningOnIOS = System.getenv("platform").equals("ios");
//        if (isRunningOnIOS) {
//            DriverFactory.initAppiumDriver(Platform.IOS);
//        } else {
//            DriverFactory.initAppiumDriver(Platform.ANDROID);
//        }

        System.out.println(SupportIOSVersion.IOS_13.getVersion());
        System.out.println(SupportIOSVersion.IOS_13.getiOSName());
    }
}