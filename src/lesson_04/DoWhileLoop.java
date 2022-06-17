package lesson_04;

import java.security.SecureRandom;
import java.security.Security;
import java.util.Scanner;

public class DoWhileLoop {

    public static void main(String[] args) {
//        boolean isSthStillTrue = true;
//        do {} while (isSthStillTrue);

        int guessingTime = 0;
        int randomNumber = new SecureRandom().nextInt(5);
        System.out.println("Random Number: " + randomNumber);

        do {
            // Guessing number
            Scanner scanner = new Scanner(System.in);
            System.out.print("Please input your guessing number: ");
            int inputUser = scanner.nextInt();

            if (inputUser == randomNumber){
                System.out.println("Hooray! It's correct!");
                break;
            }
            guessingTime++;

        } while (guessingTime < 3);
        System.out.println("See you again!");
    }

}
