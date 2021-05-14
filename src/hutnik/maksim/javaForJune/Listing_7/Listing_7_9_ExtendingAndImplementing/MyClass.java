package hutnik.maksim.javaForJune.Listing_7.Listing_7_9_ExtendingAndImplementing;

class MyClass extends Base implements First, Second{

    @Override
    public String getFirst() {
        return "Интерфейс First";
    }

    @Override
    public String getSecond() {
        return "Интерфейс Second";
    }

    @Override
    public void show() {
        System.out.println("Мы используем:");
        System.out.println(getFirst());
        System.out.println(getSecond());
        System.out.println(getBase());
        First.super.show();
        Second.super.show();
        super.show();
    }
}
