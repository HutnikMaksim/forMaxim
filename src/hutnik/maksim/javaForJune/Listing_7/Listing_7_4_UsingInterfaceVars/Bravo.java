package hutnik.maksim.javaForJune.Listing_7.Listing_7_4_UsingInterfaceVars;

class Bravo implements Base{
    int number;
    Bravo(int n){
        number = n;
    }

    @Override
    public void show() {
        System.out.println("Объект класса Bravo");
        System.out.println("Число: " + number);
    }
}
