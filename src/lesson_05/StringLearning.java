package lesson_05;

public class StringLearning {

    public static void main(String[] args) {
        String myName1 = "Teo"; //Literal declaration (tường minh)
        String myName2 = "Teo"; //Literal declaration
        String myName3 = new String("Teo"); //Via String object (object)

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
        String badWordContainer = " bad, very bad, sth else, bad";

        //String: ko thay thế trực tiếp như 8 loại dữ liệu kia, phải tạo ra container mới.
        String filteredStr = badWordContainer.replace("bad", "b**");
        System.out.println(badWordContainer);
        System.out.println(filteredStr);
    }
}

