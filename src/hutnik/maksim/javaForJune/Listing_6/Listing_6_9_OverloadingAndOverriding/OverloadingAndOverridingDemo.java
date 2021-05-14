package hutnik.maksim.javaForJune.Listing_6.Listing_6_9_OverloadingAndOverriding;

class OverloadingAndOverridingDemo {
    public static void main(String[] args) {
        Alpha objA = new Alpha();
        objA.show();
        objA.show("Объект objA");
        Bravo objB = new Bravo();
        objB.show();
        objB.show("Объект objB");
        objB.show(123);
    }
}
