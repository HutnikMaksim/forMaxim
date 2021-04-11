package by.it.hutnik.jd00_01_my_tests.JavaLessonsYoutube;

import java.util.Date;

class Less_23_PrintF {
    public static void main(String[] args) {
        Date date = new Date();

        System.out.printf("Time: %tc\n", date);
        System.out.printf("Time: %tF\n", date);
        System.out.printf("Time: %tD\n", date);
        System.out.printf("Time: %tT\n", date);
        System.out.printf("Time: %tl\n", date);
        System.out.printf("Time: %tL\n", date);
        System.out.printf("Time: %tZ\n", date);
        System.out.printf("Time: %tz\n", date);
        System.out.printf("Time: %tA\n", date);
        System.out.printf("Time: %tj\n", date);
        System.out.printf("Time: %tB\n", date);
        System.out.printf("Time: %Tp\n", date);
        System.out.printf("Time: %tp\n", date);
        System.out.printf("Time: %tQ\n", date);

        System.out.printf("Test %-10s%010.5f\n", "Coca ", 1.369973);
        System.out.printf("Test %-10s%010.5f\n", "Coca ", 1.369973);
        System.out.printf("Test %10s%-13.7f\n", "Coca ", 1.369973);
        System.out.printf("Test %s%013d\n", "Coca ", 1369973);
        System.out.printf("Test %s%+013.7a\n", "Coca ", 1.369973);
        System.out.printf("Test %s%13c\n", "Coca ", 'j');
        System.out.printf("Test %s\n", "Coca ");

    }
}
