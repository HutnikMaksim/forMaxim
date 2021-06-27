package hutnik.maksim.javaForJune.Listing_9.Listing_9_8_MoreGenInterface;

class Alpha implements MyMethods<Integer>{
    private Integer value;

    @Override
    public Integer get() {
        return value;
    }

    @Override
    public void set(Integer arg) {
        value = arg;
    }

    void show(){
        System.out.println("Цлочисленное поле: " + get());
    }

    Alpha(Integer arg){
        value = arg;
    }
}
