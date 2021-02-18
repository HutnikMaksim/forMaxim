package by.it.hutnik.refabrishedTasks_AKhmelev.urok01_02;

import java.util.Scanner;

public class TaskA {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] arr = new int[10];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = scanner.nextInt();
        }
        step1(arr);
        step2(arr);
        step3(arr);
    }
    static void step1(int[] arr){
        int min = arr[0];
        int max = arr[0];
        for (int i = 0; i <arr.length; i++) {
            if(min > arr[i]) min = arr[i];
            if(max < arr[i]) max = arr[i];
        }
        System.out.println(min + " " + max);
    }
    static void step2(int[] arr){
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        double average = sum / 10.0;
        System.out.println(average);
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < average) {
                System.out.print(arr[i] + " ");
            }
        }
    }
    static void step3(int[] arr){
        System.out.println();
        int min = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if(min > arr[i]){
                min = arr[i];
            }
        }
        for (int i = arr.length - 1; i >= 0 ; i--) {
            if(arr[i] == min){
                int index = i;
                System.out.print(index + " ");
            }
        }
    }
}
