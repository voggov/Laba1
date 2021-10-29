import com.google.common.base.Stopwatch;

import java.util.logging.Logger;

public class Main {
    public static void main(String[] args) {
        int [] mas = {11, 3, 14, 16, 7, 15, 22};
        BubbleSort bubbleSort = new BubbleSort();
        SelectSort selectSort = new SelectSort();
        InsertSort insertSort = new InsertSort();
        QuickSort quickSort = new QuickSort();
        Stopwatch stopwatch = Stopwatch.createStarted();

       stopwatch.stop();



        stopwatch = Stopwatch.createStarted();
        bubbleSort.sort(mas);
        System.out.println("Время выполнения сортировки пузырьком = " + stopwatch.stop());
        bubbleSort.revSort(mas);



        System.out.println();

        stopwatch = Stopwatch.createStarted();
        selectSort.sort(mas);
        System.out.println("Время выполнения сортировки выбором = " + stopwatch.stop());
        selectSort.revSort(mas);


        System.out.println();

        stopwatch = Stopwatch.createStarted();
        insertSort.sort(mas);
        System.out.println("Время выполнения сортировки вставками = " + stopwatch.stop());
        insertSort.revSort(mas);

        System.out.println();

        stopwatch = Stopwatch.createStarted();
        quickSort.sort(mas,0, mas.length - 1);
        System.out.println("Время выполнения быстрой сортировки = " + stopwatch.stop());
        quickSort.printArr(mas);
        quickSort.revSort(mas,0, mas.length - 1);
        quickSort.printArr(mas);

        System.out.println();


    }
}
