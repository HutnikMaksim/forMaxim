package hutnik.maksim.javaForJune.Listing_7.Listing_7_5_UsingDefaultMetod;

class Alpha implements Base{

    @Override
    public void show(String txt) {
        System.out.println("Класс Alpha: " + txt);
    }

    @Override
    public void hello() {
        System.out.println("Объект класса Alpha");
    }
}
