package by.it.hutnik.refabrishedTasks_AKhmelev.urok01_05;

/* */
import static java.lang.Math.*;

class TaskA {
    public static void main(String[] args) {
        step1();
        step2();
        step3();
    }
    private static void step1(){
        double a = 756.13;
        double x = 0.3;
        double z;
        double p1,p2,p3;
        p1 = pow(x, 2);
        p1 += PI / 6;
        p1 = pow(p1, 5);
        p1 = cos(p1);
        p2 = pow(a, 3);
        p2 *= x;
        p2 = sqrt(p2);
        p3 = 1.12 * x;
        p3 = a - p3;
        p3 /= 4;
        p3 = log(p3);
        z = p1 - p2 - p3;
        System.out.println(z);
        z = (cos(pow(pow(x, 2) + (PI / 6), 5))) - (sqrt(x * (pow(a, 3)))) - (log((a - 1.12 * x) / 4));
        System.out.println(z);
    }
    private static void step2(){
        double a = 1.21;
        double b = 0.371;
        double y;
        y = (tan(pow(a + b, 2))) - (cbrt(a + 1.5)) + (a * pow(b, 5)) - (b / log(pow(a, 2)));
        System.out.println(y);
    }
    private static void step3(){
        double x = 12.1;
        double da = 3.75;
        double f;
        for(double a = -5; a <= 12; a += da) {
            f = exp(a * x) - (3.45 * a);
            System.out.printf("Параметр цикла = %5.2f результат f = %g%n", a, f);
            //System.out.println("Параметр цикла: " + a + " результат: " + f);
        }
    }
}
