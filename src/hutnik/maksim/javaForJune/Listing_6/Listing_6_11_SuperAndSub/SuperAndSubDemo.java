package hutnik.maksim.javaForJune.Listing_6.Listing_6_11_SuperAndSub;

class SuperAndSubDemo {
    public static void main(String[] args) {
        Alpha objAlpha = new Alpha();
        objAlpha.name = "alpha";
        objAlpha.show();
        Bravo objBravo = new Bravo();
        objBravo.name = "bravo";
        objBravo.code = 123;
        objBravo.show();
        objAlpha = objBravo;
        objAlpha.name = "charlie";
        objAlpha.show();
        objBravo.show();
    }
}
