package hutnik.maksim.javaForJune.Listing_7.Listing_7_8_MoreExtendingInterface;

class MyClass implements First, Second {
    @Override
    public void bravo() {
        Second.super.bravo();
        System.out.println("Класс MyClass: метод bravo()");
    }
}
