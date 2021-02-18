package by.it.hutnik.refabrishedTasks_AKhmelev.urok01_02;

import java.util.Arrays;
import java.util.Scanner;

public class TaskC {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        step2(step3(step1(n)));
        step3(step1(n));


    }

    public static int[][] step1(int n){
        boolean plus;
        boolean minus;
        int[][] arr = new int[n][n];
        do {
            plus = false;
            minus = false;
            for (int i = 0; i < arr.length; i++) {
                for (int j = 0; j < arr[i].length; j++) {
                    arr[i][j] = (int) (Math.random() * (n * 2 + 1)) - n;
                    if (arr[i][j] == -n) minus = true;
                    if (arr[i][j] == n)  plus = true;
                }
            }
        } while (!plus  || !minus );

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.printf("%4s", arr[i][j]);
            }
            System.out.println();
        }
        return arr;
    }

    public static int step2(int[][] arr) {
        int min = 0;
        int max = 0;
        int sum = 0;
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (arr[i][j] > 0) {
                    count++;
                    if (count == 1) {
                        min = j;
                    }
                    if (count == 2) {
                        max = j;
                        for (j = min + 1; j < max; j++) {
                            sum += arr[i][j];
                        }
                        count = 0;
                        break;
                    }
                }
            }
            System.out.printf("%4s %n", sum);
            sum = 0;
            count = 0;
        }
        return sum;
    }

    static int[][] step3(int [][] arr){
        int maxValue = 0;
        boolean flag = false;
        int[] massRow = new int[arr.length];
        int[] massCol = new int[arr[0].length];

        for (int i = 0; i < arr.length; i++) { // перебор матрицы для вычисления максимального значения
            for (int j = 0; j < arr[i].length; j++) {
                if(arr[i][j] > maxValue){
                    maxValue = arr[i][j];
                }
            }
        }

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if(arr[i][j] == maxValue){
                    if(flag == false){
                        massRow[i] = i + 1;
                        flag = true;
                    }
                }
                if(arr[i][j] == maxValue){
                    massCol[j] = j + 1;
                }
            }
            flag = false;
        }

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if(massRow[i] != 0){
                    break;
                }
                if(massCol[j] == 0)
                System.out.printf("%4s", arr[i][j]);
            }
            System.out.println();
        }
        return arr;
    }
}
