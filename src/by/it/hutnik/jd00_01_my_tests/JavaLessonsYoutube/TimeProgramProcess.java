package by.it.hutnik.jd00_01_my_tests.JavaLessonsYoutube;

public class TimeProgramProcess {
    public static void main(String[] args) {
        long before = System.currentTimeMillis();
        for (int i = 0; i < 100; i++) {
            for (int j = 0; j < 100; j++) {
                System.out.print("x");
            }
            System.out.println();
        }
        long after = System.currentTimeMillis();
        System.out.println("Time = " + (after - before));
    }
    
    
}
