package by.it.hutnik.javazadachi_com;

import java.util.Arrays;

/*
Создайте массив из 11 случайных целых чисел из отрезка [-1;1], выведите массив на экран в строку.
Определите какой элемент встречается в массиве чаще всего и выведите об этом сообщение на экран.
Если два каких-то элемента встречаются одинаковое количество раз, то не выводите ничего.
 */
class Task_6_10 {
    public static void main(String[] args) {
        int[] mass = new int[11];
        int a = 0;
        int b = 0;
        int c = 0;
        int t = 0;
        int res = 0;
        for (int i = 0; i < mass.length; i++) {
            int digit = 1 - (int)(Math.random() * 3);
            mass[i] = digit;
        }
        System.out.println(Arrays.toString(mass));
        for (int i = 0; i < 11; i++) {
            if(mass[i] == -1){
                a++;
            } else if(mass[i] == 0){
                b++;
            } else c++;
        }
        if(a == b | b == c | c == a){
            System.exit(0);
        }
        if(a > b){
            res = a;
            t = -1;
        } else res = b;
        if(c > res){
            res = c;
            t = 1;
        }
        System.out.println("В данном массиве чаще других (" + res + " раз), встречается цифра " + t);
    }
}
