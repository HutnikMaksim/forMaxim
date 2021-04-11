package by.it.hutnik.javazadachi_com;

import java.util.Arrays;

/*
Создайте массив из 4 случайных целых чисел из отрезка [10;99], выведите его на экран в строку.
Определить и вывести на экран сообщение о том, является ли массив строго возрастающей последовательностью.
 */
class Task_6_6 {
    public static void main(String[] args) {
        int[] mass = new int[4];
        for (int i = 0; i < 4; i++) {
            mass[i] = (int)(Math.random() * 90 + 10);
        }
        System.out.println(Arrays.toString(mass));
        if(mass[0] < mass[1] & mass[1] < mass[2] & mass[2] < mass[3]){
            System.out.println("Последовательность строго возрастающая!");
        }
    }
}
