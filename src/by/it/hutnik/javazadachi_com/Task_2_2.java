package by.it.hutnik.javazadachi_com;

import java.util.Scanner;

/*
2. Создать программу, выводящую на экран ближайшее к 10 из двух чисел, записанных в переменные m и n.
Например, среди чисел 8,5 и 11,45 ближайшее к десяти 11,45.

 */
class Task_2_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
//        double a = scanner.nextDouble();
//        double b = scanner.nextDouble();
        double a = 8.5;
        double b = 11.45;
        double resA = Math.abs(a - 10);
        double resB = Math.abs(b - 10);
        if(resA == resB){
            System.out.println("Число " + a + " и " + b + " равноудалены от 10");
        } else if(resA < resB){
            System.out.println("Число " + a + " ближе к 10, чем " + b);
        } else{
            System.out.println("Число " + b + " ближе к 10, чем " + a);
        }
    }
}
