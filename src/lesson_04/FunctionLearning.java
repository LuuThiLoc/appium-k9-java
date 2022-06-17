package lesson_04;

import java.security.SecureRandom;

public class FunctionLearning {
    // 1 - DRY: Don't Repeat Yourself!
    // 2 - SOLID:
    // S: Single Responsibility



    public static void main(String[] args) {

        sayHello("Mary"); // Mary: argument
        sayHello("Peter");
        sayHello("John");

        getARandomNumber(1000);
        System.out.println(getARandomNumber(1)); //boundary: exclusive -> 0 lấy số cuối cùng 5
        System.out.println(getARandomNumber(10));
        System.out.println(getARandomNumber(300));
        //System.out.println(getARandomNumber());

        printMenu();
        System.out.println("Continue the code block...");
    }

    public static void sayHello(String name) { // name: param
        System.out.println("Hi, " + name);
    }

    public static int getARandomNumber(int boundary) {
        int randomNumber = new SecureRandom().nextInt(boundary);
        //int randomNumber = new SecureRandom().nextInt(Integer.MAX_VALUE);
        return randomNumber;
    }

    public static void printMenu() {
        for (int index = 0; index < 10; index++) {
            if (index == 8) {
                System.out.println("You have reached the magic number!");
                return; // thoát luôn khỏi function printMenu()
            } else {
                System.out.println(index);
            }
        }
        System.out.println("End the program!");
    }

    //varargs, rest parameters: sayHello(int...abc)
}

