package lesson_03;

public class ArrayLearning {

    public static void main(String[] args) {
        int arrayLength = 5;
        int[] myIntArray = new int[arrayLength];

        for (int index = 0; index < arrayLength; index++) {
            // myIntArray[index] = index + 1;
            // đổ dữ liệu vào index rồi mới tính toán (index + 1).
            // Tính toán xong mới gán vào left operand.

            // myIntArray[index] = index++;
            // sau khi thực hiện assignment xong mới thực hiện post fix.
            //++index/index++: thay đổi trực tiếp value của variable.

            myIntArray[index] = index;
            index = index + 1;
        }

        myIntArray[arrayLength - 1] = 15;

        for (int index = 0; index < arrayLength; index++) {
            System.out.printf("Element at the index %d has value %d\n", index, myIntArray[index]);
        }

        // Declare dữ liệu kiểu tường minh
        int[] myIntArray01 = {1, 5, 8, 9, 11, 35};
        System.out.println(myIntArray01[5]);

        arrayLength = myIntArray01.length;

        myIntArray01 = new int[arrayLength];

        myIntArray01[arrayLength - 1] = 12; // the last element: [arrayLength-1]
        System.out.println(myIntArray01[arrayLength - 1]);

        // Enhanced For Loop
        int[] myIntArray02 = {3, 5, 7, 13, 16, 38};

        for (int arrayElement : myIntArray02) {
            System.out.println(arrayElement);
        }

        // Declare Array
        int[] array = new int[9];
        // yêu cầu cấp phát bao nhiêu ô nhớ để assign value vào element[index]

        int[] arr = {0, 5, 17, 10, 16, 28};
        // yêu cầu cấp phát trực tiếp vùng nhớ cho các "element value" của array này

    }

    // MẢNG 1 CHIỀU: những vùng nhớ liên tiếp và có dữ liệu trong đó.
    // Nếu truy cập ngoài vùng nhớ của array thì sẽ báo exception: "index out of bound"
    // Để truy cập hết các phần tử thì dùng For Loop

}
