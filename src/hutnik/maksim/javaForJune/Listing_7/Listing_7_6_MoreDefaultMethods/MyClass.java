package hutnik.maksim.javaForJune.Listing_7.Listing_7_6_MoreDefaultMethods;

class MyClass implements First, Second{

    @Override
    public void hello() {
        First.super.hello();
        Second.super.hello();
    }
}
