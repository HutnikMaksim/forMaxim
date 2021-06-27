package by.it.training;

import java.util.Scanner;

class Factorial {
    public static void main(String[] args) {
        long sum = 1;
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        for(int i = 1; i <= n; i++) {
            sum *= i;
            System.out.println(i + "\t" + sum);
        }
    }
}
