package by.it.hutnik.jd00_01_my_tests.tasks_from_UPIT;

import java.text.NumberFormat;

public class FormatDigits {
    public static void main(String[] args) {
        float f = 334 / 7f;
        NumberFormat numberFormat = NumberFormat.getInstance();
        numberFormat.setMaximumFractionDigits(3);
       // f = f - 2;
        System.out.print(numberFormat.format(f));
    }
}
