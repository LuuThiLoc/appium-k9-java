package lesson_lab_06;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Lab_06_03 {

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

        int totalDigits = 0;
        char totalLetters = 0;


        for (char character : myArrayCharacters) {
            if (Character.isDigit(character)) totalDigits++;
            else if (Character.isLetter(character)) totalLetters++;
        }


        List<String> digitListStr = new ArrayList<>();
        int index = 0;


        if (totalDigits > 0) {

            for (index = 0; index < totalDigits; index++) {
                String digitStr = String.valueOf(myArrayCharacters[index]);
                digitListStr.add(digitStr);
            }

            System.out.println(digitListStr);

            int digitIndex = index - totalDigits;

            String outputNum = digitListStr.get(digitIndex).concat(digitListStr.get(digitIndex + 1)).concat(digitListStr.get(digitIndex + 2));

            System.out.println(outputNum);
        }
    }
}






