package hutnik.maksim.javaForJune.Listing_9.Listing_9_8_MoreGenInterface;

class Bravo implements MyMethods<Character>{
    private Character value;

    @Override
    public Character get() {
        return value;
    }

    @Override
    public void set(Character arg) {
        value = arg;
    }

    void show(){
        System.out.println("Символьное поле: " + get());
    }

    Bravo(Character arg){
        value = arg;
    }
}
