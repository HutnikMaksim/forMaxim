package by.it.hutnik.javazadachi_com;

import java.util.Scanner;

/*1. В переменных q и w хранятся два натуральных числа. Создайте программу, \
выводящую на экран результат деления q на w с остатком.
Пример вывода программы (для случая, когда в q хранится 21, а в w хранится 8):

21 / 8 = 2 и 5 в остатке

 */
class Task_1_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int q = scanner.nextInt();
        int w = scanner.nextInt();
        int res = q / w;
        int ostatok = q % w;
        System.out.println(q + " / " + w + " = " + res + " и " + ostatok + " в остатке");
    }
}
