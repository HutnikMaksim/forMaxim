package by.it.hutnik;

import java.util.Scanner;

public class ScalarUnicum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long scalar = scanner.nextInt();
        long start = System.currentTimeMillis();
        long[] mass = new long[(int) scalar];
        boolean flag = false;
        boolean marker = true;
        int k = 1;
        for (long i = 1; i <= scalar; i++) {
            for (long j = 1; j <= i; j++) {
                double x = i % j;
                double y = i / j;
//                if(i % 2 == 0 || i % 5 == 0){
//                    break;
//                }
//                double temp = i % 10;
//                if(i >= 10 && temp == 5){
//                    break;
//                }
                if(x == 0 && y != 1 && y != i){
                    marker = false;
                    break;
                }
                if(x == 0 && y == 1 || y == i){
                    flag = true;
                }

            }
            if(flag == true && marker == true){
                mass[k] = i;
                System.out.printf("%7s",mass[k]);
                if(k % 10 == 0){
                    System.out.println();
                }

                k++;
            }
            flag = false;
            marker = true;

        }
        System.out.println();
        System.out.println(mass[k - 1]);
        long end = System.currentTimeMillis() - start;
        System.out.println(end + " millisecund");
    }
}
