package hutnik.maksim.javaForJune.Listing_7.Listing_7_5_UsingDefaultMetod;

class UsingDefaultMetodDemo {
    public static void main(String[] args) {
        Base ref;
        Alpha objAlpha = new Alpha();
        objAlpha.hello();
        objAlpha.show("объектная переменная objAlpha");
        ref = objAlpha;
        ref.show("интерфейсная переменная ref");
        Bravo objBravo = new Bravo();
        objBravo.hello();
        objBravo.show("объектная переменная objBravo");
        ref = objBravo;
        ref.show("интерфейсная переменная ref");
    }
}
