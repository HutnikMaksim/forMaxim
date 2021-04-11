package by.it.hutnik.javazadachi_com;

import java.util.Scanner;

/*
1. Создать программу, проверяющую и сообщающую на экран,
является ли целое число записанное в переменную n, чётным либо нечётным.
 */
class Task_2_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        if(a % 2 == 0){
            System.out.println("Введённое число чётное!");
        } else System.out.println("Введённое число НЕчётное!");
    }
}
