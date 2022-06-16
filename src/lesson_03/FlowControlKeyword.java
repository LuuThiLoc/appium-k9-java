package lesson_03;

public class FlowControlKeyword {

    public static void main(String[] args) {

        for (int i = 0; i < 10; i++) {

            if (i == 3)  // nếu 1 statement thì ko cần {} sau if
                //break; // nếu thỏa mãn đk i == 3 thì thoát luôn khỏi vòng lặp
                continue; // skip execute loop at index = 3
            System.out.println(i);
        }
    }
}
