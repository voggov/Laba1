import java.util.Arrays;

public class SelectSort {
    public static void sort(int[] array) {
        for (int i = 0; i < array.length; i++) {
            int pos = i;
            int min = array[i];

            for (int j = i + 1; j < array.length; j++) {
                if (array[j] < min) {
                    pos = j;
                    min = array[j];
                }
            }
            array[pos] = array[i];
            array[i] = min;
        }
        System.out.println(Arrays.toString(array));
    }

    public static void revSort(int[] array)
    {
        for (int i = array.length - 1; i >= 0; i--) {
            int pos = i;
            int max = array[i];

            for (int j = i - 1; j >= 0; j--) {
                if (array[j] < max) {
                    pos = j;
                    max = array[j];
                }
            }
            array[pos] = array[i];
            array[i] = max;
        }
        System.out.println(Arrays.toString(array));
    }
}
