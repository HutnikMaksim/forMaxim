package hutnik.maksim.javaForJune.Listing_7.Listing_7_4_UsingInterfaceVars;

class Alpha implements Base{
    String word;
    Alpha(String txt){
        word = txt;
    }

    @Override
    public void show() {
        System.out.println("Объект класса Alpha");
        System.out.println("Текстовое поле: " + word);
    }
}
