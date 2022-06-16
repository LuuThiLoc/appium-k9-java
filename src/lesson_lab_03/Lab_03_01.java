package lesson_lab_03;

public class Lab_03_01 {
    // Count how many odd, even number(s) in an integer array

    public static void main(String[] args) {
        int[] intArr = {1, 2, 3, 4, 5};

        int evenCount = 0;
        int oddCount = 0;

        for (int i = 0; i < intArr.length; i++) {
            if (intArr[i] % 2 == 0) {
                evenCount++; // evenCount = evenCount + 1
            } else {
                oddCount++; // oddCount = oddCount + 1
            }
        }
        System.out.println("Even Number: " + evenCount);
        System.out.println("Odd Number: " + oddCount);
    }
}
