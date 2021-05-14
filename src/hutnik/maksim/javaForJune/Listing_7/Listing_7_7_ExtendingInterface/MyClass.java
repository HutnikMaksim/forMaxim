package hutnik.maksim.javaForJune.Listing_7.Listing_7_7_ExtendingInterface;

class MyClass implements Second {

    @Override
    public void delta() {
        System.out.println("Класс MyClass: метод delta()");
    }

    @Override
    public void bravo() {
        System.out.println("Класс MyClass: метод bravo()");
    }

    @Override
    public void echo() {
        System.out.println("Класс MyClass: метод echo()");
    }
}
