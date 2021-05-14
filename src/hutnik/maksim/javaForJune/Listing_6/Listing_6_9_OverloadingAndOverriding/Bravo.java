package hutnik.maksim.javaForJune.Listing_6.Listing_6_9_OverloadingAndOverriding;

class Bravo extends Alpha{
    void show(){
        System.out.println("Класс Bravo");
    }
    void show(int num){
        System.out.println("Число " + num);
    }
}
