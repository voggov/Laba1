public class BlockCheme {
    public static int func(int a, int b) {
        int c, i;
        if (b > 0) {
            i = 1;
            c = 1;


            while (i <= b) {
                c *= a;
                i++;
            }
            return c;

        } else if (b == 0) {
            c = 1;
            return c;
        } else {
            i = 1;
            c = 1;
            while(i <= Math.abs(b)) {
                    c *= a;
                    i++;
            }
            c /= c;
            return c;


        }
    }
    public static void main(String[] args) {
        int a = 3,b = 4;
        System.out.println(func(a,b));
    }
}
