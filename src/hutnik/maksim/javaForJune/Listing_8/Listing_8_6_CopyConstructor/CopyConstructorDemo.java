package hutnik.maksim.javaForJune.Listing_8.Listing_8_6_CopyConstructor;

class CopyConstructorDemo {
    public static void main(String[] args) {
        MyClass A = new MyClass("Жёлтый", 200);
        MyClass B = new MyClass(A);
        A.name = "Красный";
        A.code = 100;
        MyClass C = new MyClass(new MyClass("Зелёный", 300));
        System.out.println("Объект А");
        A.show();
        System.out.println("Объект B");
        B.show();
        System.out.println("Объект C");
        C.show();
    }
}
