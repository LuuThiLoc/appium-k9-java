package lesson_lab_06;

import java.util.ArrayList;
import java.util.List;

public class Lab_06_03_fix {

//    String myStr = "100 minutes";
//    NOT using REGEX, extract digit character from that String
//    Expected output: "100".
//    EX: "12345nabc678" -> "12345678"

    public static void main(String[] args) {
        extractDigitCharacterFromAString("100 minutes");
        extractDigitCharacterFromAString("12345nabc678");
    }

    public static void extractDigitCharacterFromAString(String myStr) {
        char[] myArrayCharacters = myStr.toCharArray();

        String outputStr = "";

        for (char character : myArrayCharacters) {
            if (Character.isDigit(character)) {
                outputStr += character;
            }
        }
        System.out.println(outputStr);
    }
}






