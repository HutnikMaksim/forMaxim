package hutnik.maksim.javaForJune.privates_Demo;

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
