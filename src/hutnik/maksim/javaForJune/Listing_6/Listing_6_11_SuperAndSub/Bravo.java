package hutnik.maksim.javaForJune.Listing_6.Listing_6_11_SuperAndSub;

class Bravo extends Alpha{
    int code;
    void show(){
        String txt = "Объект класса Bravo \n";
        txt += "Поле name: " + name + "\n";
        txt += "Поле code: " + code + "\n";
        for (int i = 0; i < 25; i++) {
            txt += "-";
        }
        System.out.println(txt);
    }
}
