package lesson_lab_06;

import java.util.Arrays;
import java.util.List;

public class Lab_06_01_fix {
    //Given input string: "2hrs and 5 minutes"
    //Please calculate how many minutes in total

    public static void main(String[] args) {

        String myTime = "2hrs and 5 minutes";

        int hrsIndex = myTime.indexOf("hrs");
        int minutesIndex = myTime.indexOf("minutes");
        int andIndex = myTime.indexOf("and");

        String hours = myTime.substring(0, hrsIndex);
        String minutes = myTime.substring(andIndex + 4, minutesIndex -1);

        int hrs = Integer.valueOf(hours);
        int min = Integer.valueOf(minutes);

        System.out.println("Total minutes is: "+ (hrs * 60 + min));
    }
}
