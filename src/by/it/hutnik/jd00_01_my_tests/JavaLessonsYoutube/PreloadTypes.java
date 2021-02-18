package by.it.hutnik.jd00_01_my_tests.JavaLessonsYoutube;

public class PreloadTypes {
    public static void main(String[] args) {

    byte b = 1, b1 = 1 + 3;
    final byte C = 1 + 2;
    b = (byte)(b1 + 4);
    b = C + 3;
    //b = b1 + 6; - ошибка приведения типов, b1 может быть большим и привести к выходу за пределы зачения byte
    //b = -b;
        b = (byte) -b;
    //b = +b;
        b = (byte) +b;
    //b += b;
        final int D = 127;
        b = D;
        final int E = 128;
        //b = E; - ошибка приведения типов, поскольку Е больше максимального byte
        b = (byte) E; //придаёт b следующее значение byte (если достиг максимального, то начинает с минимального -128)
        b1 *= 2;
        float f = 1.6f;
        //b1 = f;
        b1 /= f;
        System.out.println(b);
        System.out.println(b1);

    }
}
