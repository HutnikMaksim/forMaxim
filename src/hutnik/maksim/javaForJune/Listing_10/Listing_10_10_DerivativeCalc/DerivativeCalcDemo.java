package hutnik.maksim.javaForJune.Listing_10.Listing_10_10_DerivativeCalc;

class DerivativeCalcDemo { //TODO Разобраться, что это за хрень?!
    static MyFunction Derivative(MyFunction ref){
        double dx = 1e-5;
        return (double x) -> {return (ref.f(x + dx) - ref.f(x)) / dx;};
    }

    public static void main(String[] args) {
        MyFunction A = Derivative((double x) -> {return x * (3 - x);});
        MyFunction B = Derivative((double x) -> {return x * Math.exp(-x);});
        System.out.println("Производная для первой функции");
        System.out.println("Вычислено:\tТочно:");
        for(double i = 0; i <= 5; i++) {
            System.out.printf("%8.5f\t%8.5f\n", A.f(i), (3 - 2 * i));
        }
        System.out.println("Производная для второй функции");
        System.out.println("Вычислено:\tТочно:");
        for(double i = 0; i <= 5; i++) {
            System.out.printf("%8.5f\t%8.5f\n", B.f(i), Math.exp(-i) * (1 - i));
        }
    }
}
