package lesson_lab_03;

import java.util.Arrays;

public class Lab_03_04 {
    //Merge 2 SORTED integer array into one SORTED array

    public static void main(String[] args) {

        int[] array01 = {1, 12, 16, 28, 34};
        int[] array02 = {1, 13, 16, 27, 99};

        int[] array = new int[array01.length + array02.length];

        int i = 0, j = 0, k = 0;

        while (i < array01.length && j < array02.length) {
            if (array01[i] < array02[j]) {
                array[k] = array01[i];
                i++;
                k++;
            } else {
                array[k] = array02[j];
                j++;
                k++;
            }
        }

        while (i < array01.length) {
            array[k] = array01[i];
            i++;
            k++;
        }

        while (j < array02.length) {
            array[k] = array02[j];
            j++;
            k++;
        }
        System.out.println("Merged Array: " + Arrays.toString(array));
    }
}



