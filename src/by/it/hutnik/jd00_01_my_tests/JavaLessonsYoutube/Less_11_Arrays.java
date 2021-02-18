package by.it.hutnik.jd00_01_my_tests.JavaLessonsYoutube;

public class Less_11_Arrays {
    public static void main(String[] args) {
        int [] array = new int[5];
        for (int i = 0; i < array.length; i++) {
            array[i] = i * 10;
            //System.out.println(array[i]);
        }
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
        int [] array2 = new int[]{1, 2, 3, 4, 5};
        for (int i = 0; i < array2.length; i++) {
            System.out.println(array2[i]);
        }
    }
}
