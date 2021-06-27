package hutnik.maksim.javaForJune.Listing_9.Listing_9_6_GenTypeExtending;

class Alpha extends Base{
    int number;
    Alpha(String txt, int n){
        super(txt);
        number = n;
    }

    @Override
    void show() {
        super.show();
        System.out.println("Целочисленное поле: " + number);
    }
}
