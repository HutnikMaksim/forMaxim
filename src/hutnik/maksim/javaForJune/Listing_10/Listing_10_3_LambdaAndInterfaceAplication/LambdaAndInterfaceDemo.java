package hutnik.maksim.javaForJune.Listing_10.Listing_10_3_LambdaAndInterfaceAplication;

class LambdaAndInterfaceDemo {
    public static void main(String[] args) {
        Alpha A = () -> System.out.println("Используем лямбда-выражение из интерфейса А");
        A.showA();
        Bravo B = () -> System.out.println("Используем лямбда-выражение из интерфейса В");
        B.showB();
        Charlie C = A::showA;
        C.showC();
    }
}
