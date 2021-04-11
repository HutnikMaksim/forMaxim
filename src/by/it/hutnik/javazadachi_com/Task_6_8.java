package by.it.hutnik.javazadachi_com;

import java.util.Arrays;

/*
Создайте массив из 12 случайных целых чисел из отрезка [-15;15].
Определите какой элемент является в этом массиве максимальным и сообщите индекс
его последнего вхождения в массив.
 */
class Task_6_8 {
    public static void main(String[] args) {
        int[] mass = new int[12];
        int temp = -15;
        int result = 0;
        int max = mass.length - 1;
        for (int i = 0; i < mass.length; i++) {
            int digit = (int)(Math.random() * 31 - 15);
            mass[i] = digit;
        }
        System.out.println(Arrays.toString(mass));
        for (int i = 0; i < mass.length; i++) {
            if(temp <= mass[i]){
                temp = mass[i];
                result = i;
            }
        }
        System.out.println("Индекс максимального числа (" + temp + ") находящегося ближе к концу = " + result);
    }
}
