package by.it.hutnik.javazadachi_com;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class ArraySorted {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        List<Integer> mass = new ArrayList<>();
        for (int i = 0; i < x; i++) {
            int a = (int) (Math.random() * 100 - 50);
            mass.add(a);
        }
        System.out.print(mass);
        Collections.sort(mass);
        System.out.println();
        System.out.print(mass);
        System.out.println();
        Collections.reverse(mass);
        System.out.print(mass);
    }

}
