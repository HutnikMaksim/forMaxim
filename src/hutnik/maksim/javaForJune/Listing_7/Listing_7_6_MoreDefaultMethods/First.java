package hutnik.maksim.javaForJune.Listing_7.Listing_7_6_MoreDefaultMethods;

interface First {
    default void hello(){
        System.out.println("Метод из интерфейса First");
    }
}
