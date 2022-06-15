package lesson_02;

public class OperatorsLearning {
    public static void main(String[] args) {
        int myNum1 = 1;
        int myNum2 = 2;

        int total = myNum1 + myNum2;
        int multiple = myNum1 * myNum2;

        System.out.println(5/2);
        System.out.println(5%2);

        int x = ++myNum1 + myNum2++;

        /*
        * prefix First > right operand > assign value to left operand > postfix
        * myNum1: 2
        * myNum2: 3
        * x: 4
        * */

        System.out.print(x + "\n");
        //System.out.print(x); print without newline

        System.out.printf("\t\t%f + %d + %b = %d\n", 1.1, 2, true, 3); //print with format String (as a placeholder) & Object
        // %d: truyen vao cac gia tri kieu so nguyen
        // %f: truyen vao cac gia tri kieu so thuc
        // %b: truyen vao cac gia tri kieu boolean
        // %s: truyen vao cac gia tri kieu string
        // \t: tab
    }
}

