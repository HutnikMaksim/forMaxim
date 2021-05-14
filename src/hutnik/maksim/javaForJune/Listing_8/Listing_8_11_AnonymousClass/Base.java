package hutnik.maksim.javaForJune.Listing_8.Listing_8_11_AnonymousClass;

abstract class Base {
    private String name;
    Base(String txt){
        name = txt;
    }
    void show(){
        System.out.println("Имя объекта: " + name);
    }
    abstract void hello();
}
