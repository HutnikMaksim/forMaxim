package hutnik.maksim.javaForJune.Listing_6.Listing_6_5_OverridingMethod;

class OverridingMethodDemo {
    public static void main(String[] args) {
        Alpha objA = new Alpha("obj A");
        Bravo objB = new Bravo("obj B", 123);
        objA.show();
        objB.show();
    }
}
