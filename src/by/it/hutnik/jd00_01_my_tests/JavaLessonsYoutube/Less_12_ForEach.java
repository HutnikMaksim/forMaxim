package by.it.hutnik.jd00_01_my_tests.JavaLessonsYoutube;

public class Less_12_ForEach {
    public static void main(String[] args) {
        int [] array = new int [10];
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 7) + 1;
        }
        for (int arr: array) {
            arr += 10 % 3;
            System.out.println(arr);
        }
        String[] s = new String[7];
        for (int i = 0; i < s.length; i++) {
            s[i] = "Test " + i;
            System.out.println(s[i]);
        }

    }
}
