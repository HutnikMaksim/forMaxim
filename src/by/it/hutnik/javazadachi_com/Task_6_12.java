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

class Task_6_12 {
    public static void main(String[] args) {
        int massLength = 12;
        int[] mass = new int[massLength];
        int value;
        int plusValue = 0;
        int minusValue = 0;
        int j = 0;
        for (int i = 0; i < massLength; i++) {
            value = 10 - (int) (Math.random() * 21);
            if (value != 0) {
                if (value > 0) {
                    plusValue++;
                    if (plusValue <= mass.length / 2) {
                        mass[j] = value;
                        j++;
                    } else {
                        i--;
                        continue;
                    }
                }
                if (value < 0) {
                    minusValue++;
                    if (minusValue <= mass.length / 2) {
                        mass[j] = value;
                        j++;
                    } else {
                        i--;
                        continue;
                    }
                }
                if(plusValue == mass.length + 1 && minusValue == mass.length + 1){
                    break;
                }
            } else {
                i--;
            }

        }
        System.out.print(Arrays.toString(mass));
    }
}
