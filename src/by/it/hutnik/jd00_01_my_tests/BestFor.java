package by.it.hutnik.jd00_01_my_tests;

public class BestFor {
    public static void main(String[] args) {
        int [] mas = {3,4,6,9,7,9,6,4,3};
        for (int x: mas) {
            if (x <= 6) {
                System.out.println(x + 6);
            } else {
                System.out.println(x - 6);
            }
        }
    }
}
