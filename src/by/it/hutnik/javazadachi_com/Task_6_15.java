package by.it.hutnik.javazadachi_com;

import java.util.Arrays;

/*
Создать двумерный массив из 5 строк по 8 столбцов в каждой из случайных целых чисел из отрезка [-99;99].
Вывести массив на экран. После на отдельной строке вывести на экран значение максимального элемента этого
массива (его индекс не имеет значения).
 */
public class Task_6_15 {
    public static void main(String[] args) {
        int[][] mass = new int[5][8];
        int maxValue = 0;
        int row = 0;
        int col = 0;
        for (int i = 0; i < mass.length; i++) {
            for (int j = 0; j < mass[i].length; j++) {
                mass[i][j] = (int)(Math.random() * 199 - 99);
                if(mass[i][j] > maxValue){
                    maxValue = mass[i][j];
                    row = i + 1;
                    col = j + 1;
                }
            }
        }
        for (int[] x : mass){
            System.out.println(Arrays.toString(x));
        }
        System.out.println("Maximum value in the arrays is: (" + maxValue + ") row = " + row + " col = " + col);
    }
}
