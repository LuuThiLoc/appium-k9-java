package lesson_lab_06;

import java.util.Arrays;

public class Lab_06_04 {
//    String url = "https://google.com";
//    Check http OR https; domain name, .com OR .net

    public static void main(String[] args) {

        String url = "https://google.com";

        System.out.println((url.indexOf("s")));

        String[] strArr = url.split("://");
        System.out.println(Arrays.toString(strArr));

        System.out.println(url.indexOf(".com"));

        System.out.println(url.indexOf(".net"));

        System.out.println(url.substring(14));
    }
}
