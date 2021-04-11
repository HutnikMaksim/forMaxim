package by.it.hutnik.javazadachi_com;

import java.util.Random;
import java.util.Scanner;

/*
2. Натуральное положительное число записано в переменную n. Создайте программу,
которая будет генерировать и выводить на экран целое псевдослучайное число из отрезка [-n;n].
 */
class Task_3_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        for (int i = 1; i <= 40; i++) {
            int digit = (int) (Math.random() * (n * 2 + 2) - Math.round(n + 1));
            System.out.print(digit + " ");
        }
    }
}
