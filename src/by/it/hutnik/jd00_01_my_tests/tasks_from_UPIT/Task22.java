package by.it.hutnik.jd00_01_my_tests.tasks_from_UPIT;

import java.util.Scanner;

/* Создать переменную для массива из 10 элементов. Заполнить его произвольными значениями целочисленного типа.
Вывести на экран, перевернуть и снова вывести на экран (при переворачивании нежелательно создавать ещё один массив).
 */
public class Task22 {
    static void reversArray (int [] arr){
        int tmp = 0;
        for (int i = arr.length - 1, j = 0; i >= arr.length / 2;j++, i--) {
            tmp = arr[j];
            arr[j] = arr[i];
            arr[i] = tmp;
        }
    }

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.print("Введите длину массива : ");
        int m = scanner.nextInt();

        int [] arr = new int[m];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) (Math.random() * 9 + 1);
        }

        System.out.println("Массив заданный:");
        for (int i:
             arr) {
            System.out.print(i + " ");
        }

        System.out.println();

        reversArray(arr);
        System.out.println("Массив перевёрнутый");
        for (int i :
            arr) {
            System.out.print(i + " ");
        }
        System.out.println();
    }
}
