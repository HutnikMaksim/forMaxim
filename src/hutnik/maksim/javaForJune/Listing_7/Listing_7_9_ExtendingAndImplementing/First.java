package hutnik.maksim.javaForJune.Listing_7.Listing_7_9_ExtendingAndImplementing;

interface First {
    String getFirst();

    default void show(){
        System.out.println("Интерфейс First: метод show()");
    }
}
