package by.it.hutnik.refabrishedTasks_AKhmelev.urok01_02;


import java.util.Scanner;

public class TaskB {
    public static void main(String[] args) {
        step1();
        Scanner scanner = new Scanner(System.in);
        int monthN = scanner.nextInt();
        step2(monthN);
        double a = scanner.nextDouble();
        double b = scanner.nextDouble();
        double c = scanner.nextDouble();
        step3(a, b, c);
    }
    static void step1(){
        int x = 1;
        int[][] mas = new int[5][5];
        for (int i = 0; i < mas.length; i++) {
            for (int j = 0; j < mas[i].length; j++) {
                mas[i][j] = x++;
                System.out.print(mas[i][j] + " ");
            }
            System.out.println();
        }
    }

    static void step2(int month){
        switch (month){
            case 1:
                System.out.println("январь");
                break;
            case 2:
                System.out.println("февраль");
                break;
            case 3:
                System.out.println("март");
                break;
            case 4:
                System.out.println("апрель");
                break;
            case 5:
                System.out.println("май");
                break;
            case 6:
                System.out.println("июнь");
                break;
            case 7:
                System.out.println("июль");
                break;
            case 8:
                System.out.println("август");
                break;
            case 9:
                System.out.println("сентябрь");
                break;
            case 10:
                System.out.println("октябрь");
                break;
            case 11:
                System.out.println("ноябрь");
                break;
            case 12:
                System.out.println("декабрь");
                break;
            default:
                System.out.println("нет такого месяца");
        }
    }

    static void step3(double a, double b, double c){
        double d = Math.pow(b, 2) - 4 * a * c;
        if(d > 0){
            double x1 = (-b - (Math.sqrt(d))) / (2.0 * a);
            double x2 = (-b + (Math.sqrt(d))) / (2.0 * a);
            System.out.println(x1 + " " + x2);
        } else if(d == 0){
            double x = -b / (2.0 * a);
            System.out.println(x);
        } else System.out.println("корней нет");
    }
}
