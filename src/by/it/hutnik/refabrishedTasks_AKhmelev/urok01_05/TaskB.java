package by.it.hutnik.refabrishedTasks_AKhmelev.urok01_05;
import static java.lang.Math.*;
class TaskB {
    public static void main(String[] args) {
        step1();
        step2();
    }
    private static void step1(){
        double y = 0;
        for(double a = 0; a <= 2; a += 0.2) {
            for(int x = 1; x <= 6; x++) {
                y += pow(7, a) - cos(x);
            }
            System.out.printf("При а=%.2f Cумма y = %g%n", a, y);
            y = 0;
        }
    }

    private static void step2(){
        double a = 0;
        double b = 0;
        for(double x = -5.5; x < 2; x += 0.5) {
            if((x / 2) > -2 && (x / 2) <= -1){
                b = sin(pow(x, 2));
                a = log10(abs(b + 2.74));
                System.out.printf("При х/2 = %.2f a = %.6f%n", x, a);
            } else {
                if((x / 2) > -1 && (x / 2) < 0.2){
                    b = cos(pow(x,2));
                    a = log10(abs(b = 2.74));
                    System.out.printf("При х/2 = %.2f a = %.6f%n", x, a);
                } else {
                    if((x / 2) == 0.2){
                        b = tan(pow(x, 2));
                        a = log10(abs(b + 2.74));
                        System.out.printf("При х/2 = %.2f a = %.6f%n", x, a);
                    } else{
                        System.out.println("Вычисления не определены");
                    }
                }
            }

        }

    }
}
