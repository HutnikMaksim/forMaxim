package by.it.hutnik.jd00_01_my_tests.JavaLessonsYoutube;

class Less_17_MetodsParameters {
    public static void main(String[] args) {
        Detals detals = new Detals();
        detals.type = "HOUSE";
        detals.name = "FAMILY";
        detals.setSize("MIDLHOUSE", 30, 45);
        detals.presentation();
    }
}
class Detals{
    String name;
    String type;
    String value;
    int fasad;
    int stena;
    void setSize(String s, int a, int b){
        value = s;
        fasad = a;
        stena = b;
    }
    void presentation(){
        System.out.println("Your choice " + type + " type " + name + " his size is " + value +
                           " " + fasad + "x" + stena + " meters");
    }
}
