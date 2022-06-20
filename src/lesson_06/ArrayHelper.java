package lesson_06;

public class ArrayHelper {

    // Functional Programming:
    // Access Modifier + Kiểu dữ liệu trả về + Tên hàm + Đối Số nhận vào
    public int findMinNumber(int[] arr) {
        return -1;
    }

    public int findMaxNumber(int[] arr) {
        return -1;
    }

    // Service method:
    public int[] sort(int[] arr){
        sortAsc(arr);
        return arr;
    }

    // JAVA DOC
    /**
    * @param sortType asc, desc
    *
    * */

    // Service method:
    public int[] sort(int[] arr, String sortType){
        if(sortType.equals("asc")){
            sortAsc(arr);
        } else if (sortType.equals("desc")) {

        }
        return arr;
    }

    // Support method:
    private void sortAsc(int[] arr) {

    }

}
