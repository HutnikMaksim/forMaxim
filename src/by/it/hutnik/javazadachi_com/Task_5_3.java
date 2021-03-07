package by.it.hutnik.javazadachi_com;

import java.util.Scanner;

/*
3. Создать программу, которая будет выводить на экран меньшее по модулю из трёх введённых пользователем
вещественных чисел.
 */
public class Task_5_3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double a = 0.0;
        double b = 0.0;
        double c = 0.0;
        double temp = 0.0;
        if(scanner.hasNextDouble()) {
            a = scanner.nextDouble();
        } if(scanner.hasNextDouble()) {
            b = scanner.nextDouble();
        } if(scanner.hasNextDouble()){
            c = scanner.nextDouble();
        } else {
            System.out.println("Error");
            System.exit(-1);

        }

        if((Math.abs(a)) <= (Math.abs(b))){
            temp = a;
        } else temp = b;
        if(temp <= (Math.abs(c))){
        } else temp = c;
        System.out.println("Your result = " + temp);
    }
}
