import java.util.Arrays;

public class BubbleSort {

    public void sort(int[] arr){



        boolean isSorted = false;
        int buf;
        while(!isSorted) {
            isSorted = true;
            for (int i = 0; i < arr.length-1; i++) {
                if(arr[i] > arr[i+1]){
                    isSorted = false;

                    buf = arr[i];
                    arr[i] = arr[i+1];
                    arr[i+1] = buf;
                }
            }
        }
        System.out.println(Arrays.toString(arr));
    }

    public void revSort(int[] arr)
    {
        boolean isSorted = false;
        int buf;
        while(!isSorted) {
            isSorted = true;
            for (int i = arr.length-1; i > 0; i--) {
                if(arr[i] > arr[i-1]){
                    isSorted = false;

                    buf = arr[i];
                    arr[i] = arr[i-1];
                    arr[i-1] = buf;
                }
            }
        }
        System.out.println(Arrays.toString(arr));

    }
}
