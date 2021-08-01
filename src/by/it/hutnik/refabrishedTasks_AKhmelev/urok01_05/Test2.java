package by.it.hutnik.refabrishedTasks_AKhmelev.urok01_05;

import static java.lang.Math.*;

class Test2 {
    public static void main(String[] args) {
        int n = 28, c = 0, count = 0;
        double x, z, a = 0;
        double[] massA = new double[n];
        for(int i = 0; i < n; i++) {
            x = (double) (random() * 3.67) + 5.33;
            z = cbrt(pow(x, 2) + 4.5);
            massA[i] = z;
            c++;
            System.out.printf("A [% 2d] = %.5f\t", i, z);
            if(c % 5 == 0){
                System.out.println();
            }
            if(z > 3.5){
                count++;
                a *= z;
            }
        }
    }
}
