package by.it.hutnik.jd00_01_my_tests;

import java.time.*;

public class Chess {
    private static Object DayOfWeek;
    private static Object YearMonth;

    public static void main(String[] args) {
        long x = 1;
        for (int i = 0; i < 64; i++) {
            System.out.printf("%s \n", x);
            x = x+x;
        }
        System.out.println(MonthDay.now());
    }
}
