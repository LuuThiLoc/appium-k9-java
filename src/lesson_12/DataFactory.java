package lesson_12;

import java.io.*;
import java.util.Scanner;

//Checked Exception
public class DataFactory {
    public static void readFile(String filePath) {
        System.out.println("Read file from ".concat(filePath));

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please input the file path: ");
        String userFileName = scanner.nextLine();

        try {
            FileInputStream fileInputStream = new FileInputStream(userFileName); // constructor của FileInputStream có throws FileNotFoundException --> Not recommend --> should handle by {try...catch}
            InputStreamReader inputStreamReader = new InputStreamReader(fileInputStream);
            BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
        }
//        catch (Exception e) {
//            e.printStackTrace();
//        }
        catch (FileNotFoundException e) {
            throw new IllegalArgumentException("The file path ".concat(filePath).concat(" is not found!"));
        }
    }

    public static void main(String[] args) {
        DataFactory.readFile("src/lesson_12/DataFactory.java");
    }
}
