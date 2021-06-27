package hutnik.maksim.javaForJune.Listing_10.Listing_10_1_UsingLambda;

interface MyNums {
    default void show(int n){
        System.out.println("Аргумент: " + n);
        System.out.println("Результат: " + gen(n));
    }
    int gen(int n);
}
