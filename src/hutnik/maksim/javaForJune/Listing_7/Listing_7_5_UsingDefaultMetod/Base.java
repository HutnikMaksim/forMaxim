package hutnik.maksim.javaForJune.Listing_7.Listing_7_5_UsingDefaultMetod;

interface Base {
    default void show(String txt){
        System.out.println("Интерфейс Base: " + txt);
    }
    void hello();
}
