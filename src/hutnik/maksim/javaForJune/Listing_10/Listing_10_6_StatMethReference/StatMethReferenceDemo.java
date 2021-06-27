package hutnik.maksim.javaForJune.Listing_10.Listing_10_6_StatMethReference;

class StatMethReferenceDemo {
    public static void main(String[] args) {
        MyShow A = MyClass::show;
        MySum B = MyClass::sum;
        MyPrinter P = System.out::println;
        A.myshow();
        P.myprint("Сумма чисел: " + B.mysum(10));
    }
}
