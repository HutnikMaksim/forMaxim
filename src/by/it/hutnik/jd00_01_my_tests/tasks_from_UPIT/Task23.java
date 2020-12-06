package by.it.hutnik.jd00_01_my_tests.tasks_from_UPIT;

import java.util.Scanner;

/* Создать двухмерный квадратный массив и заполнить его "бабочкой",
т.е. таким образом:
1 1 1 1 1
0 1 1 1 0
0 0 1 0 0
0 1 1 1 0
1 1 1 1 1
 */
public class Task23 {
    public static void main (String[] args){
        Scanner scanner=new Scanner(System.in);
        int m = scanner.nextInt();

        String [][] arr = new String [m][m];

        for (int i = 0; i < arr.length / 2 + 1; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if ((j < i) || (j >= (arr[i].length - i))) {
                    arr[i][j] = " ";
                } else {
                    arr[i][j] = "0";
                }
            }
        }
        for (int i = arr.length - 1; i >= arr.length / 2; i--) {
            for (int j = 0; j < arr[i].length; j++) {
                if ((j < (arr[i].length - 1 - i)) || (j > i)) {
                    arr[i][j] = " ";
                } else {
                    arr[i][j] = "0";
                }
            }
        }
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }

}
