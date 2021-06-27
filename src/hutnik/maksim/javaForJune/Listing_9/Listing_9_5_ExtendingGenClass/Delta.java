package hutnik.maksim.javaForJune.Listing_9.Listing_9_5_ExtendingGenClass;

class Delta extends Base{
    Delta(Object data) {
        super(data);
    }
    @Override
    void show() {
        System.out.print("Объектовое поле: ");
        super.show();
    }
}
