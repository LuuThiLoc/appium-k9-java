package lesson_lab_03;

public class Lab_03_02 {
    // Finding maximum value/minimum value from an integer array

    public static void main(String[] args) {
        int[] intArr = {1, 2, -3, 4, 5};

        int min = 0;
        int max = 0;

        for (int i = 0; i < intArr.length; i++) {
            if (max < intArr[i]) {
                max = intArr[i];
            }

            if (min > intArr[i]) {
                min = intArr[i];
            }
        }
        System.out.println("Min Number: " + min);
        System.out.println("Max Number: " + max);
    }
}
