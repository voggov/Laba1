import com.google.common.base.Stopwatch;

public class LineSearch {
    public int search(int[] arr, int findElement)
    {
        Stopwatch stopwatch = Stopwatch.createStarted();


        for (int i = 0; i <arr.length; i++) {
            if (arr[i] == findElement) {
                System.out.println("Время выполнения линейного поиска = " + stopwatch.stop());
                return i;

            }
        }
        System.out.println("Время выполнения линейного поиска = " + stopwatch.stop());
        return -1;
    }
}
