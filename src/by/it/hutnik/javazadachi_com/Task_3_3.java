package by.it.hutnik.javazadachi_com;

import java.util.Scanner;

/*
3. В переменные a и b записаны целые числа, при этом b больше a. Создайте программу, которая будет генерировать и
выводить на экран целое псевдослучайное число из отрезка [a;b].
 */
public class Task_3_3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        for (int i = 0; i < 100; i++) {
            int digit = (int) Math.random() * (b - a) + a;
            System.out.print(digit + " ");
        }

    }
}
