package hutnik.maksim.javaForJune.Listing_7.Listing_7_7_ExtendingInterface;

interface First {
    default void alpha(){
        System.out.println("Интерфейс First: метод alpha()");
    }
    default void bravo(){
        System.out.println("Интерфейс First: метод bravo()");
    }
    default void charlie(){
        System.out.println("Интерфейс First: метод charlie()");
    }
    void delta();
}
