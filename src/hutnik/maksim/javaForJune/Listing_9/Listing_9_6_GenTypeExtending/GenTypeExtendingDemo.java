package hutnik.maksim.javaForJune.Listing_9.Listing_9_6_GenTypeExtending;

class GenTypeExtendingDemo {
    public static void main(String[] args) {
        MyClass<Alpha> A = new MyClass<>(new Alpha("Alpha", 123));
        MyClass<Bravo> B = new MyClass<>(new Bravo("Bravo", 456,'B'));
        MyClass<Delta> D = new MyClass<>(new Delta("Delta", 789, 'D', 0.13579));
        A.show();
        B.show();
        D.show();
    }
}
