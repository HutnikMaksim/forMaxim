package by.it.hutnik.jd00_01_my_tests.tasks_from_UPIT;

import java.util.Scanner;

import static java.lang.Math.*;

public class PGZ {
    public static void main(String[] args) {
//        Scanner scanner=new Scanner(System.in);
//        System.out.println("Введите координату точки А - Хa:");
//        int xA = scanner.nextInt();
//
//        System.out.println("Введите координату точки А - Ya:");
//        int yA = scanner.nextInt();
//
//        System.out.println("Введите дальность до точки В - d:");
//        int d = scanner.nextInt();
//
//        System.out.println("Введите дирекционный угол на точку В - a:");
//        double a = scanner.nextDouble();
        int xA = 36366;
        int yA = 86349;
        int d = 317;
        double a = 45.00; //46.39
        int kX = 0;
        int kY = 0;
        if ((a > 0) && (a <= 15)){
            a = a * 6;
            kX = 1;
            kY = 1;
        }
        if ((a > 15) && (a <= 30)){
            a = 180 - a * 6;
            kX = -1;
            kY = 1;
        }
        if ((a > 30) && (a < 45)){
            a = a * 6 - 180;
            kX = -1;
            kY = -1;
        }
        if ((a >= 45) && (a <= 60)){
            a = 360 - a * 6;
            kX = 1;
            kY = -1;
        }
        double dX = kX * d * (Math.cos(Math.toRadians(a)));
        double dY = kY * d * (Math.sin(Math.toRadians(a)));
        int xB = xA + (int) dX;
        int yB = yA + (int) dY;
        System.out.println((int) dX);//+83
        System.out.println((int) dY);//-306
        System.out.println("Xb = " + xB);//36449
        System.out.println("Yb = " + yB);//86043
    }
}
