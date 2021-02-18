package by.it.hutnik.jd00_01_my_tests.tasks_from_UPIT;

import java.text.NumberFormat;
import java.util.Scanner;

public class OGZ {
    public static void main(String[] args) {
        long time = System.currentTimeMillis();
//        Scanner scanner=new Scanner(System.in);
//        System.out.println("Введите Х точки А");
//        double xA = scanner.nextInt();
//        System.out.println("Введите Y точки А");
//        double yA = scanner.nextInt();
//        System.out.println("Введите Х точки В");
//        double xB = scanner.nextInt();
//        System.out.println("Введите Y точки В");
//        double yB = scanner.nextInt();
        double xA = 13461;
        double yA = 34613;
        double xB = 11304;
        double yB = 33036;
        double r = 0;
        double d = 0;
        double dX = xB - xA;
        double dY = yB - yA;

        if (dX == 0){
            r = (Math.atan (Math.toRadians(0)));
        } else {
            double res = dY / dX;
            r = (Math.toDegrees(Math.atan(res)));
        }

        if (dX >= 0 && dY >= 0){
            r = (Math.abs(r));
        }
        if (dX < 0 && dY >= 0){
            r = 180 - (Math.abs(r));
        }
        if (dX < 0 && dY < 0){
            r = (Math.abs(r)) + 180;
        }
        if (dX >= 0 && dY < 0){
            r = 360 - (Math.abs(r));
        }
        if (r <= 45){
            d = dX / (Math.cos(Math.toRadians(r)));
        } else {
            d = dY / (Math.sin(Math.toRadians(r)));
        }
        double aBig = (int) r / 6; // Большие деления угломера
        double aSmall = Math.round(((r / 6.0) - aBig) * 100); // Малые деления угломера
        if (aSmall == 100){
            aBig += 1;
            aSmall = 0;
        }

        System.out.printf("%s%-2.0f%s%02.0f", "Дирекционный угол на точку B = ",aBig, "-", aSmall);
        System.out.println();
        System.out.printf("%s%-1.0f%-1s", "Дальность до точки B = ", d, " м");

        System.out.println();

        long timeFinish = System.currentTimeMillis() - time;
        System.out.println("Time process: " + timeFinish + " ms");
    }
}
