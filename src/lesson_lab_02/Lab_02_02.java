package lesson_lab_02;

import java.util.Scanner;

public class Lab_02_02 {
    // Allow user to input a number, print out it’s an odd or even number

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter your BMI: ");

        float fBMI = scanner.nextFloat();

        if (fBMI % 2 == 0) {
            System.out.println("Your BMI is an even number!");
        } else {
            System.out.println("Your BMI is an odd number!");
        }
    }
}
