package hutnik.maksim.javaForJune.Listing_6.Listing_6_11_SuperAndSub;

class Alpha {
    String name;
    void show(){
        String txt = "Объект класса Alpha \n";
        txt += "Поле name: " + name + "\n";
        for (int i = 0; i < 25; i++) {
            txt += "-";
        }
        System.out.println(txt);
    }
}
