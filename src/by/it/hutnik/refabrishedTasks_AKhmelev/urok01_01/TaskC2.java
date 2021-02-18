package by.it.hutnik.refabrishedTasks_AKhmelev.urok01_01;

import java.util.Scanner;

public class TaskC2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ввод:");
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        System.out.println("Вывод:");
        int sum = a + b;
        System.out.printf("%s%d+%d=%d%n", "DEC:", a, b, sum);
        System.out.printf("%s%s+%s=%s%n", "BIN:", String.format("%4s", Integer.toBinaryString(a)).replace(' ','0'),
                                                    String.format("%4s", Integer.toBinaryString(b)).replace(' ','0'),
                                                    String.format("%4s", Integer.toBinaryString(sum)).replace(' ','0'));
        System.out.printf("%s%x+%x=%x%n", "HEX:", a, b, sum);
        System.out.printf("%s%o+%o=%o%n", "OCT:", a, b, sum);
    }
}
