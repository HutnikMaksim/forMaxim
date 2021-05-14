package hutnik.maksim.javaForJune.Listing_7.Listing_7_4_UsingInterfaceVars;

class UsingInterfaceVarsDemo {
    public static void main(String[] args) {
        Base ref;
        ref = new Alpha("текст");
        ref.show();
        ref = new Bravo(123);
        ref.show();

    }
}
