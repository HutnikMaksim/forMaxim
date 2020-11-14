package by.it.hutnik.jd00_01_my_tests.tasks_from_UPIT;

import java.util.Scanner;

/* Имеются два дома размерами a на b и c на d. Имеется участок размером e на f.
Проверить, помещаются ли эти дома на данном участке.
Стороны домомв параллельны сторонам участка, в остальном размещение может быть любым.
 */
public class Task10 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int a1 = scanner.nextInt();
        int b1 = scanner.nextInt();
        int c2 = scanner.nextInt();
        int d2 = scanner.nextInt();
        int e3 = scanner.nextInt();
        int f3 = scanner.nextInt();

        if (((a1 + c2) > e3 && ((b1 > f3) || (d2 > f3)))
                || ((a1 + c2) > f3 && ((b1 > e3) || (d2 > e3)))
                || ((a1 + d2) > e3 && ((b1 > f3) || (c2 > f3)))
                || ((a1 + d2) > f3 && ((b1 > e3) || (c2 > e3)))
                || ((b1 + c2) > e3 && ((a1 > f3) || (d2 > f3)))
                || ((b1 + c2) > f3 && ((a1 > e3) || (d2 > e3)))
                || ((b1 + d2) > e3 && ((a1 > f3) || (c2 > f3)))
                || ((b1 + d2) > f3 && ((a1 > e3) || (c2 > e3)))){
            System.out.println("Размещение домов на данном участке невозможно!");
        } else System.out.println("Размещение возможно!");

    }
}
