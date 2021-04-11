package by.it.hutnik.javazadachi_com;

import java.util.Scanner;

/*
3. В переменной n хранится вещественное число с ненулевой дробной частью.
Создайте программу, округляющую число n до ближайшего целого и выводящую результат на экран.

 */
class Task_1_3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double a = scanner.nextDouble();
        int res = (int) (Math.round(a));
        System.out.println(res);
    }
}
