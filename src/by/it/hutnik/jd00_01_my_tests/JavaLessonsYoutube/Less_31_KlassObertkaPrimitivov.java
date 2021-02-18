package by.it.hutnik.jd00_01_my_tests.JavaLessonsYoutube;

public class Less_31_KlassObertkaPrimitivov {
    public static void main(String[] args) {

        int x = 11;
        double d = 123;
        String s = "3545645";
        int y = -3;
        System.out.println("x = " + x);
        System.out.println("d = " + d);
        Integer i = new Integer(565655);
        i.hashCode();
        System.out.println("i = " + i);
        System.out.println("x = " + x);
        Integer.parseInt(s);
        System.out.println("s = " + s);
        System.out.println(Integer.MAX_VALUE);
        System.out.println(Integer.max(x,y));
        System.out.println(Integer.bitCount(x));
        System.out.println(Integer.reverse(y));
    }
}
