
package lesson_05;

import java.util.Arrays;

public class StringLearning {

    public static void main(String[] args) {
        String myName1 = "Teo"; //Literal declaration (tường minh)
        String myName2 = "Teo"; //Literal declaration
        String myName3 = "Teo"; //Via String object (object)

        //khi so sánh string thì dùng hàm equals, ko sử dụng = =
        System.out.println("myName1 == myName2: " + (myName1.equals(myName2)));
        System.out.println("myName1 == myName3: " + (myName1.equals(myName3)));


        //check lowercase, UPPERCASE, digit...
        String myPassword = "123Password";

        char[] myArrCharacters = myPassword.toCharArray();
        // chuyển String myPassword thành 1 mảng của ~ kí tự

        int totalDigits = 0;
        int totalUppercase = 0;
        int totalLowercases = 0;

        // lấy ra các kí tự của mảng
        for (char character : myArrCharacters) {

            //hàm if đơn ko có {} vì: 1 char thì nếu là digit thì ko thể vừa là lowercase/uppercase đc.
            if (Character.isDigit(character)) totalDigits++;
            else if (Character.isUpperCase(character)) totalUppercase++;
            else if (Character.isLowerCase(character)) totalLowercases++;
        }

        //check các điều kiện
        if (totalDigits > 0 && totalLowercases > 0 && totalUppercase > 0) {
            System.out.println("You are all set!");
        } else {
            System.out.println("Password format is wrong!");
        }

        //Replacement | Immutable: dữ liệu gốc ko thay đổi, clone ra dữ liệu gốc để xử lý
        String badWordContainer = "      bad, very bad, sth else, bad  ";

        //String: ko thay thế trực tiếp như 8 loại dữ liệu kia, phải tạo ra container mới.
        String filteredStr = badWordContainer.replace("bad", "b**");
        System.out.println(badWordContainer);
        System.out.println(filteredStr);

        // Trim
        System.out.println(badWordContainer);
        System.out.println(badWordContainer.trim());

        // Substring, indexOf, split
        String url = "♥☻https://google.com";

        // indexOf: check xem có tồn tại ko?
        // nếu < 0: ko tồn tại char
        // nếu >=0: tồn tại char -> trả về index đầu tiên chứa char

        System.out.println(url.length());
        System.out.println(url.indexOf("w"));
        System.out.println(url.indexOf("h"));
        System.out.println(url.indexOf("https"));
        System.out.println(url.indexOf("♥☻"));

        // Substring: lấy ra 1 đoạn
        System.out.println(url.substring(0, 2)); // exclusive - boundary
        System.out.println(url.substring(2)); // lấy từ index[2] đến cuối chuỗi

        // Split
        //String[] urlStr = url.split("");
        String[] urlStr = url.split("://"); // cắt bỏ đoạn substring này
        System.out.println(Arrays.toString(urlStr));

        // Regex | Regular Expression
        String myCookingTimes = "      105 mín  ";

        // TODO: Pattern & Matcher

        String cookingTimeNumStr = myCookingTimes.replaceAll("[^0-9]", ""); //ko phải từ 0 -> 9
        System.out.println(cookingTimeNumStr); //string

        // Convert String into Integer
        System.out.println(Integer.valueOf(cookingTimeNumStr)); //integer

        int cookingTime = Integer.valueOf(cookingTimeNumStr);

        System.out.println("Cooking Time is: " + (cookingTime + 1));

        // Concatenation: nối chuỗi
        String s1 = "Hello, ";
        String s2 = "Teo";
        System.out.println(s1.concat(s2).concat("!!! ") + "New Day!");
        System.out.println(s1 + s2);

        // StringBuilder

    }
}

