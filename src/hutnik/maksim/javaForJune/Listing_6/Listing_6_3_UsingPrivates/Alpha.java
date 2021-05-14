package hutnik.maksim.javaForJune.Listing_6.Listing_6_3_UsingPrivates;

class Alpha {
    private int code;
    public void set(int code){
        this.code = code;
    }
    public void show(){
        System.out.println("Поле code:" + code);
    }
    Alpha(int code){
        set(code);
    }
}
