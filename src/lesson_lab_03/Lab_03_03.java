package lesson_lab_03;

import java.util.Arrays;

public class Lab_03_03 {
    // Sort an integer array from min to max

    public static void main(String[] args) {
        int[] arr = {12, 34, 1, 16, 28};

        // Cach 1:
//        Arrays.sort(intArr);
//
//        System.out.println("Sort Array: " + Arrays.toString(intArr));

        // Cach 2:
        for (int i = 0; i < arr.length; i++) {

            for (int j = i + 1; j < arr.length; j++) {

                int temp = 0;

                if (arr[j] < arr[i]) {

                    //Swapping: tráo đổi
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
            System.out.print(arr[i] + " ");
        }
    }
}
