package lesson_lab_02;

import java.util.Scanner;

public class Lab_02_01 {
    // Get input from user about height(m) and weight(kg) then calculate BMI

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Please enter your weight: ");
        float fWeight = scanner.nextFloat();

        System.out.print("Please enter your height: ");
        float fHeight = scanner.nextFloat();

        float fBMI = fWeight / (fHeight * 2);
        System.out.println("Your BMI is: " + fBMI);

        if (fWeight < 18.5) {
            System.out.println("You are UnderWeight!");
        } else if (fWeight <= 24.9) {
            System.out.println("You are NormalWeight!");
        } else if (fWeight <= 29.9) {
            System.out.println("You are OverWeight!");
        } else if (fWeight >= 30) {
            System.out.println("You are Obesity!");
        }
    }
}

