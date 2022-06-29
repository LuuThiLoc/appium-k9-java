package lesson_10_02;

public class TestEch {

    public static void main(String[] args) {

//        Ech trungEch= new TrungEch();
//        Ech nongNoc = new NongNoc();
//
//        // transition to take another form --> Polymorphism
//        trungEch = new NongNoc();

        Ech ech;

        boolean isEnoughTime = true;

        if (isEnoughTime) {
            ech = new NongNoc();
        } else {
            ech = new TrungEch();
        }

        // Lợi dụng tính đa hình, tại thời điểm Runtime --> init platform nào --> support multiple platform

//        AppiumDriver driver = new AndroidDriver;
//        Appiumdriver driver = new IOSDriver;
//
//        Appiumdriver driver;
//
//        boolean isAndroid = true;
//
//        if (isAndroid) {
//            driver = new AndroidDriver;
//        } else {
//            driver = new IOSDriver;
//        }
    }
}
