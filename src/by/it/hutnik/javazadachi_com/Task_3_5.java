package by.it.hutnik.javazadachi_com;

import java.util.Scanner;

/*
5. В переменных a и b лежат положительные длины катетов прямоугольного треугольника.
Вычислить и вывести на экран площадь треугольника и его периметр.
 */
class Task_3_5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double a = scanner.nextDouble();
        double b = scanner.nextDouble();
        double c = (Math.sqrt((a * a) + (b * b)));
        System.out.printf("Гипотенуза = %.2f \n", c);
        double abc = a + b + c;
        System.out.printf("Периметр = %.2f \n", abc);
        double cba = (a * b) / 2;
        System.out.printf("Площадь = %.2f \n", cba);
    }
}
