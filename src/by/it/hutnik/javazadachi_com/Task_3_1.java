package by.it.hutnik.javazadachi_com;

import java.util.Random;

/*
1. Создайте программу, которая будет генерировать и выводить на экран вещественное
псевдослучайное число из промежутка [-3;3).

 */
class Task_3_1 {
    public static void main(String[] args) {
        Random rnd = new Random();

        for (int i = 1; i < 100; i++) {
            float f = (float) rnd.nextFloat() * 6 - 3;
            System.out.printf("%10.6f ", f);
            if(i % 10 == 0){
                System.out.println();
            }
        }
    }
}
