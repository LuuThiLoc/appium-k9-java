package lesson_11_1;

public class DriverFactory {

    public static void initAppiumDriver(Platform platform) {
        switch (platform) {
            case ANDROID:
                System.out.println("Init Android Driver");
                break;
            case IOS:
                System.out.println("Init IOS Driver");
                break;
            default:
                throw new IllegalArgumentException("Please provide the correct platform!");
        }
    }
}

