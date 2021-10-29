import java.util.Arrays;

public class InsertSort {

    public void sort(int[] array) {
        for (int i = 1; i < array.length; i++) {
            int current = array[i];
            int j = i - 1;
            while(j >= 0 && current < array[j]) {
                array[j+1] = array[j];
                j--;
            }

            array[j+1] = current;
        }
        System.out.println(Arrays.toString(array));
    }
    public void revSort(int[] mass) {
        for (int i = 1; i < mass.length; i++) {
            int k = mass[i];
            int j;
            for (j = i - 1; j >= 0 && mass[j] <= k; j--) {
                mass[j+1] = mass[j];
            }
            mass[j+1] = k;
        }

        System.out.println(Arrays.toString(mass));
    }
}
