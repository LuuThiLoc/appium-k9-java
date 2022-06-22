package lesson_lab_06;

import java.util.Scanner;

public class Lab_06_02 {
//String myPassword = "password123";
//Allow user to input maximum 3 times

    public static void main(String[] args) {
        String myPassword = "password123";

        int attemptTimes = 0;

        do {

            Scanner scanner = new Scanner(System.in);
            System.out.print("Please input your password: ");

            String inputUser = scanner.next();
            System.out.printf("Your input password is: %s\n", inputUser);

            if (inputUser.equals(myPassword)) { //equals: string
                System.out.println("The password is correct!");
                return;
            } else {
                System.out.println("The password is wrong. Please input it again!");
            }
            attemptTimes++;
        }
        while (attemptTimes < 3);

        System.out.println("The input password is wrong 3 times. The account is locked temporary! ");
    }
}











