package by.it.hutnik.javazadachi_com;

import java.util.Arrays;

/*
Создайте 2 массива из 5 случайных целых чисел из отрезка [0;5] каждый, выведите массивы на экран
в двух отдельных строках. Посчитайте среднее арифметическое элементов каждого массива и сообщите,
для какого из массивов это значение оказалось больше (либо сообщите, что их средние арифметические равны).
 */
public class Task_6_5 {
    public static void main(String[] args) {
        int[] mass1 = new int[5];
        double averageMass1 = 0;
        int[] mass2 = new int[5];
        double averageMass2 = 0;
        double result = 0;
        for (int i = 0; i < 5; i++) {
            mass1[i] = (int)(Math.random() * 5);
            averageMass1 += mass1[i];
            mass2[i] = (int)(Math.random() * 5);
            averageMass2 += mass2[i];
        }
        System.out.println(Arrays.toString(mass1));
        System.out.println(Arrays.toString(mass2));
        averageMass1 /= 5;
        System.out.println(averageMass1);
        averageMass2 /= 5;
        System.out.println(averageMass2);
        if(averageMass1 > averageMass2){
            result = averageMass1;
            System.out.println("Среднее значение первого массива больше");
        } else {
            if(averageMass1 < averageMass2){
                result =averageMass2;
                System.out.println("Среднее значение второго массива больше");
            } else System.out.println("Средние значения обоих массивов равны");
        }
    }
}
