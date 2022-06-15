package lesson_lab_02;

import java.util.Scanner;

public class Lab_02_03 {
    //Lab 2.1 + Suggest user to increase/decrease weight

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter your weight: ");

        float fWeight = scanner.nextFloat();

        if (fWeight < 18.5) {
            System.out.println("You should increase the weight about: " + (18.5 - fWeight));
        } else if (fWeight <= 24.9) {
            System.out.println("You should keep this weight!");
        } else if (fWeight <= 29.9) {
            System.out.println("You should decrease the weight about: " + (fWeight - 24.9));
        } else if (fWeight >= 30) {
            System.out.println("You should decrease the weight about: " + (fWeight - 24.9));
        }
    }
}

