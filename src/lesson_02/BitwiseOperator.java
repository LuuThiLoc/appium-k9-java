package lesson_02;

public class BitwiseOperator {

    public static void main(String[] args) {
        if (firstMethod() & secondMethod()) {
            System.out.println("Inside the method");
        }
    }

    public static boolean firstMethod() {
        System.out.println("firstMethod");
        return true;
    }

    public static boolean secondMethod() {
        System.out.println("secondMethod");
        return false;
    }
}