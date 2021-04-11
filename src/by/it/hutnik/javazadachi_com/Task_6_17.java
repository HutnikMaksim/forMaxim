package by.it.hutnik.javazadachi_com;

import java.util.Arrays;
import java.util.List;

/*
Создать двумерный массив из 6 строк по 7 столбцов в каждой из случайных целых чисел из отрезка [0;9].
Вывести массив на экран. Преобразовать массив таким образом, чтобы на первом месте в каждой строке стоял
её наибольший элемент. При этом изменять состав массива нельзя, а можно только переставлять элементы в
рамках одной строки. Порядок остальных элементов строки не важен (т.е. можно соврешить только одну перестановку,
а можно отсортировать по убыванию каждую строку). Вывести преобразованный массив на экран.
 */
class Task_6_17 {
    public static void main(String[] args) {
        int[][] mass= new int[6][7];
        int maxValue = 0;
        int indexRow = 0;
        int temp;
        for (int i = 0; i < mass.length; i++) {
            for (int j = 0; j < mass[i].length; j++) {
                mass[i][j] = (int)(Math.random() * 10);
            }

        }
        for (int[] x : mass){
            System.out.println(Arrays.toString(x));
        }
        for (int i = 0; i < mass.length; i++) {
            for (int j = 0; j < mass[i].length; j++) {
                if(maxValue < mass[i][j]){
                    maxValue = mass[i][j];
                    indexRow = j;
                }
            }
            temp = mass[i][0];
            mass[i][0] = maxValue;
            mass[i][indexRow] = temp;
            maxValue = 0;
        }
        System.out.println();
        for (int[] x : mass){
            System.out.println(Arrays.toString(x));
        }
    }
}
