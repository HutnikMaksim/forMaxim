package by.it.hutnik.javazadachi_com;

import java.util.Arrays;
import java.util.Scanner;

/*
Пользователь вводит с клавиатуры натуральное число большее 3, которое сохраняется в переменную n.
Если пользователь ввёл не подходящее число, то программа должна просить пользователя повторить ввод.
Создать массив из n случайных целых чисел из отрезка [0;n] и вывести его на экран.
Создать второй массив только из чётных элементов первого массива, если они там есть, и вывести его на экран.
 */
class Task_6_13 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n;
        int count = 0;
        if(scanner.hasNextInt()){
            do {
                n = scanner.nextInt();
                if(n < 3){
                    System.out.print("Enter correctly value: ");
                }
            }
            while (n < 3);

        int[] mass = new int[n];
            for (int i = 0; i < n; i++) {
                mass[i] = (int)(Math.random() * n);
                if(mass[i] % 2 == 0){
                    count++;
                }
            }
            System.out.print(Arrays.toString(mass));
        int[] arr = new int[count];
            int j = 0;
            for (int i = 0; i < n; i++) {
                if(mass[i] % 2 == 0){
                    arr[j] = mass[i];
                    j++;
                }
            }
            System.out.println();
            System.out.print(Arrays.toString(arr));



        } else {
            System.out.print("Enter correctly value");
        }
    }
}
