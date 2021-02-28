package by.it.hutnik.javazadachi_com;

import java.util.Scanner;

/*
Создайте программу, вычисляющую факториал натурального числа n, которое пользователь введёт с клавиатуры.
 */
public class Task_4_7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        long fac = 1;
        for (int i = 1; i <= x; i++) {
            fac *= i;
            System.out.print(fac + " ");
        }
    }
}
