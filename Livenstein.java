public class Livenstein {
    public static String livenstain(String str1, String str2)
    {
        char[] mas1 = new char[str2.length()];
       //
        char[] mas2 = str2.toCharArray();
        int count = Math.abs(str2.length() - str1.length());



        if (str1.length() < str2.length())
        {
           // char temp = new char[str2.length()];
            for (int i = (str2.length() - str1.length())-1; i < str2.length(); i++)
            {
                str1 +=" ";

            }
        }
        mas1 = str1.toCharArray();
        for (int i=0; i < str2.length(); i++) {
            if (mas1[i] != mas2[i]) {
                if(mas1[i] != ' ')
                    count++;
                mas1[i] = mas2[i];

            }
        }

        str1 = String.valueOf(mas1);

        return str1 +"("+ count+")";
    }

    public static void main(String[] args) {
        String str = livenstain("hey","hello");
        System.out.println(str);

    }
}
