package by.it.hutnik.jd00_01_my_tests.tasks_from_UPIT;

public class Arrays_wij {
    public static void main(String[] args) {
        int [] numbers = {1,2,3};
        int [][] array = {{1,2,3},{4,5},{7,8,9}};

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
    }
}
