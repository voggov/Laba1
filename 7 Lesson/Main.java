import java.util.*;
import com.google.common.base.Stopwatch;


public class Main {
    public static void main(String[] args) {
        ArrayList arrayList = new ArrayList();
        arrayList.add("один");
        arrayList.add("два");
        arrayList.add("один");
        System.out.println("До обработки: " + arrayList);
        System.out.println("После обработки: " + notDubliacte(arrayList));
        LinkedList linkedList = new LinkedList();
        ArrayList arrayList1 = new ArrayList();

        System.out.println("\n////////////////////////////\n");

        for (Integer i = 0; i < 20000; i++) {
            linkedList.add(i.toString());
            arrayList1.add(i.toString());
        }
        Stopwatch stopwatch = Stopwatch.createStarted();
        chooseElement(linkedList);
        System.out.println(stopwatch.stop() + " :Linklist");
        Stopwatch stopwatch1 = Stopwatch.createStarted();
        chooseElement(arrayList1);
        System.out.println(stopwatch1.stop() + " :ArrayList");

    }

    public static void chooseElement(List list) {
        for (int i = 0; i < 20000; i++){
            list.get((int)(Math.random() * 20000));
        }
    }

    public static <E extends Collection<Object>> E notDubliacte(E collections) {
        Set<Object> collectionNotDublicate = new HashSet<>(collections);
        collections.clear();
        collections.addAll(collectionNotDublicate);
        return collections;
    }
}

