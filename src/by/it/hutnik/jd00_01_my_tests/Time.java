package by.it.hutnik.jd00_01_my_tests;

class Time {
    public static void main(String[] args) {
        long timeMillis = System.currentTimeMillis();
        int a = 0;
        for (int i = 0; i < 10; i++) {
            double k= Math.random();
            //System.out.println(k);
            if (k>=0 && k<0.33){
                a = 0;
                System.out.println(a);
            } else {
                if (k>=0.33 && k<.67) {
                    a = 1;
                    System.out.println(a);
                } else {
                    a = 2;
                    System.out.println(a);
                }
            }
        }
        System.out.println(System.currentTimeMillis() - timeMillis + "time");
    }
}
