package by.it.hutnik.javazadachi_com;
/*
Программа должна создать массив из 12 случайных целых чисел из отрезка [-10;10] таким образом,
чтобы отрицательных и положительных элементов там было поровну и не было нулей. При этом порядок
следования элементов должен быть случаен (т. е. не подходит вариант, когда в массиве постоянно
выпадает сначала 6 положительных, а потом 6 отрицательных чисел или же когда элементы постоянно
чередуются через один и пр.). Вывести полученный массив на экран.
 */
import java.util.Arrays;
import java.util.Scanner;

public class Task_6_12 {
    public static void main(String[] args) {
        int[] mass = new int[12];
        int value;
        int plusValue = 0;
        int minusValue = 0;
        int j = 0;
        for (int i = 0; i < 1000; i++) {
            value = (int) (Math.random() * 21 - 10);
            if (value != 0) {
                if (value > 0) {
                    plusValue++;
                    if (plusValue < 7) {
                        mass[j] = value;
                        j++;
                    }
                }
                if (value < 0) {
                    minusValue++;
                    if (minusValue < 7) {
                        mass[j] = value;
                        j++;
                    }
                }
                if(plusValue == 7 && minusValue == 7) break;
            }

        }
        System.out.print(Arrays.toString(mass));
    }
}
