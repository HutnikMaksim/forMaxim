package by.it.hutnik.jd00_01_my_tests.tasks_from_UPIT;

import java.util.Scanner;

/* Создать пременную для массива из 10 элементов (другим способом).
заполнить его произвольными значениями целочисленного типа и вывести на экран элементы,
стоящие на чётных позициях.
 */
public class Task19 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int arr = scanner.nextInt();
        int[] mass = new int[arr];
        for (int i = 0; i < mass.length; i++) {
            mass[i] = (int) (Math.random() * 10 + 1);

            if (i % 2 == 0){
                System.out.println("Чётный элемент массива = " + mass[i]);
            } else
                System.out.println("Элемент массива №_" + mass[i]);

        }
    }
}
