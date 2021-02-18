package by.it.hutnik.javazadachi_com;

import java.util.Scanner;

/*
3. В три переменные a, b и c записаны три вещественных числа. Создать программу, которая будет находить
и выводить на экран вещественные корни квадратного уравнения ax²+bx+c=0, либо сообщать, что корней нет.

 */
public class Task_2_3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double a = scanner.nextDouble();
        double b = scanner.nextDouble();
        double c = scanner.nextDouble();
        double d = Math.pow(b, 2) - 4 * a * c;
        if(d > 0){
            double x1 = (-b - (Math.sqrt(d))) / (2.0 * a);
            double x2 = (-b + (Math.sqrt(d))) / (2.0 * a);
            System.out.println("Уравнение имеет два корня " + x1 + " и " + x2);
        } else if(d == 0){
            double x = -b / (2.0 * a);
            System.out.println("Уравнение имеет один корень " + x);
        } else System.out.println("Корней нет!");
    }
}
