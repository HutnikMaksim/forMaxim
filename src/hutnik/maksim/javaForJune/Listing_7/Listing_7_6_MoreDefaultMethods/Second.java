package hutnik.maksim.javaForJune.Listing_7.Listing_7_6_MoreDefaultMethods;

interface Second {
    default void hello(){
        System.out.println("Метод из интерфейса Second");
    }
}
