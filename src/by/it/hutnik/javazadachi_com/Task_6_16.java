package by.it.hutnik.javazadachi_com;

import java.util.Arrays;

/*
Cоздать двумерный массив из 7 строк по 4 столбца в каждой из случайных целых чисел из отрезка [-5;5].
Вывести массив на экран. Определить и вывести на экран индекс строки с наибольшим по модулю произведением элементов.
Если таких строк несколько, то вывести индекс первой встретившейся из них.
 */
class Task_6_16 {
    public static void main(String[] args) {
        int temp = 1;
        int value = 0;
        int maxValue = 0;
        int indexRow = 0;
        int[][] mass = new int[7][4];
        for (int i = 0; i < mass.length; i++) {
            for(int j = 0; j < mass[i].length; j++){
                mass[i][j] = (int)(Math.random() * 11 - 5);
                value = mass[i][j];
                temp *= (Math.abs(value));
            }
            if(maxValue < temp){
                maxValue = temp;
                indexRow = i;
            }
            temp = 1;

        }
        for (int[] x : mass){
            System.out.println(Arrays.toString(x));
        }
        System.out.println("Index maximum values row: " + (indexRow) + " multi = " + maxValue);
    }
}
