package by.it.hutnik.javazadachi_com;


import java.util.Scanner;

/*
2. Создать программу, которая будет вычислять и выводить на экран сумму двух целых чисел, введённых пользователем.
Если пользователь некорректно введёт хотя бы одно из чисел, то сообщать об ошибке.
 */
class Task_5_2 {
    public static void main(String[] args) {
        Scanner scaner = new Scanner(System.in);
        int a = 0, b = 0, c = 0;
        if(scaner.hasNextInt()) {
            a = scaner.nextInt();
        } if(scaner.hasNextInt()) {
            b = scaner.nextInt();
            c = a + b;
            System.out.println(c);
        } else System.out.println("Enter error");
    }
}
