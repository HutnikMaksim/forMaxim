package hutnik.maksim.javaForJune.Listing_10.Listing_10_6_StatMethReference;

class MyClass {
    static void show(){
        System.out.println("Метод класса MyClass");
    }
    static int sum(int n){
        int s =0;
        for(int i = 1; i <= n; i++) {
            s += i;
        }
        return s;
    }
}
