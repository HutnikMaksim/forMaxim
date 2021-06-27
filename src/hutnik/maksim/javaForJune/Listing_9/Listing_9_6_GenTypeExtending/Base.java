package hutnik.maksim.javaForJune.Listing_9.Listing_9_6_GenTypeExtending;

class Base {
    String name;
    Base(String txt){
        name = txt;
    }
    void show(){
        System.out.println("Текстовое поле: " + name);
    }
}
