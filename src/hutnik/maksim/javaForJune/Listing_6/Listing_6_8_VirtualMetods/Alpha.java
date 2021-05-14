package hutnik.maksim.javaForJune.Listing_6.Listing_6_8_VirtualMetods;

class Alpha {
    String name;
    void objectCreate(){
        System.out.println("Создан объект класса Alpha");
    }
    void hello(){
        System.out.println("Объект класса Alpha");
    }
    void show(){
        hello();
        System.out.println("Поле name: " + name);
    }
    Alpha(String txt){
        objectCreate();
        name = txt;
    }
}
