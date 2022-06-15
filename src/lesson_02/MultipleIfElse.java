package lesson_02;

import java.util.Scanner;

public class MultipleIfElse {

    public static void main(String[] args) {
        // <18|| 18-55 ||>56

        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter your age: ");
        int clientAge = scanner.nextInt();

        if (clientAge < 18) {
            System.out.println("Khong ban!!");
            if (clientAge < 14) {
                System.out.println("Calling 911.........");
            }  //Nested Statement
        } else if (clientAge <= 55) {
            System.out.println("Unlimited!!");
        } else {
            System.out.println("2 chai!!");
        }

        // bitwise operation: & |
        // nếu sai phía bên trái rồi thì vẫn thực thi phía bên phải

        System.out.println(4 & 5);
        // 4: 100
        // 5: 101
        // &: 100 (0 & 1 -> 0) -> result: 4

        System.out.println(4 | 5);
        // 4: 100
        // 5: 101
        // |: 101 (0 | 1 -> 1) -> result: 5

        // compare operator: && ||
        // nếu sai phía bên trái rồi thì ko cần care phía bên phải
    }
}
