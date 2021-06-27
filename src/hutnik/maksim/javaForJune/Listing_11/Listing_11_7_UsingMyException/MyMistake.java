package hutnik.maksim.javaForJune.Listing_11.Listing_11_7_UsingMyException;

class MyMistake extends RuntimeException{
    private int code;
    MyMistake(int n){
        super();
        code = n;
    }
    public String toString(){
        String txt = "Исключение класса MyMistake\n";
        txt += "Код ошибки: " + code + "\n";
        txt += "************************************";
        return txt;
    }
}
