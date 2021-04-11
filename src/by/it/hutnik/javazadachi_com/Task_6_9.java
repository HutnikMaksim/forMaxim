package by.it.hutnik.javazadachi_com;

import by.it.akhmelev.jd01_07.Matrix;

import java.util.Arrays;

/*
Создайте два массива из 10 целых случайных чисел из отрезка [1;9] и третий массив из 10 действительных чисел.
Каждый элемент с i-ым индексом третьего массива должен равняться отношению элемента из первого массива
с i-ым индексом к элементу из второго массива с i-ым индексом. Вывести все три массива на экран
(каждый на отдельной строке), затем вывести количество целых элементов в третьем массиве.

 */
class Task_6_9 {
    public static void main(String[] args) {
        int[] massA = new int[10];
        int[] massB = new int[10];
        double[] massRes = new double[10];
        int count = 0;
        for (int i = 0; i < massA.length; i++) {
            int digitA = (int)(Math.random() * 9 + 1);
            massA[i] = digitA;
            int digitB = (int)(Math.random() * 9 + 1);
            massB[i] = digitB;
            massRes[i] = (double) digitA / digitB;
        }
        System.out.println("1-й массив " + Arrays.toString(massA));
        System.out.println("2-й массив " + Arrays.toString(massB));
        System.out.println("3-й массив " + Arrays.toString(massRes));
        System.out.println();
        for (int i = 0; i < massA.length; i++) {
            if(massRes[i] % 1 == 0){
                System.out.print(massRes[i] + " ");
                count++;
            }
        }
        System.out.println();
        System.out.println("Количество целых элементов в 3-м массиве = " + count);
    }
}
