package hutnik.maksim.javaForJune.Listing_9.Listing_9_1_UsingGenClass;

class UsingGenClassDemo {
    public static void main(String[] args) {
        MyClass<Integer> A = new MyClass<>(100);
        MyClass<Character> B = new MyClass<>('B');
        MyClass<String> C = new MyClass<>("Зелёный");
        A.show();
        B.show();
        C.show();
    }
}
