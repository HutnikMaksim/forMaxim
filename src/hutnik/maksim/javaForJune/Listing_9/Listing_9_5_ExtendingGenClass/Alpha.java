package hutnik.maksim.javaForJune.Listing_9.Listing_9_5_ExtendingGenClass;

class Alpha extends Base<Integer>{
    Alpha(Integer n) {
        super(n);
    }

    @Override
    void show() {
        System.out.print("Целочисленное поле: ");
        super.show();
    }
}
