package hutnik.maksim.javaForJune.Listing_6.Listing_6_5_OverridingMethod;

class Bravo extends Alpha{
    int code;
    @Override
    void show(){
        System.out.println("Объетк класса Bravo:");
        System.out.println("Поле name - " + name);
        System.out.println("Поле codde - " + code);
    }
    Bravo(String name, int code){
        super(name);
        this.code = code;
    }
}
