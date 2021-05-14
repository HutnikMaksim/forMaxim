package hutnik.maksim.javaForJune.Listing_8.Listing_8_6_CopyConstructor;

class Base {
    String name;
    Base(String txt){
        name = txt;
    }
    Base(Base obj){
        name = obj.name;
    }
}
