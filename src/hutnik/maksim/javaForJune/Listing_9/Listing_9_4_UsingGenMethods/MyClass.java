package hutnik.maksim.javaForJune.Listing_9.Listing_9_4_UsingGenMethods;

class MyClass {
    String name;
    <X> void show(X arg){
        System.out.println(name + ": " + arg);
    }
    MyClass(String txt){
        name = txt;
    }
}
