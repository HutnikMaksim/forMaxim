package by.it.hutnik.refabrishedTasks_AKhmelev.urok01_05;

import java.util.Arrays;

class Test {
    public static void main(String[] args) {
        String txt = "0123456789";
        System.out.println(txt);
        int n = 3;
        int m = 7;
        double d =12323.34;
        String text;
        int[] mass = new int[] {1,2,3,4,5,6,7,8,0};
        String str = txt.substring(n, m); // вырезать m символов (9) из строки txt. Первых n (3) пропускаем
        System.out.println(str); // результат 3456
        str = txt.substring(n); // вырезать всё, что идет после n символа (3)
        System.out.println(str); // результат 3456789
        text = Arrays.toString(mass);
        System.out.println(text);
        String s = str.concat(txt + " "); // тоже самое что и str + txt
        s = s.repeat(3);
        System.out.println(s);

        String[] t = new String[5];
        char c = 49;
        String ccc = "";
        for(int i = 0; i < t.length; i++) {
            t[i] = "test" + c;
            c++;
            ccc = t[i];
            ccc = new String("da " + c + " " + c);
            t[i] = ccc;
            System.out.println(t[i]);
            System.out.println("***********");
            System.out.println(ccc);
        }
        t[2] += " ghhjjjjk";
        t[1] += " fuck off";
        System.out.println(t[2] + " " + t[1]);
    }
}
