package hutnik.maksim.javaForJune.Listing_9.ZZZMyMiniClasses;

class MyClass {
    private int number;
    int get(){
        return number;
    }
    void set(int n){
        number = n;
    }
    void show(){
        System.out.println("Chren " + number);
    }
    MyClass(int n){
        number = n;
    }
}
