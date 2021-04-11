package by.it.hutnik.javazadachi_com;

import java.util.Scanner;

/*
1. Создать программу, которая будет сообщать, является ли целое число, введённое пользователем,
чётным или нечётным. Если пользователь введёт не целое число, то сообщать ему об ошибке.
 */
class Task_5_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        if(scanner.hasNextInt()){
            if(scanner.nextInt() % 2 == 0){
                System.out.println("Введённое число чётное!");
            } else System.out.println("Введённое число нечётное");
        } else System.out.println("Введено некорректное значение");
    }
}
