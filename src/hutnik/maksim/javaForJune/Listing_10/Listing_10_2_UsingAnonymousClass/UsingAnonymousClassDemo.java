package hutnik.maksim.javaForJune.Listing_10.Listing_10_2_UsingAnonymousClass;

class UsingAnonymousClassDemo {
    public static void main(String[] args) {
        MyNums A = new MyNums() {
            @Override
            public int get(int n) {
                int s = 0;
                for(int i = 1; i <= n; i++) {
                    s += i;
                }
                return s;
            }
        };
        System.out.println("Используем анонимный класс:");
        A.show(10);
        System.out.println("Проверка: " + A.get(10));
        MyNums B = A;
        System.out.println("Новы анонимный класс:");
        A = new MyNums() {
            @Override
            public int get(int n) {
                return n * n;
            }
        };
        System.out.println("Вызов метода show() из A:");
        A.show(10);
        System.out.println("Вызов метода show() из B:");
        B.show(10);
    }
}
