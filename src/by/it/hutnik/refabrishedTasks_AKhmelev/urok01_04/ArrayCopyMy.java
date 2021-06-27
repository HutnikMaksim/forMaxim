package by.it.hutnik.refabrishedTasks_AKhmelev.urok01_04;

import java.util.Scanner;

class ArrayCopyMy {
    static int[] pasteMass(int n){
        int[] mass = new int[n];
        for (int i = 0; i < mass.length; i++) {
            mass[i] = (int) (Math.random() * 12) + 1;
            System.out.print(mass[i] + " ");
        }
        return mass;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        pasteMass(num);
    }
}
