package lesson_lab_04;

import java.util.*;

public class Lab_04_01 {

    /*
    Lab 4: Create a simple menu with 4 options:
    =====MENU======
    1. Add number into ArrayList
    2. Print numbers
    3. Get maximum number
    4. Get minimum number
     */

    public static void main(String[] args) {

        boolean isContinuing = true;

        while (isContinuing) {

            printSimpleMenu();

            int option = getUserOption();

            List<Integer> array = new ArrayList<>();

            array.add(5);
            array.add(9);
            array.add(14);
            array.add(58);
            array.add(99);

            Collections.sort(array);

            switch (option) {
                case 0:
                    isContinuing = false;
                    System.out.println("Exit Game!");
                    break;

                case 1:
                    Scanner scanner = new Scanner(System.in);
                    System.out.print("Please add a number into ArrayList: ");
                    int addNumber = scanner.nextInt();
                    array.add(addNumber);
                    System.out.printf("The number %d is added into ArrayList\n", addNumber);
                    break;

                case 2:
                    for (int index = 0; index < array.size(); index++) {
                        System.out.println("Print numbers: " + array.get(index));
                    }
                    break;

                case 3:
                    int arrSize = array.size();
                    int maxNumber = array.get(arrSize - 1);
                    System.out.println("Get maximum number: " + maxNumber);
                    break;

                case 4:
                    int minNumber = array.get(0);
                    System.out.println("Get minimum number: " + minNumber);
                    break;

/*                case 5:
                    Scanner scanner01 = new Scanner(System.in);
                    System.out.print("Please enter a number in the array list to search index: ");
                    int searchNumber = scanner01.nextInt();

                    int searchIndex = 0;


                    for (int index = 0; index < array.size(); index++) {
                        if (searchNumber == array.get(index)) {
                            searchIndex = index;
                            System.out.println("Index of Search Number is: " + searchIndex);
                            break;
                        } else {
                            System.out.println("Please input a correct number in the array list!");
                        }
                    }*/

                default:
                    System.out.println("[ERR] Please input the correct option!");
            }
        }
        System.out.println("See you again!");
    }

    private static void printSimpleMenu() {
        System.out.println("======MENU======");
        System.out.println("0. Exit Game");
        System.out.println("1. Add number into ArrayList");
        System.out.println("2. Print numbers");
        System.out.println("3. Get maximum number");
        System.out.println("4. Get minimum number");
        System.out.println("5. Search a number index");
    }

    private static int getUserOption() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter an option: ");
        return scanner.nextInt();
    }
}
