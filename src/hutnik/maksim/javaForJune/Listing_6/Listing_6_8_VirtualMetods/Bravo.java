package hutnik.maksim.javaForJune.Listing_6.Listing_6_8_VirtualMetods;

class Bravo extends Alpha{
    void objectCreate(){
        System.out.println("Сщздан объект класса Bravo");
    }
    void hello(){
        System.out.println("Объект класса Bravo");
    }
    Bravo(String txt){
        super(txt);
    }
}
