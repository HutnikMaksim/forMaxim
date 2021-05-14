package hutnik.maksim.javaForJune.Listing_6.Listing_6_5_OverridingMethod;

class Alpha {
    String name;
    void show(){
        System.out.println("Объект класса Alpha:");
        System.out.println("Поле name - " + name);
    }
    Alpha(String name){
        this.name = name;
    }
}
