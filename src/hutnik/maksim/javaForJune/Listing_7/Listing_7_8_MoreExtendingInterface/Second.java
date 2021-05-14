package hutnik.maksim.javaForJune.Listing_7.Listing_7_8_MoreExtendingInterface;

interface Second extends First{
    @Override
    default void alpha() {
        First.super.alpha();
        System.out.println("Интерфейс Bravo: метод alpha()");
    }
    default void bravo(){
        System.out.println("Интерфейс Bravo: метод bravo()");
    }
}
