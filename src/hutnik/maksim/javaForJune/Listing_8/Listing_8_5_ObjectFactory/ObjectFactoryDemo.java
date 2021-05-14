package hutnik.maksim.javaForJune.Listing_8.Listing_8_5_ObjectFactory;

class ObjectFactoryDemo {
    static Base createObject(int n){
        if(n == 1) return new Alpha();
        if(n == 2) return new Bravo();
        return new Charlie();
    }

    public static void main(String[] args) {
        Base obj;
        for (int i = 1; i <= 3 ; i++) {
            obj = createObject(i);
            obj.show();
        }
    }
}
