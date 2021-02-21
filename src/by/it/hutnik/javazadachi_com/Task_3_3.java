package by.it.hutnik.javazadachi_com;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

/*
3. В переменные a и b записаны целые числа, при этом b больше a. Создайте программу, которая будет генерировать и
выводить на экран целое псевдослучайное число из отрезка [a;b].
 */
public class Task_3_3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int digit = 0;
        int r = scanner.nextInt();
        int temp = 0;
        List<Integer> massive = new ArrayList<>();
        for (int i = 1; i <= r; i++) {
            digit = a + (int) (Math.random() * (b - a + 1));
            System.out.printf("%2d ", digit);
            if(i == 10){
                System.out.println();
            }
                massive.add(digit);
        }
        System.out.println();
        System.out.print(massive);
        System.out.println();
        int last = massive.size() - 1;
        for (int i = 1; i <= last; i++) {
            if (massive.get(i) > massive.get(i + 1)) {
                temp = massive.get(i);
                massive.set(i, massive.get(i + 1));
                massive.set(i + 1, temp);

                // massive.set(i + 1, massive.get(i));

            }
        }
        //Arrays.sort(massive.toArray());

            System.out.println(massive);

    }
}
