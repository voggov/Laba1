import com.google.common.base.Stopwatch;

public class BinarySearch {
    public int search(int[] sortedArray, int key, int low, int high) {
        Stopwatch stopwatch = Stopwatch.createStarted();
        int index = -1;

        while (low <= high) {
            int mid = (low + high) / 2;
            if (sortedArray[mid] < key) {
                low = mid + 1;
            } else if (sortedArray[mid] > key) {
                high = mid - 1;
            } else if (sortedArray[mid] == key) {
                index = mid;
                break;
            }
        }
        System.out.println("Время выполнения бинарного поиска = " + stopwatch.stop());
        return index;
    }
}
