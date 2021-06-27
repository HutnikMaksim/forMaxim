package hutnik.maksim.javaForJune.Listing_9.Listing_9_4_UsingGenMethods;

class UsingGenMethodsDemo {
    public static void main(String[] args) {
        MyClass A = new MyClass("Объект А");
        MyClass B = new MyClass("Объект B");
        A.show(123);
        A.show("\"Alpha\"");
        A.show('A');
        B.show(456);
        B.show("\"Bravo\"");
        B.show('B');
    }
}
