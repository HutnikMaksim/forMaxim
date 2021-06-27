package hutnik.maksim.javaForJune.Listing_9.Listing_9_5_ExtendingGenClass;

class Charlie extends Base<Character>{
    Charlie(Character c){
        super(c);
    }

    @Override
    void show() {
        System.out.print("Символьное поле: ");
        super.show();
    }
}
