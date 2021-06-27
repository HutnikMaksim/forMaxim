package hutnik.maksim.javaForJune.Listing_9.Listing_9_6_GenTypeExtending;

class Bravo extends Alpha{
    char symbol;
    Bravo(String txt, int n, char s){
        super(txt, n);
        symbol = s;
    }

    @Override
    void show() {
        super.show();
        System.out.println("Символьное поле: " + symbol);
    }
}
