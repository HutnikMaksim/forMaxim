package by.it.hutnik.javazadachi_com;

import java.util.Scanner;

/*
4. Создать программу, которая будет проверять попало ли случайно выбранное из отрезка [5;155]
целое число в интервал (25;100) и сообщать результат на экран.
 */
public class Task_2_4 {
    public static void main(String[] args) {
        for (int i = 1; i <= 40; i++) {
            int a = (int) (Math.random() * 150 + 5);
            System.out.printf("%5d ", a);
            if(a >=25 && a <= 100){
                System.out.print("Да  ");
            } else{
                System.out.print("Нет ");
            }
            if(i % 10 == 0){
                System.out.println();
            }
        }
    }
}
