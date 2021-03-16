package by.it.hutnik.javazadachi_com;

import java.util.Arrays;
import java.util.Scanner;

/*
Пользователь должен указать с клавиатуры чётное положительное число, а программа должна создать массив
указанного размера из случайных целых чисел из [-5;5] и вывести его на экран в строку. После этого программа
должна определить и сообщить пользователю о том, сумма модулей какой половины массива больше: левой или правой,
либо сообщить, что эти суммы модулей равны. Если пользователь введёт неподходящее число, то программа должна
требовать повторного ввода до тех пор, пока не будет указано корректное значение.
 */
public class Task_6_11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a;
        int countLeft = 0;
        int countRight = 0;
        if(scanner.hasNextInt()) {
            do {
                a = scanner.nextInt();
                if (a % 2 != 0 || a < 1) {
                    System.out.print("Value not mod 2, enter new value: ");
                }
            }
            while (a % 2 != 0 || a < 1);

            int[] mass = new int[a];
            for (int i = 0; i < a; i++) {
                mass[i] = (int) (Math.random() * 11 - 5);
            }
            System.out.print(Arrays.toString(mass));
            for (int i = 0; i < a / 2; i++) {
                countLeft += (Math.abs(mass[i]));
            }
            for (int i = a / 2; i < a; i++) {
                countRight += (Math.abs(mass[i]));
            }
            System.out.println();
            if (countLeft > countRight) {
                System.out.println("Left more...");
            } else {
                if (countRight > countLeft) {
                    System.out.println("Right more...");
                } else {
                    System.out.println("Left = Right");
                }
            }
        }else{
            System.out.println("Enter correctly value!");
        }

    }
}
