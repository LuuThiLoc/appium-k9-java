package lesson_02;

import java.util.Scanner;

public class IfStatement {

    public static void main(String[] args) {
        final int EXPECTED_TIME = 10;
        //final: constant -> can not re-assign value
        //expectedTime = 8; -> error
        //Naming convention of constant: UPPERCASE + _UNDERSCORE

        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter the time (hr): ");
        int arrivalTime = scanner.nextInt();

        boolean isHeOnTime = arrivalTime == EXPECTED_TIME;
        //arrivalTime == 10: comparation operator (toán tử so sánh)-> return true or false

        System.out.println("Going to the shop");

//        if (isHeOnTime) {
//            System.out.println("Let's talk!");
//        } else {
//            System.out.println("Write a letter!");
//        }

//        if(!isHeOnTime){
//            System.out.println("Write a letter!");
//        }

        System.out.println("Go home");

        // Ternary Operator: toán tử 3 ngôi
        String outputMessage = isHeOnTime ? "Let's talk!" : "Write a letter!";
        System.out.println(outputMessage);
    }
}
