package lesson_03;

public class ForLoopLearning {

    public static void main(String[] args) {

        int maxNumber = 10;

//        for (int i = 0; i < maxNumber; i++) {
//            System.out.println(i);
//        }

        // Infinitive Loop -> OverMemory: Stack Overflow (if calculating complex)
        int i = 0;
        for (; i < maxNumber; ) {
            System.out.println(i);
            i++; // stop loop
        }

        // Unreachable Statement
        System.out.println("Hello!");

        // For Loop: fix number
        // Change conditional trigger
        // Gía trị đầu tiên nào làm cho điều kiện vòng lặp invalid? -> thoát vòng lặp -> giá trị cuối cùng của index
    }
}
