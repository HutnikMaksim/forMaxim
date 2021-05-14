package hutnik.maksim.javaForJune.Listing_8.Listing_8_2_SwapFields;

class SwapFieldsDemo {
    static void swap(MyClass A, MyClass B){
        System.out.println("Выполняется метод swap ()");
        System.out.println("Объект A: " + A.number);
        System.out.println("Объект B: " + B.number);
        int number = B.number;
        B.number = A.number;
        A.number = number;
        System.out.println("Объект A: " + A.number);
        System.out.println("Объект B: " + B.number);
        System.out.println("Завершено выполнение метода swap()");
    }

    public static void main(String[] args) {
        MyClass A = new MyClass(100);
        MyClass B = new MyClass(200);
        System.out.println("До вызова метода swap(): A.number = " + A.number + " и B.number " + B.number);
        swap(A, B);
        System.out.println("После вызова метода swap(): A.number = " + A.number + " и B.number = " + B.number);

    }
}
