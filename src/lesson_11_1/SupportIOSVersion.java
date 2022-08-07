package lesson_11_1;

public enum SupportIOSVersion {

    IOS_13("iOS_13", 13),
    IOS_15("iOS_15", 15);

    private final String iOSName;
    private final int version;

    public String getiOSName() {
        return iOSName;
    }

    public int getVersion() {
        return version;
    }

    SupportIOSVersion(String iOSName, int version) {
        this.iOSName = iOSName;
        this.version = version;
    }
}
