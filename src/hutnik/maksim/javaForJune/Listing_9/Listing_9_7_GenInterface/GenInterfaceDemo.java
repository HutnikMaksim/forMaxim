package hutnik.maksim.javaForJune.Listing_9.Listing_9_7_GenInterface;

class GenInterfaceDemo {
    public static void main(String[] args) {
        MyMethods ref;
        MyClass<Integer> A = new MyClass<>(123);
        MyClass<Character> B = new MyClass<>('A');
        A.show();
        ref = A;
        ref.set(456);
        A.show();
        B.show();
        ref = B;
        ref.set('B');
        B.show();
    }
}
