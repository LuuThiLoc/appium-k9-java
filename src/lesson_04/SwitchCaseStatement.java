package lesson_04;

import java.util.Scanner;

public class SwitchCaseStatement {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please input a number: ");
        int inputUser = scanner.nextInt();

//        if (inputUser == 1){
//            System.out.println("Giai Nhat!");
//        } else if (inputUser == 2){
//            System.out.println("Giai Nhi!");
//        } else if (inputUser == 3) {
//            System.out.println("Giai Ba!");
//        } else {
//            System.out.println("Chuc ban may man lan sau!");
//        }

        switch (inputUser){
            case 1:
                //System.out.println("Giai Nhat!");
                //break;
            case 2:
               // System.out.println("Giai Nhi!");
               // break;
            case 3:
                //System.out.println("Giai Ba!");
               // break;
            case 4:
                System.out.println("Giai Tu!");
                break;
            case 5:
            case 6:
            case 7:
                System.out.println("Giai Bay!");
                break;
            default:
                System.out.println("Chuc ban may man lan sau!");
        }
    }
}
