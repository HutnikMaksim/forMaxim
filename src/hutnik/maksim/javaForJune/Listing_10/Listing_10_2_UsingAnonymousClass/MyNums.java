package hutnik.maksim.javaForJune.Listing_10.Listing_10_2_UsingAnonymousClass;

interface MyNums {
    default void show(int n){
        System.out.println("Аргумент: " + n);
        System.out.println("Результат: " + get(n));
    }
    int get(int n);
}
