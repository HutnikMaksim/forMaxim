package by.it.hutnik.jd00_01_my_tests;

import java.util.Arrays;

class DeepToStr {
    public static void main(String[] args) {
        int n = 5;
        int[][] massiwDouble = new int[n][n];
        for (int i = 0; i < massiwDouble.length; i++) {
            for (int j = 0; j < massiwDouble[i].length; j++) {
                massiwDouble[i][j] =-n + (int) (Math.random() * (2 * n + 1));
            }
        }
        System.out.print(Arrays.deepToString(massiwDouble));
        System.out.println();
        for (int[] x : massiwDouble){
            System.out.println(Arrays.toString(x));
        }
        System.out.println();
        System.out.println(Arrays.toString(massiwDouble)); //не катит!
    }
}
