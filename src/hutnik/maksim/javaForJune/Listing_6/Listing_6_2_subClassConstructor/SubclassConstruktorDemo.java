package hutnik.maksim.javaForJune.Listing_6.Listing_6_2_subClassConstructor;

class SubclassConstruktorDemo{
    public static void main(String[] args) {
        Bravo obj;
        obj = new Bravo();
        obj = new Bravo("Красный");
        obj = new Bravo(100);
        obj = new Bravo("Зелёный", 200);
        obj = new Bravo('Y');
        obj = new Bravo("Синий", 300, 'Z');
    }
}
