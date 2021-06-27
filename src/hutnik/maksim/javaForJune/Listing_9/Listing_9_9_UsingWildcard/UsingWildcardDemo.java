package hutnik.maksim.javaForJune.Listing_9.Listing_9_9_UsingWildcard;

class UsingWildcardDemo {
    static <T> void show(MyClass<T> obj){
        System.out.print("Вызов метода show(): ");
        System.out.println(obj.value);
    }
    static void display(MyClass<?> obj){
        System.out.print("Вызов метода display(): ");
        System.out.println(obj.value);
    }

    public static void main(String[] args) {
        MyClass<Integer> A = new MyClass<>(100);
        MyClass B = new MyClass<>('B');
        MyClass<?> C = new MyClass<>("Объект C");
        show(A);
        display(A);
        show(B);
        display(B);
        show(C);
        display(C);
    }
}
