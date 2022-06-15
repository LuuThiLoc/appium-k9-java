package lesson_01;

public class VariableLearning {
    public static void main(String[] args) {
        // Kieu so nguyen:
        byte myByteNumber = 127;
        short myShortNumber = 128;
        int myIntNumber = 129841588;
        long myLongNumber = 168746516494654L;

        System.out.println(myByteNumber);
        System.out.println(myShortNumber);
        System.out.println(myIntNumber);
        System.out.println(myLongNumber);

        System.out.println(Byte.MAX_VALUE); //127
        System.out.println(Byte.MIN_VALUE); //-128
        System.out.println(Short.MAX_VALUE); //32767
        System.out.println(Short.MIN_VALUE); //-32768
        System.out.println(Integer.MAX_VALUE); //2147483647
        System.out.println(Integer.MIN_VALUE); //-2147483648
        System.out.println(Long.MAX_VALUE); //9223372036854775807
        System.out.println(Long.MIN_VALUE); //-9223372036854775808

        // Kieu so thuc:
        //float myFloatNumber = 0.99F; // declare + assign value
        float myFloatNumber; // declare
        myFloatNumber = 1.23F;  //re-assign value
        double myDoubleNumber = 0.649761684133263434D;

        // Naming Convention: snake_case, camelCase(variable name), PascalCase (Class Name)
    }
}
