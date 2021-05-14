package hutnik.maksim.javaForJune.Listing_7.Listing_7_7_ExtendingInterface;

interface Second extends First{
    void bravo();
    default void charlie(){
        System.out.println("Интерфейс Second: метод charlie()");
    }
    void echo();
}
