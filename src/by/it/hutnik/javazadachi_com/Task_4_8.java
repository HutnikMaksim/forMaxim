package by.it.hutnik.javazadachi_com;

import java.util.Scanner;

/*
Выведите на экран все положительные делители натурального числа, введённого пользователем с клавиатуры.
 */
class Task_4_8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите целое число: ");
        if(scanner.hasNextInt()){
            int x = scanner.nextInt();
                for (int i = 1; i <= x; i++) {
                    if(x % i == 0){
                        System.out.println("Положительным делителем числа " + x + " является: " + i + " ");
                    }
                }
        } else {
            System.out.print("Введены некорректные данные!");
        }
    }
}
