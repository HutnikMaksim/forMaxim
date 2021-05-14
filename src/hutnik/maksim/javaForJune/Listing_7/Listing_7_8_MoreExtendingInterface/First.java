package hutnik.maksim.javaForJune.Listing_7.Listing_7_8_MoreExtendingInterface;

interface First {
    default void alpha(){
        System.out.println("Интерфейс First: метод alpha()");
    }
}
