package by.it.hutnik.javazadachi_com;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
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
        int digit = 0;
        int temp = 0;
        for (int i = 1; i <= 10; i++) {
            digit = a + (int) (Math.random() * (b - a + 1));
            System.out.printf("%-2d ", digit);
            if(i == 10){
                System.out.println();
            }
        }
    }
}
