package hutnik.maksim.javaForJune.Listing_10.Listing_10_11_LambdaAsField;

class MyClass {
    private MyInterface ref;
    MyClass(MyInterface mi){
        set(mi);
    }
    void set(MyInterface mi){
        ref =mi;
    }
    int get(int n){
        return ref.getNumber(n);
    }
}
