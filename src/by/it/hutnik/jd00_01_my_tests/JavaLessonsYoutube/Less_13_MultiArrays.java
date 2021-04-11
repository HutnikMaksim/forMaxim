package by.it.hutnik.jd00_01_my_tests.JavaLessonsYoutube;

class Less_13_MultiArrays {
    public static void main(String[] args) {
        int[][] array = new int[9][4];
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = (int)(Math.random() * 9 + 1);
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
    }
}
