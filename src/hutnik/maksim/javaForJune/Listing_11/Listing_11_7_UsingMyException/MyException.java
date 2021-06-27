package hutnik.maksim.javaForJune.Listing_11.Listing_11_7_UsingMyException;

class MyException extends Exception{
    private int code;
    MyException(int n){
        super();
        code = n;
    }
    public String toString(){
        String txt = "Исключение класса MyException\n";
        txt += "Код ошибки: " + code + "\n";
        txt += "----------------------------------";
        return txt;
    }
}
