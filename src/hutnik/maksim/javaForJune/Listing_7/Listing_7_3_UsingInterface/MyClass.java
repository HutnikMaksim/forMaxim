package hutnik.maksim.javaForJune.Listing_7.Listing_7_3_UsingInterface;

class MyClass implements First, Second{
    @Override
    public void hello() {
        System.out.println("Метод из интерфейса First");
    }

    @Override
    public void hi() {
        System.out.println("Метод из интерфейса Second");
    }
}
