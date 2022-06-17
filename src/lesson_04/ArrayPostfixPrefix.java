package lesson_04;

public class ArrayPostfixPrefix {

    public static void main(String[] args) {
        int a = 1;
        int b = 2;
        int c = ++a + b++;

        int[] myIntArray = {9, 9, 9, 9, 9, 9};
        for (int index = 0; index < 5; ) {
            //for (int index = 0; index < 5; index++) {
            //myIntArray[index] = index + 1; //thực thi: [index] trước // 1 2 3 4 5 9
            //myIntArray[index] = index++; // index = index + 1 // 0 9 2 9 4 9

            myIntArray[index++] = index + 1; // thực thi: [index++] trước // 2 3 4 5 6 9
            //index 0 -> myIntArray[0 + 1] = 1 + 1
            //index 1 -> myIntArray[1 + 1] = 2 + 1
            //...
            //evaluate [index++] trước để biết expression của myIntArray[index++]?
            //increase index rồi mới assign giá trị bên phải qua trái
            //phải change index thì vòng lặp mới thực thi
        }

        for (int value : myIntArray) {
            System.out.println(value);
        }
    }
}
