import java.util.concurrent.TimeUnit;

public class Factorial {
    public static int factCikl(int iskChislo){
        int n = iskChislo;
        if (iskChislo > 0) {
            while (n > 1) {
                iskChislo *= (n - 1);
                n--;
            }
            return iskChislo;
        }else {
            System.out.print("Ошибка ");
        }
        return 0;
    }
    public static int factRec(int iskChislo){
        if (iskChislo > 1) {
            int res = iskChislo;
            return (res *= factRec(iskChislo - 1));
        }else if (iskChislo < 1){
            System.out.print("Ошибка ");
            return 0;
        } else {
            return 1;
        }
    }

    public static void main(String[] args) {
        long startTime = System.nanoTime();
        for (int i = 0; i < 200; i++)
        {
            System.out.print(1);
        }
        System.out.println(" ");
        System.out.print(factCikl(1));
        long endTime = TimeUnit.NANOSECONDS.toMillis(System.nanoTime() - startTime);
        System.out.println(" - (cikl Total exe time = " + (endTime) + "ms)");


        long startTime2 = System.nanoTime();
        for (int i = 0; i < 200; i++)
        {
            System.out.print(1);
        }
        System.out.println(" ");
        System.out.print(factRec(1));
        long endTime2 = TimeUnit.NANOSECONDS.toMillis(System.nanoTime() - startTime2);
        System.out.println(" - (rek Total exe time = " + (endTime2) + "ms)");

    }
}
