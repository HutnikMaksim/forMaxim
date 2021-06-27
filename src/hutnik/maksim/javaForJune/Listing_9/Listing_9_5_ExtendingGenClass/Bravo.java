package hutnik.maksim.javaForJune.Listing_9.Listing_9_5_ExtendingGenClass;

class Bravo extends Base<String>{
    Bravo(String txt){
        super(txt);
    }

    @Override
    void show() {
        System.out.print("Строковое поле: ");
        super.show();
    }
}
