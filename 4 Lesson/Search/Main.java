import com.google.common.base.Stopwatch;

public class Main {
    public static void main(String[] args) {
        int[] array = {1, 4, 7, 9, 10, 15};
        LineSearch lineSearch = new LineSearch();
        BinarySearch binarySearch = new BinarySearch();


        System.out.println(lineSearch.search(array, 0));
        System.out.println(binarySearch.search(array, 7, 0, array.length - 1));



    }
}
