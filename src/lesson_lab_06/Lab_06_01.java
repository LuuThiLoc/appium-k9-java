package lesson_lab_06;

public class Lab_06_01 {
    //Given input string: "2hrs and 5 minutes"
    //Please calculate how many minutes in total

    public static void main(String[] args) {

        String myTime = "2hrs and 5 minutes";
        String myTime1 = myTime.substring(0, 4);
        String myTime2 = myTime.substring(9);

        System.out.println(myTime1);
        System.out.println(myTime2);

        String myTimeNumStr1 = myTime1.replaceAll("[^0-9]", "");
        String myTimeNumStr2 = myTime2.replaceAll("[^0-9]", "");
        System.out.println(myTimeNumStr1);
        System.out.println(myTimeNumStr2);

        int time1 = (Integer.valueOf(myTimeNumStr1)) * 60;
        int time2 = Integer.valueOf(myTimeNumStr2);
        System.out.println(time1);
        System.out.println(time2);

        int time = time1 + time2;
        System.out.println(time);
    }
}
