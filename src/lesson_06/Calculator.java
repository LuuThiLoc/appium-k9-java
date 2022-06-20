package lesson_06;

public class Calculator {

    // Method Signature: tên hàm + parameter -> giống nhau ?
    // Parameter: xem xét có cùng số lượng và kiểu dữ liệu ? (ko care alias giống hay khác)

    public int sum(int num1, int num2) {
        return num1 + num2;
    }

//     ERROR: method signature
//    protected String sum(int ưetgewt2t3, int num2) {
//        return ("ưetgewt2t3 + num2");
//    }


    // Method overloading: method name giống nhau, nhưng khác nhau về parameter

    public int sum(int num1, int num2, int num3) {
        return num1 + num2 + num3;
    }

    // Varargs | Rest Parameters

    public int sum(int num1, int num2, int... restNumbers) {
        int totalArr = 0;
        for (int number : restNumbers) {
            totalArr = totalArr + number; //sum total restNumbers = num3 + num4 + num5 +...
        }

        return num1 + num2 + totalArr;
    }

    public int sum_(int initNumber, int... restNumbers) {
        int totalArr = 0;
        for (int number : restNumbers) {
            totalArr = totalArr + number; //sum total restNumbers = num1 + num2 + num3 +...
        }

        return totalArr;
    }

    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        calculator.sum(1, 2);
        calculator.sum(1, 2, 3);
        System.out.println(calculator.sum(1, 2, 3, 5, 9, 11, 14, 20, 25, 30)); //120
        System.out.println(calculator.sum_(1, 2, 3, 5, 9, 11, 14, 20, 25, 30)); //120
    }

    // WHEN overloading happens | Compile Time
    // WHEN overriding happens | Run Time


}
