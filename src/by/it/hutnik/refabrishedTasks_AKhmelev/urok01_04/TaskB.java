package by.it.hutnik.refabrishedTasks_AKhmelev.urok01_04;

/* B1. Введите с консоли число людей n (nextInt() в сканере).
 Затем введите одномерный массив их фамилий (next() в сканере).
 Введите двумерный массив их зарплат за 4 квартала (N строк и 4 столбца).
 Зарплаты имеют тип int.
 Нужно для каждой фамилии выводить подсказку
 После подсказки можно через пробел вводить с консоли 4 цифры зарплат по кварталам (nextInt() в
сканере).
 Постройте в консоли таблицу доходов людей по кварталам с фамилиями и
итогом за год в последней колонке.
B2. Посчитайте и выведите общую сумму всех выплат и среднеарифметическую
квартальную зарплату с точностью как минимум до 4-го знака. */

import java.util.Scanner;

class TaskB {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите количество работников: ");
        int n = scanner.nextInt();
        String[] name = new String[n];
        int[][] zp = new int[n][4];
        int itogo = 0;
        int vsego = 0;
        double average;
        System.out.println("Введите фамилии работников:");
        for (int i = 0; i < n; i++) {
            name[i] = scanner.next();
        }
            for (int j = 0; j < zp.length; j++) {
                System.out.println("Введите зарплату для " + name[j]);
                for (int k = 0; k < zp[0].length; k++) {
                    zp[j][k] = scanner.nextInt();
                }
            }
        showTire();
        System.out.printf("%-9s %-10s %-10s %-10s %-10s %-7s", "Фамилия", "Квартал1", "Квартал2", "Квартал3", "Квартал4", "Итого");
        System.out.println();
        showTire();
        for (int i = 0; i < zp.length; i++) {
            System.out.printf("%-9s ", name[i]);
            for (int j = 0; j < zp[0].length; j++) {
                System.out.printf("%-10d ", zp[i][j]);
                itogo += zp[i][j];
            }
            vsego += itogo;
            System.out.printf("%-7d", itogo);
            System.out.println();
            itogo = 0;
        }
        showTire();
        System.out.println("Итого: " + vsego);
        average = vsego / (n * 4.0);
        System.out.println("Средняя: " + average);

    }
    static void showTire(){
        for (int i = 0; i < 60; i++) {
            System.out.print("-");
        }
        System.out.println();
    }
}
