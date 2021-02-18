package by.it.hutnik.jd00_01_my_tests.tasks_from_UPIT;

import java.util.Scanner;

public class DirUgol {
    public static void main(String[] args) {
//        Scanner scanner=new Scanner(System.in);
//        double a = scanner.nextDouble();
        double a = 303.48498283759;
        double i = a / 6; // 14,744551
        int aBig = (int) i;
        double aSmall = (i - aBig) * 100;
        System.out.printf("%2d%1s%.0f", aBig, "-", aSmall);
    }
}
