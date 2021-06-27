package hutnik.maksim.javaForJune.Listing_10.Listing_10_1_UsingLambda;

class UsingLambdaDemo {
    public static void main(String[] args) {
        MyNums A = (int n) -> {
            int k, s = 0;
            for (int i = 1; i <= n; i++) {
                s += i;
            }
            return s;
        };
        System.out.println("Используем лямбда-выражение: ");
        A.show(10);
        System.out.println("Проверка: " + A.gen(10));
        MyNums B = A;
        System.out.println("Новое лямбда-выражение: ");
        A = n -> n * n;
        System.out.println("Вызов метода show() из A: ");
        A.show(10);
        System.out.println("Вызов метода show() из B: ");
        B.show(10);
    }
}
