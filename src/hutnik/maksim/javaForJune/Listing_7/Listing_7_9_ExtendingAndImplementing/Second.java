package hutnik.maksim.javaForJune.Listing_7.Listing_7_9_ExtendingAndImplementing;

interface Second {
    String getSecond();

    default void show(){
        System.out.println("Интерфейс Second: метод show()");
    }
}
