package by.it.hutnik.jd00_01_my_tests.JavaLessonsYoutube;

class Less_22_Final {
    public static void main(String[] args) {
        final int MAX = 50;
        double x = MAX / Test.NUMERO;
        System.out.println(x);
    }
}
class Test{
    public static final double NUMERO = 3.1415;

}
