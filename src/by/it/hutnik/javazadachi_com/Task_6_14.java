package by.it.hutnik.javazadachi_com;

import java.util.Arrays;

/*
Создать двумерный массив из 8 строк по 5 столбцов в каждой из случайных целых чисел из отрезка [10;99].
Вывести массив на экран.
 */
class Task_6_14 {
    public static void main(String[] args) {
        int count = 0;
        int row = 8;
        int col = 5;
        int[][] mass = new int[row][col];
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                mass[i][j] = (int)(Math.random() * 90 + 10);
            }
        }
        for(int[] r : mass){
            System.out.println(Arrays.toString(r));
        }
    }
}
