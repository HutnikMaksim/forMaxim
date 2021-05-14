package hutnik.maksim.javaForJune.Listing_6.Listing_6_10_UsingToString;

class MyClass {
    String name;
    int code;
    MyClass(String txt, int num){
        name = txt;
        code = num;
    }
    public String toString(){
        String txt = "Объект класса MyClass \n";
        txt += "Поле name: " + name + "\n";
        txt += "Поле code: " + code + "\n";
        for (int i = 0; i < 28; i++) {
            txt += "-";
        }
        return txt;
    }
}
