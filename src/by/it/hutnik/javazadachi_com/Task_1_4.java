package by.it.hutnik.javazadachi_com;

import java.util.Scanner;

/*
4. В переменной n хранится натуральное трёхзначное число.
Создайте программу, вычисляющую и выводящую на экран сумму цифр числа n.

 */
class Task_1_4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int scalar = scanner.nextInt();

        while (scalar < 100 || scalar >999){
            System.out.println("Введи трёхзначное натуральное число!");
            scalar = scanner.nextInt();
        }

            int a = scalar % 10;
            int b = (scalar / 10) % 10;
            int c = (scalar / 100) % 10;
            int sum = a + b + c;
            System.out.println("Сумма цифр числа " + scalar + ": " + c + " + " + b + " + " + a + " = " + sum);
    }
}
