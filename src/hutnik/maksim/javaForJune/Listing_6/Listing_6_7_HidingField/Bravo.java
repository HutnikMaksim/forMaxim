package hutnik.maksim.javaForJune.Listing_6.Listing_6_7_HidingField;

class Bravo extends Alpha {
    String name;
    void show(){
        System.out.println("Из класса А: " + super.name);
        System.out.println("Из класса В: " + name);
    }
    Bravo(String a, String b){
        super();
        super.name = a;
        name = b;
    }
}
