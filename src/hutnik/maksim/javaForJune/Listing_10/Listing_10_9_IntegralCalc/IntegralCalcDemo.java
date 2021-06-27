package hutnik.maksim.javaForJune.Listing_10.Listing_10_9_IntegralCalc;

class IntegralCalcDemo { //TODO ещё раз попытаться понять!!!
    static double integrate(MyFunction obj, double a, double b){
        int n =1000;
        double h = (b - a) / n;
        double s = (obj.f(a) + obj.f(b)) * h / 2;
        for(int i = 1; i <= n - 1; i++) {
            s += h * obj.f(a + i * h);
        }
        return s;
    }

    public static void main(String[] args) {
        System.out.print(integrate((double x) -> {return x * (1 - x);}, 0,1));
        System.out.println(" - точное значение " + 1.0 / 6);
        System.out.print(integrate((double x) -> {return 1 / x;}, 1, 2));
        System.out.println(" - точное значение " + Math.log(2));
        System.out.print(integrate((double x) -> {return Math.exp(-x);}, 0, 10));
        System.out.println(" - точное значение " + (1 - Math.exp(-10)));
    }
}
